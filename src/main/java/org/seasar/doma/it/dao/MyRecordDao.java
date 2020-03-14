package org.seasar.doma.it.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.it.entity.DeptRecord;
import org.seasar.doma.jdbc.Result;

@Dao
public interface MyRecordDao {

    @Select
    DeptRecord selectById(Integer departmentId);

    @Insert
    Result<DeptRecord> insert(DeptRecord deptRecord);
}
