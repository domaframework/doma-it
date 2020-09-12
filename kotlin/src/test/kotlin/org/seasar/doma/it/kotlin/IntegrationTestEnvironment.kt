package org.seasar.doma.it.kotlin

import org.junit.jupiter.api.extension.AfterAllCallback
import org.junit.jupiter.api.extension.AfterTestExecutionCallback
import org.junit.jupiter.api.extension.BeforeAllCallback
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback
import org.junit.jupiter.api.extension.ConditionEvaluationResult
import org.junit.jupiter.api.extension.ExecutionCondition
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.ParameterContext
import org.junit.jupiter.api.extension.ParameterResolutionException
import org.junit.jupiter.api.extension.ParameterResolver
import org.junit.platform.commons.util.AnnotationUtils
import org.seasar.doma.it.kotlin.dao.ScriptDao
import org.seasar.doma.it.kotlin.dao.ScriptDaoImpl
import org.seasar.doma.jdbc.Config
import org.seasar.doma.jdbc.dialect.Db2Dialect
import org.seasar.doma.jdbc.dialect.Dialect
import org.seasar.doma.jdbc.dialect.H2Dialect
import org.seasar.doma.jdbc.dialect.HsqldbDialect
import org.seasar.doma.jdbc.dialect.MssqlDialect
import org.seasar.doma.jdbc.dialect.MysqlDialect
import org.seasar.doma.jdbc.dialect.OracleDialect
import org.seasar.doma.jdbc.dialect.PostgresDialect
import org.seasar.doma.jdbc.dialect.SqliteDialect
import java.util.Optional
import java.util.logging.Level
import java.util.logging.Logger
import java.util.regex.Pattern

class IntegrationTestEnvironment : BeforeAllCallback, BeforeTestExecutionCallback, AfterTestExecutionCallback, AfterAllCallback, ParameterResolver, ExecutionCondition {
    private val dbms: Dbms
    private val config: AppConfig
    private val scriptDao: ScriptDao

    init {
        val url = getProperty("url", "jdbc:h2:mem:doma_it;DB_CLOSE_DELAY=-1")
        logger.log(Level.INFO, "url=$url")
        val user = getProperty("user", "sa")
        logger.log(Level.INFO, "user=$user")
        val password = getProperty("password", "")
        dbms = determineDbms(url)
        val dialect = createDialect(dbms)
        config = AppConfig(dialect, dbms, url, user, password)
        scriptDao = ScriptDaoImpl(config)
    }

    @Throws(Exception::class)
    override fun beforeAll(context: ExtensionContext) {
        if (imported) {
            return
        }
        config
            .getTransactionManager()
            .required(
                Runnable { scriptDao.create() }
            )
        imported = true
    }

    @Throws(Exception::class)
    override fun beforeTestExecution(context: ExtensionContext) {
        config.localTransaction.begin()
    }

    @Throws(Exception::class)
    override fun afterTestExecution(context: ExtensionContext) {
        config.localTransaction.rollback()
    }

    @Throws(Exception::class)
    override fun afterAll(context: ExtensionContext) {
    }

    @Throws(ParameterResolutionException::class)
    override fun supportsParameter(
        parameterContext: ParameterContext,
        extensionContext: ExtensionContext
    ): Boolean {
        return parameterContext.parameter.type == Config::class.java
    }

    @Throws(ParameterResolutionException::class)
    override fun resolveParameter(
        parameterContext: ParameterContext,
        extensionContext: ExtensionContext
    ): Any {
        return config
    }

    override fun evaluateExecutionCondition(context: ExtensionContext): ConditionEvaluationResult {
        val optional: Optional<Run> = AnnotationUtils.findAnnotation<Run>(context.element, Run::class.java)
        if (!optional.isPresent()) {
            return ConditionEvaluationResult.enabled("@Run is not present")
        }
        val run: Run = optional.get()
        return if (isRunnable(run, dbms)) {
            ConditionEvaluationResult.enabled("runnable: $dbms")
        } else ConditionEvaluationResult.disabled("not runnable")
    }

    private fun isRunnable(run: Run, dbms: Dbms): Boolean {
        val onlyIf: List<Dbms> = listOf(*run.onlyIf)
        val unless: List<Dbms> = listOf(*run.unless)
        return if (onlyIf.size > 0) {
            onlyIf.contains(dbms)
        } else {
            if (unless.size > 0) {
                !unless.contains(dbms)
            } else {
                true
            }
        }
    }

    companion object {
        private val logger = Logger.getLogger(IntegrationTestEnvironment::class.java.name)
        private val jdbcUrlPattern = Pattern.compile("^jdbc:([^:]*):.*")

        @Transient
        private var imported = false
        private fun getProperty(key: String, defaultValue: String): String {
            val value = System.getProperty(key)
            return if (value != null && value.length > 0) {
                value
            } else defaultValue
        }

        private fun determineDbms(url: String): Dbms {
            val matcher = jdbcUrlPattern.matcher(url)
            if (matcher.matches()) {
                return Dbms.valueOf(matcher.group(1).toUpperCase())
            }
            throw IllegalArgumentException("url: $url")
        }

        private fun createDialect(dbms: Dbms): Dialect {
            return when (dbms) {
                Dbms.H2 -> H2Dialect()
                Dbms.HSQLDB -> HsqldbDialect()
                Dbms.SQLITE -> SqliteDialect()
                Dbms.MYSQL -> MysqlDialect()
                Dbms.POSTGRESQL -> PostgresDialect()
                Dbms.SQLSERVER -> MssqlDialect()
                Dbms.ORACLE -> OracleDialect()
                Dbms.DB2 -> Db2Dialect()
            }
        }
    }
}
