package org.seasar.doma.it.jep384;

import java.util.List;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.Sql;

@Dao
public interface RecordDao {
  @Sql("""
        select
          /*%expand*/*
         from
          department
        """)
  @Select
  List<Department> selectAll();

  @Sql(
      """
        select
          /*%expand*/*
        from
          department
        where
          department_id = /*id*/0
        """)
  @Select
  Department selectById(Integer id);
}
