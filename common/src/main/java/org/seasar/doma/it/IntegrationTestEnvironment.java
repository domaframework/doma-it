package org.seasar.doma.it;

import static org.junit.jupiter.api.extension.ConditionEvaluationResult.disabled;
import static org.junit.jupiter.api.extension.ConditionEvaluationResult.enabled;
import static org.junit.platform.commons.util.AnnotationUtils.findAnnotation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.seasar.doma.it.dao.ScriptDao;
import org.seasar.doma.it.dao.ScriptDaoImpl;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Db2Dialect;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.H2Dialect;
import org.seasar.doma.jdbc.dialect.HsqldbDialect;
import org.seasar.doma.jdbc.dialect.MssqlDialect;
import org.seasar.doma.jdbc.dialect.MysqlDialect;
import org.seasar.doma.jdbc.dialect.OracleDialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;
import org.seasar.doma.jdbc.dialect.SqliteDialect;

public class IntegrationTestEnvironment
    implements BeforeAllCallback,
        BeforeTestExecutionCallback,
        AfterTestExecutionCallback,
        AfterAllCallback,
        ParameterResolver,
        ExecutionCondition {

  private static final Logger logger = Logger.getLogger(IntegrationTestEnvironment.class.getName());

  private static final Pattern jdbcUrlPattern = Pattern.compile("^jdbc:([^:]*):.*");

  private static transient boolean imported;

  private final Dbms dbms;

  private final AppConfig config;

  private final ScriptDao scriptDao;

  public IntegrationTestEnvironment() {
    String url = getProperty("url", "jdbc:h2:mem:doma_it;DB_CLOSE_DELAY=-1");
    logger.log(Level.INFO, "url=" + url);
    String user = getProperty("user", "sa");
    logger.log(Level.INFO, "user=" + user);
    String password = getProperty("password", "");
    dbms = determineDbms(url);
    Dialect dialect = createDialect(dbms);
    config = new AppConfig(dialect, dbms, url, user, password);
    scriptDao = new ScriptDaoImpl(config);
  }

  private static String getProperty(String key, String defaultValue) {
    String value = System.getProperty(key);
    if (value != null && value.length() > 0) {
      return value;
    }
    return defaultValue;
  }

  private static Dbms determineDbms(String url) {
    Matcher matcher = jdbcUrlPattern.matcher(url);
    if (matcher.matches()) {
      return Dbms.valueOf(matcher.group(1).toUpperCase());
    }
    throw new IllegalArgumentException("url: " + url);
  }

  private static Dialect createDialect(Dbms dbms) {
    switch (dbms) {
      case H2:
        return new H2Dialect();
      case HSQLDB:
        return new HsqldbDialect();
      case SQLITE:
        return new SqliteDialect();
      case MYSQL:
        return new MysqlDialect();
      case POSTGRESQL:
        return new PostgresDialect();
      case SQLSERVER:
        return new MssqlDialect();
      case ORACLE:
        return new OracleDialect();
      case DB2:
        return new Db2Dialect();
    }
    throw new IllegalArgumentException("unreachable: " + dbms);
  }

  @Override
  public void beforeAll(ExtensionContext context) {
    if (imported) {
      return;
    }
    config.getTransactionManager().required(scriptDao::create);
    imported = true;
  }

  @Override
  public void beforeTestExecution(ExtensionContext context) {
    config.getLocalTransaction().begin();
  }

  @Override
  public void afterTestExecution(ExtensionContext context) {
    config.getLocalTransaction().rollback();
  }

  @Override
  public void afterAll(ExtensionContext context) {}

  @Override
  public boolean supportsParameter(
      ParameterContext parameterContext, ExtensionContext extensionContext)
      throws ParameterResolutionException {
    return parameterContext.getParameter().getType() == Config.class;
  }

  @Override
  public Object resolveParameter(
      ParameterContext parameterContext, ExtensionContext extensionContext)
      throws ParameterResolutionException {
    return config;
  }

  @Override
  public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
    Optional<Run> optional = findAnnotation(context.getElement(), Run.class);
    if (!optional.isPresent()) {
      return enabled("@Run is not present");
    }
    Run run = optional.get();
    if (isRunnable(run, dbms)) {
      return enabled("runnable: " + dbms);
    }
    return disabled("not runnable");
  }

  private boolean isRunnable(Run run, Dbms dbms) {
    List<Dbms> onlyIf = Arrays.asList(run.onlyIf());
    List<Dbms> unless = Arrays.asList(run.unless());

    if (onlyIf.size() > 0) {
      return onlyIf.contains(dbms);
    } else {
      if (unless.size() > 0) {
        return !unless.contains(dbms);
      } else {
        return true;
      }
    }
  }
}
