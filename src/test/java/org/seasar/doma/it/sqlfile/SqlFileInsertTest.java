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

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.it.Container;
import org.seasar.doma.it.Sandbox;
import org.seasar.doma.it.dao.DepartmentDao;
import org.seasar.doma.it.dao.DepartmentDaoImpl;
import org.seasar.doma.it.dao.DeptDao;
import org.seasar.doma.it.dao.DeptDaoImpl;
import org.seasar.doma.it.entity.Department;
import org.seasar.doma.it.entity.Dept;
import org.seasar.doma.it.holder.Identity;
import org.seasar.doma.jdbc.Result;

public class SqlFileInsertTest {

    @ClassRule
    public static Container container = new Container();

    @Rule
    public Sandbox sandbox = new Sandbox(container);

    @Test
    public void test() throws Exception {
        DepartmentDao dao = container.get(config -> new DepartmentDaoImpl(config));
        Department department = new Department();
        department.setDepartmentId(new Identity<>(99));
        department.setDepartmentNo(99);
        department.setDepartmentName("hoge");
        int result = dao.insertBySqlFile(department);
        assertEquals(1, result);

        department = dao.selectById(99);
        assertEquals(Integer.valueOf(99),
                department.getDepartmentId().getValue());
        assertEquals(Integer.valueOf(99), department.getDepartmentNo());
    }

    @Test
    public void testImmutable() throws Exception {
        DeptDao dao = container.get(config -> new DeptDaoImpl(config));
        Dept dept = new Dept(new Identity<>(99), 99, "hoge", null, null);
        Result<Dept> result = dao.insertBySqlFile(dept);
        assertEquals(1, result.getCount());
        dept = result.getEntity();
        assertEquals("hoge_preI_postI", dept.getDepartmentName());

        dept = dao.selectById(99);
        assertEquals(Integer.valueOf(99), dept.getDepartmentId().getValue());
        assertEquals(Integer.valueOf(99), dept.getDepartmentNo());
        assertEquals("hoge_preI", dept.getDepartmentName());
    }
}
