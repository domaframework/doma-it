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
import java.util.ArrayList;
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
import org.seasar.doma.it.dao.DepartmentDaoImpl;
import org.seasar.doma.it.dao.ProcedureDao;
import org.seasar.doma.it.dao.ProcedureDaoImpl;
import org.seasar.doma.it.entity.Department;
import org.seasar.doma.it.entity.Employee;
import org.seasar.doma.jdbc.Reference;
import org.seasar.doma.jdbc.ResultMappingException;

@Run(unless = {Dbms.HSQLDB, Dbms.H2, Dbms.SQLITE})
public class AutoProcedureTest {

  @ClassRule public static Container container = new Container();

  @Rule public Sandbox sandbox = new Sandbox(container);

  @Test
  public void testNoParam() throws Exception {
    ProcedureDao dao = container.get(ProcedureDaoImpl::new);
    dao.proc_none_param();
  }

  @Test
  public void testOneParam() throws Exception {
    ProcedureDao dao = container.get(ProcedureDaoImpl::new);
    dao.proc_simpletype_param(10);
  }

  @Test
  public void testOneParam_time() throws Exception {
    ProcedureDao dao = container.get(ProcedureDaoImpl::new);
    dao.proc_simpletype_time_param(Time.valueOf("12:34:56"));
  }

  @Test
  public void testIn_InOut_Out() throws Exception {
    ProcedureDao dao = container.get(ProcedureDaoImpl::new);
    Integer param1 = 10;
    Reference<Integer> param2 = new Reference<>(20);
    Reference<Integer> param3 = new Reference<>();
    dao.proc_dto_param(param1, param2, param3);
    assertEquals(Integer.valueOf(10), param1);
    assertEquals(Integer.valueOf(30), param2.get());
    assertEquals(Integer.valueOf(10), param3.get());
  }

  @Test
  public void testIn_InOut_Out_time() throws Exception {
    ProcedureDao dao = container.get(ProcedureDaoImpl::new);
    Time param1 = Time.valueOf("12:34:56");
    Reference<Time> param2 = new Reference<>(Time.valueOf("01:23:45"));
    Reference<Time> param3 = new Reference<>();
    dao.proc_dto_time_param(param1, param2, param3);
    assertEquals(param1, param1);
    assertEquals(param1, param2.get());
    assertEquals(param1, param3.get());
  }

  @Test
  public void testResultSet() throws Exception {
    ProcedureDao dao = container.get(ProcedureDaoImpl::new);
    List<Employee> employees = new ArrayList<>();
    dao.proc_resultset(employees, 1);
    assertEquals(13, employees.size());
  }

  @Test
  public void testResultSet_check() throws Exception {
    ProcedureDao dao = container.get(ProcedureDaoImpl::new);
    List<Employee> employees = new ArrayList<>();
    try {
      dao.proc_resultset_check(employees, 1);
      fail();
    } catch (ResultMappingException ignored) {
      System.err.println(ignored);
    }
  }

  @Test
  public void testResultSet_nocheck() throws Exception {
    ProcedureDao dao = container.get(ProcedureDaoImpl::new);
    List<Employee> employees = new ArrayList<>();
    dao.proc_resultset_nocheck(employees, 1);
    assertEquals(13, employees.size());
  }

  @Test
  public void testResultSet_map() throws Exception {
    ProcedureDao dao = container.get(ProcedureDaoImpl::new);
    List<Map<String, Object>> employees = new ArrayList<>();
    dao.proc_resultset_map(employees, 1);
    assertEquals(13, employees.size());
  }

  @Test
  public void testResultSet_Out() throws Exception {
    ProcedureDao dao = container.get(ProcedureDaoImpl::new);
    List<Employee> employees = new ArrayList<>();
    Reference<Integer> count = new Reference<>();
    dao.proc_resultset_out(employees, 1, count);
    assertEquals(13, employees.size());
    assertEquals(Integer.valueOf(14), count.get());
  }

  @Test
  public void testResultSetAndUpdate() throws Exception {
    ProcedureDao dao = container.get(ProcedureDaoImpl::new);
    List<Employee> employees = new ArrayList<>();
    dao.proc_resultset_update(employees, 1);
    assertEquals(13, employees.size());
    DepartmentDao departmentDao = container.get(DepartmentDaoImpl::new);
    Department department = departmentDao.selectById(1);
    assertEquals("HOGE", department.getDepartmentName());
  }

  @Test
  public void testResultSetAndUpdate2() throws Exception {
    ProcedureDao dao = container.get(ProcedureDaoImpl::new);
    List<Employee> employees = new ArrayList<>();
    dao.proc_resultset_update2(employees, 1);
    assertEquals(13, employees.size());
    DepartmentDao departmentDao = container.get(DepartmentDaoImpl::new);
    Department department = departmentDao.selectById(1);
    assertEquals("HOGE", department.getDepartmentName());
  }

  @Test
  public void testResultSets() throws Exception {
    ProcedureDao dao = container.get(ProcedureDaoImpl::new);
    List<Employee> employees = new ArrayList<>();
    List<Department> departments = new ArrayList<>();
    dao.proc_resultsets(employees, departments, 1, 1);
    assertEquals(13, employees.size());
    assertEquals(3, departments.size());
  }

  @Test
  public void testResultSetAndUpdate_Out() throws Exception {
    ProcedureDao dao = container.get(ProcedureDaoImpl::new);
    List<Employee> employees = new ArrayList<>();
    List<Department> departments = new ArrayList<>();
    Reference<Integer> count = new Reference<>();
    dao.proc_resultsets_updates_out(employees, departments, 1, 1, count);
    assertEquals(13, employees.size());
    assertEquals(3, departments.size());
    assertEquals(Integer.valueOf(14), count.get());
  }
}
