package org.seasar.doma.it.dao;

import java.util.List;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.experimental.Sql;
import org.seasar.doma.it.entity.PhantomEmployee;

@Dao
public interface PhantomEmployeeDao {
  @Sql("select * from employee")
  @Select
  List<PhantomEmployee> selectAll();

  @Sql("select * from employee where employee_id = /* id */0")
  @Select
  PhantomEmployee selectById(int id);

  @Insert
  int insert(PhantomEmployee e);
}
