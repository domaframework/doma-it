package org.seasar.doma.it.jep355;

import java.util.List;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.Sql;

@Dao
public interface TextBlockDao {

  @Sql("""
        select
          /*%expand*/*
        from
          employee
        """)
  @Select
  List<Employee> selectAll();

  @Sql(
      """
        select
          /*%expand*/*
        from
          employee
        where
          employee_id = /*id*/0
        """)
  @Select
  Employee selectById(Integer id);
}
