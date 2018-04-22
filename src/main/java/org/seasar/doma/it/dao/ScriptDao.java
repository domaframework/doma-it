package org.seasar.doma.it.dao;

import org.seasar.doma.AccessLevel;
import org.seasar.doma.Dao;
import org.seasar.doma.Script;
import org.seasar.doma.jdbc.Config;

@Dao
public interface ScriptDao {

  @Script
    void create();

    @Script(haltOnError = false)
    void drop();
}
