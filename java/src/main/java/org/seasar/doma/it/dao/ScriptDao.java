package org.seasar.doma.it.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Script;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.SqlLogType;

@Dao
public interface ScriptDao {

  static ScriptDao get(Config config) {
    return new ScriptDaoImpl(config);
  }

  @Script(sqlLog = SqlLogType.NONE)
  void create();

  @Script(haltOnError = false, sqlLog = SqlLogType.NONE)
  void drop();
}
