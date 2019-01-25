package org.seasar.doma.it.dao;

import org.seasar.doma.AccessLevel;
import org.seasar.doma.Dao;
import org.seasar.doma.Script;
import org.seasar.doma.jdbc.Config;

@Dao(accessLevel = AccessLevel.PACKAGE)
public interface ScriptDao {

  static ScriptDao get(Config config) {
    return new ScriptDaoImpl(config);
  }

  @Script
  void create();

  @Script(haltOnError = false)
  void drop();
}
