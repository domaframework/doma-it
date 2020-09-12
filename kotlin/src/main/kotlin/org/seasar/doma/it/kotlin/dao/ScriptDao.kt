package org.seasar.doma.it.kotlin.dao

import org.seasar.doma.Dao
import org.seasar.doma.Script
import org.seasar.doma.jdbc.SqlLogType

@Dao
interface ScriptDao {
    @Script(sqlLog = SqlLogType.NONE)
    fun create()

    @Script(haltOnError = false, sqlLog = SqlLogType.NONE)
    fun drop()
}
