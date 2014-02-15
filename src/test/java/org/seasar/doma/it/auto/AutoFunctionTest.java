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
import static org.seasar.doma.it.dao.DepartmentDao.get;
import static org.seasar.doma.it.dao.FunctionDao.get;

import java.sql.Time;
import java.util.List;
import java.util.Map;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.it.Container;
import org.seasar.doma.it.Dbms;
import org.seasar.doma.it.RunOn;
import org.seasar.doma.it.Sandbox;
import org.seasar.doma.it.dao.DepartmentDao;
import org.seasar.doma.it.dao.FunctionDao;
import org.seasar.doma.it.entity.Department;
import org.seasar.doma.it.entity.Employee;
import org.seasar.doma.jdbc.ResultMappingException;

@SuppressWarnings("unused")
@RunOn(ignore = { Dbms.HSQLDB, Dbms.H2, Dbms.DB2, Dbms.SQLITE })
public class AutoFunctionTest {

    @ClassRule
    public static Container container = new Container();

    @Rule
    public Sandbox sandbox = new Sandbox(container);

    @Test
    public void testNoParam() throws Exception {
        FunctionDao dao = container.get(FunctionDao::get);
        Integer result = dao.func_none_param();
        assertEquals(new Integer(10), result);
    }

    @Test
    public void testOneParam() throws Exception {
        FunctionDao dao = container.get(FunctionDao::get);
        Integer result = dao.func_simpletype_param(new Integer(10));
        assertEquals(new Integer(20), result);
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
        Integer result = dao.func_dto_param(new Integer(10), new Integer(20));
        assertEquals(new Integer(30), result);
    }

    @Test
    public void testTwoParams_time() throws Exception {
        FunctionDao dao = container.get(FunctionDao::get);
        Time result = dao.func_dto_time_param(Time.valueOf("12:34:56"),
                new Integer(20));
        assertEquals(Time.valueOf("12:34:56"), result);
    }

    @Test
    // @Prerequisite("#ENV not in {'mysql', 'mssql2008'}")
    public void testResultSet() throws Exception {
        FunctionDao dao = container.get(FunctionDao::get);
        List<Employee> result = dao.func_resultset(new Integer(1));
        assertEquals(13, result.size());
    }

    @Test
    // @Prerequisite("#ENV not in {'mysql', 'mssql2008'}")
    public void testResultSet_check() throws Exception {
        FunctionDao dao = container.get(FunctionDao::get);
        try {
            dao.func_resultset_check(new Integer(1));
            fail();
        } catch (ResultMappingException ignored) {
            System.err.println(ignored);
        }
    }

    @Test
    // @Prerequisite("#ENV not in {'mysql', 'mssql2008'}")
    public void testResultSet_nocheck() throws Exception {
        FunctionDao dao = container.get(FunctionDao::get);
        List<Employee> result = dao.func_resultset_nocheck(new Integer(1));
        assertEquals(13, result.size());
    }

    @Test
    // @Prerequisite("#ENV not in {'mysql', 'mssql2008'}")
    public void testResultSet_map() throws Exception {
        FunctionDao dao = container.get(FunctionDao::get);
        List<Map<String, Object>> result = dao
                .func_resultset_map(new Integer(1));
        assertEquals(13, result.size());
    }

    @Test
    // @Prerequisite("#ENV not in {'mysql', 'mssql2008'}")
    public void testResultSetAndUpdate() throws Exception {
        FunctionDao dao = container.get(FunctionDao::get);
        List<Employee> result = dao.func_resultset_update(new Integer(1));
        assertEquals(13, result.size());
        DepartmentDao departmentDao = container.get(DepartmentDao::get);
        Department department = departmentDao.selectById(new Integer(1));
        assertEquals("HOGE", department.getDepartmentName());
    }

    @Test
    // @Prerequisite("#ENV not in {'mysql', 'mssql2008'}")
    public void testResultSetAndUpdate2() throws Exception {
        FunctionDao dao = container.get(FunctionDao::get);
        List<Employee> result = dao.func_resultset_update2(new Integer(1));
        assertEquals(13, result.size());
        DepartmentDao departmentDao = container.get(DepartmentDao::get);
        Department department = departmentDao.selectById(new Integer(1));
        assertEquals("HOGE", department.getDepartmentName());
    }

}
