/*
 * Copyright 2004-2009 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.seasar.doma.it.auto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.sql.Time;
import java.util.List;
import java.util.Map;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.it.Container;
import org.seasar.doma.it.Dbms;
import org.seasar.doma.it.Run;
import org.seasar.doma.it.Sandbox;
import org.seasar.doma.it.dao.DepartmentDao;
import org.seasar.doma.it.dao.FunctionDao;
import org.seasar.doma.it.entity.Department;
import org.seasar.doma.it.entity.Employee;
import org.seasar.doma.jdbc.ResultMappingException;

@Run(unless = {Dbms.HSQLDB, Dbms.H2, Dbms.DB2, Dbms.SQLITE})
public class AutoFunctionTest {

  @ClassRule public static Container container = new Container();

  @Rule public Sandbox sandbox = new Sandbox(container);

  @Test
  public void testNoParam() throws Exception {
    FunctionDao dao = container.get(FunctionDao::get);
    Integer result = dao.func_none_param();
    assertEquals(Integer.valueOf(10), result);
  }

  @Test
  public void testOneParam() throws Exception {
    FunctionDao dao = container.get(FunctionDao::get);
    Integer result = dao.func_simpletype_param(Integer.valueOf(10));
    assertEquals(Integer.valueOf(20), result);
  }

  @Test
  public void testOneParam_time() throws Exception {
    FunctionDao dao = container.get(FunctionDao::get);
    Time result = dao.func_simpletype_time_param(Time.valueOf("12:34:56"));
    assertEquals(Time.valueOf("12:34:56"), result);
  }

  @Test
  public void testTwoParams() throws Exception {
    FunctionDao dao = container.get(FunctionDao::get);
    Integer result = dao.func_dto_param(Integer.valueOf(10), Integer.valueOf(20));
    assertEquals(Integer.valueOf(30), result);
  }

  @Test
  public void testTwoParams_time() throws Exception {
    FunctionDao dao = container.get(FunctionDao::get);
    Time result = dao.func_dto_time_param(Time.valueOf("12:34:56"), Integer.valueOf(20));
    assertEquals(Time.valueOf("12:34:56"), result);
  }

  @Test
  @Run(unless = {Dbms.MYSQL, Dbms.SQLSERVER})
  public void testResultSet() throws Exception {
    FunctionDao dao = container.get(FunctionDao::get);
    List<Employee> result = dao.func_resultset(Integer.valueOf(1));
    assertEquals(13, result.size());
  }

  @Test
  @Run(unless = {Dbms.MYSQL, Dbms.SQLSERVER})
  public void testResultSet_check() throws Exception {
    FunctionDao dao = container.get(FunctionDao::get);
    try {
      dao.func_resultset_check(Integer.valueOf(1));
      fail();
    } catch (ResultMappingException ignored) {
      System.err.println(ignored);
    }
  }

  @Test
  @Run(unless = {Dbms.MYSQL, Dbms.SQLSERVER})
  public void testResultSet_nocheck() throws Exception {
    FunctionDao dao = container.get(FunctionDao::get);
    List<Employee> result = dao.func_resultset_nocheck(Integer.valueOf(1));
    assertEquals(13, result.size());
  }

  @Test
  @Run(unless = {Dbms.MYSQL, Dbms.SQLSERVER})
  public void testResultSet_map() throws Exception {
    FunctionDao dao = container.get(FunctionDao::get);
    List<Map<String, Object>> result = dao.func_resultset_map(Integer.valueOf(1));
    assertEquals(13, result.size());
  }

  @Test
  @Run(unless = {Dbms.MYSQL, Dbms.SQLSERVER})
  public void testResultSetAndUpdate() throws Exception {
    FunctionDao dao = container.get(FunctionDao::get);
    List<Employee> result = dao.func_resultset_update(Integer.valueOf(1));
    assertEquals(13, result.size());
    DepartmentDao departmentDao = container.get(DepartmentDao::get);
    Department department = departmentDao.selectById(Integer.valueOf(1));
    assertEquals("HOGE", department.getDepartmentName());
  }

  @Test
  @Run(unless = {Dbms.MYSQL, Dbms.SQLSERVER})
  public void testResultSetAndUpdate2() throws Exception {
    FunctionDao dao = container.get(FunctionDao::get);
    List<Employee> result = dao.func_resultset_update2(Integer.valueOf(1));
    assertEquals(13, result.size());
    DepartmentDao departmentDao = container.get(DepartmentDao::get);
    Department department = departmentDao.selectById(Integer.valueOf(1));
    assertEquals("HOGE", department.getDepartmentName());
  }
}
