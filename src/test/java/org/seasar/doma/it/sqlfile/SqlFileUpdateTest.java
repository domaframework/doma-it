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
package org.seasar.doma.it.sqlfile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.it.Container;
import org.seasar.doma.it.Sandbox;
import org.seasar.doma.it.dao.DepartmentDao;
import org.seasar.doma.it.dao.DeptDao;
import org.seasar.doma.it.dao.StaffDao;
import org.seasar.doma.it.domain.Identity;
import org.seasar.doma.it.domain.Salary;
import org.seasar.doma.it.entity.Department;
import org.seasar.doma.it.entity.Dept;
import org.seasar.doma.it.entity.Staff;
import org.seasar.doma.it.entity.StaffInfo;
import org.seasar.doma.jdbc.OptimisticLockException;
import org.seasar.doma.jdbc.Result;

public class SqlFileUpdateTest {

  @ClassRule public static Container container = new Container();

  @Rule public Sandbox sandbox = new Sandbox(container);

  @Test
  public void test() throws Exception {
    DepartmentDao dao = container.get(DepartmentDao::get);
    Department department = new Department();
    department.setDepartmentId(new Identity<Department>(1));
    department.setDepartmentNo(1);
    department.setDepartmentName("hoge");
    department.setVersion(1);
    int result = dao.updateBySqlFile(department);
    assertEquals(1, result);

    department = dao.selectById(1);
    assertEquals(Integer.valueOf(1), department.getDepartmentId().getValue());
    assertEquals("hoge", department.getDepartmentName());
    assertEquals(Integer.valueOf(2), department.getVersion());
  }

  @Test
  public void testPopulates() throws Exception {
    DepartmentDao dao = container.get(DepartmentDao::get);
    Department department = new Department();
    department.setDepartmentId(new Identity<Department>(1));
    department.setDepartmentNo(1);
    department.setDepartmentName("hoge");
    department.setVersion(1);
    int result = dao.updateBySqlFileWithPopulate(department);
    assertEquals(1, result);

    department = dao.selectById(1);
    assertEquals(Integer.valueOf(1), department.getDepartmentId().getValue());
    assertEquals("hoge", department.getDepartmentName());
    assertEquals(Integer.valueOf(2), department.getVersion());
  }

  @Test
  public void testImmutable() throws Exception {
    DeptDao dao = container.get(DeptDao::get);
    Dept dept = new Dept(new Identity<Dept>(1), 1, "hoge", null, 1);
    Result<Dept> result = dao.updateBySqlFile(dept);
    assertEquals(1, result.getCount());
    dept = result.getEntity();
    assertEquals("hoge_preU_postU", dept.getDepartmentName());

    dept = dao.selectById(1);
    assertEquals(Integer.valueOf(1), dept.getDepartmentId().getValue());
    assertEquals("hoge_preU", dept.getDepartmentName());
    assertEquals(Integer.valueOf(2), dept.getVersion());
  }

  @Test
  public void testOptimisticLockException() throws Exception {
    DepartmentDao dao = container.get(DepartmentDao::get);
    Department department1 = dao.selectById(1);
    department1.setDepartmentName("hoge");
    Department department2 = dao.selectById(1);
    department2.setDepartmentName("foo");
    dao.updateBySqlFile(department1);
    try {
      dao.updateBySqlFile(department2);
      fail();
    } catch (OptimisticLockException expected) {
    }
  }

  @Test
  public void testSuppressOptimisticLockException() throws Exception {
    DepartmentDao dao = container.get(DepartmentDao::get);
    Department department1 = dao.selectById(1);
    department1.setDepartmentName("hoge");
    Department department2 = dao.selectById(1);
    department2.setDepartmentName("foo");
    dao.updateBySqlFile(department1);
    int rows = dao.updateBySqlFile_ignoreVersion(department2);
    assertEquals(0, rows);
  }

  @Test
  public void test_nonEntity() throws Exception {
    DepartmentDao dao = container.get(DepartmentDao::get);
    Department department = new Department();
    department.setDepartmentId(new Identity<Department>(1));
    department.setDepartmentNo(1);
    department.setDepartmentName("hoge");
    department.setVersion(1);
    int result = dao.updateBySqlFile_nonEntity(new Identity<Department>(1), 1, "hoge", null, 1);
    assertEquals(1, result);

    department = dao.selectById(1);
    assertEquals(Integer.valueOf(1), department.getDepartmentId().getValue());
    assertEquals("hoge", department.getDepartmentName());
    assertEquals(Integer.valueOf(2), department.getVersion());
  }

  @Test
  public void testEmbeddable() throws Exception {
    StaffDao dao = container.get(StaffDao::get);
    Staff staff = dao.selectById(1);
    staff.employeeName = "hoge";
    staff.staffInfo = new StaffInfo(staff.staffInfo.hiredate, new Salary("5000"));
    int result = dao.updateBySqlFile(staff);
    assertEquals(1, result);
    assertEquals(2, staff.version.intValue());
    staff = dao.selectById(1);
    assertEquals(5000L, staff.staffInfo.salary.getValue().longValue());
  }
}
