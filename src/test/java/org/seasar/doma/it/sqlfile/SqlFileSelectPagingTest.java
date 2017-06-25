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

import java.util.List;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.it.Container;
import org.seasar.doma.it.Sandbox;
import org.seasar.doma.it.dao.EmployeeDao;
import org.seasar.doma.it.entity.Employee;
import org.seasar.doma.jdbc.SelectOptions;

public class SqlFileSelectPagingTest {

    @ClassRule
    public static Container container = new Container();

    @Rule
    public Sandbox sandbox = new Sandbox(container);

    @Test
    public void testNoPaging() throws Exception {
        EmployeeDao dao = container.get(EmployeeDao::get);
        List<Employee> employees = dao.selectAll();
        assertEquals(14, employees.size());
    }

    @Test
    public void testLimitOffset() throws Exception {
        EmployeeDao dao = container.get(EmployeeDao::get);
        List<Employee> employees = dao
                .selectAll(SelectOptions.get().limit(5).offset(3));
        assertEquals(5, employees.size());
        assertEquals(Integer.valueOf(4), employees.get(0).getEmployeeId());
        assertEquals(Integer.valueOf(5), employees.get(1).getEmployeeId());
        assertEquals(Integer.valueOf(6), employees.get(2).getEmployeeId());
        assertEquals(Integer.valueOf(7), employees.get(3).getEmployeeId());
        assertEquals(Integer.valueOf(8), employees.get(4).getEmployeeId());
    }

    @Test
    public void testLimitOffset_offsetIsZero() throws Exception {
        EmployeeDao dao = container.get(EmployeeDao::get);
        List<Employee> employees = dao
                .selectAll(SelectOptions.get().limit(5).offset(0));
        assertEquals(5, employees.size());
        assertEquals(Integer.valueOf(1), employees.get(0).getEmployeeId());
        assertEquals(Integer.valueOf(2), employees.get(1).getEmployeeId());
        assertEquals(Integer.valueOf(3), employees.get(2).getEmployeeId());
        assertEquals(Integer.valueOf(4), employees.get(3).getEmployeeId());
        assertEquals(Integer.valueOf(5), employees.get(4).getEmployeeId());
    }

    @Test
    public void testLimitOffset_limitIsZero() throws Exception {
        EmployeeDao dao = container.get(EmployeeDao::get);
        List<Employee> employees = dao
                .selectAll(SelectOptions.get().limit(0).offset(10));
        assertEquals(4, employees.size());
        assertEquals(Integer.valueOf(11), employees.get(0).getEmployeeId());
        assertEquals(Integer.valueOf(12), employees.get(1).getEmployeeId());
        assertEquals(Integer.valueOf(13), employees.get(2).getEmployeeId());
        assertEquals(Integer.valueOf(14), employees.get(3).getEmployeeId());
    }

    @Test
    public void testLimitOnly() throws Exception {
        EmployeeDao dao = container.get(EmployeeDao::get);
        List<Employee> employees = dao.selectAll(SelectOptions.get().limit(5));
        assertEquals(5, employees.size());
        assertEquals(Integer.valueOf(1), employees.get(0).getEmployeeId());
        assertEquals(Integer.valueOf(2), employees.get(1).getEmployeeId());
        assertEquals(Integer.valueOf(3), employees.get(2).getEmployeeId());
        assertEquals(Integer.valueOf(4), employees.get(3).getEmployeeId());
        assertEquals(Integer.valueOf(5), employees.get(4).getEmployeeId());
    }

    @Test
    public void testOffsetOnly() throws Exception {
        EmployeeDao dao = container.get(EmployeeDao::get);
        List<Employee> employees = dao
                .selectAll(SelectOptions.get().offset(10));
        assertEquals(4, employees.size());
        assertEquals(Integer.valueOf(11), employees.get(0).getEmployeeId());
        assertEquals(Integer.valueOf(12), employees.get(1).getEmployeeId());
        assertEquals(Integer.valueOf(13), employees.get(2).getEmployeeId());
        assertEquals(Integer.valueOf(14), employees.get(3).getEmployeeId());
    }

}
