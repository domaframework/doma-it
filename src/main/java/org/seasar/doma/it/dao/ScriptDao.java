package org.seasar.doma.it.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Script;

@Dao
public interface ScriptDao {

  @Script
  void create();

  @Script(haltOnError = false)
  void drop();
}
