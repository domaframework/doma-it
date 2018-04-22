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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.it.Container;
import org.seasar.doma.it.Dbms;
import org.seasar.doma.it.Run;
import org.seasar.doma.it.Sandbox;
import org.seasar.doma.it.dao.EmployeeDao;
import org.seasar.doma.it.dao.EmployeeDaoImpl;
import org.seasar.doma.it.entity.Employee;
import org.seasar.doma.jdbc.JdbcException;
import org.seasar.doma.jdbc.SelectOptions;
import org.seasar.doma.message.Message;

public class SqlFileSelectForUpdateTest {

    @ClassRule
    public static Container container = new Container();

    @Rule
    public Sandbox sandbox = new Sandbox(container);

    @Test
    @Run(unless = { Dbms.H2, Dbms.POSTGRESQL, Dbms.ORACLE, Dbms.MYSQL,
            Dbms.DB2, Dbms.SQLSERVER })
    public void testUnsupported() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        try {
            dao.selectById(1, SelectOptions.get().forUpdate());
            fail();
        } catch (JdbcException expected) {
            assertEquals(Message.DOMA2023, expected.getMessageResource());
        }
    }

    @Test
    @Run(unless = { Dbms.HSQLDB, Dbms.SQLITE })
    public void testForUpdate() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        Employee employee = dao.selectById(1, SelectOptions.get().forUpdate());
        assertNotNull(employee);
    }

    @Test
    @Run(unless = { Dbms.HSQLDB, Dbms.H2, Dbms.POSTGRESQL, Dbms.MYSQL,
            Dbms.DB2, Dbms.SQLSERVER, Dbms.SQLITE })
    public void testForUpdateWithColumns() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        Employee employee = dao.selectById(1,
                SelectOptions.get().forUpdate("employee_name", "address_id"));
        assertNotNull(employee);
    }

    @Test
    @Run(unless = { Dbms.HSQLDB, Dbms.H2, Dbms.ORACLE, Dbms.MYSQL, Dbms.DB2,
            Dbms.SQLSERVER, Dbms.SQLITE })
    public void testForUpdateWithTables() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        Employee employee = dao.selectById(1,
                SelectOptions.get().forUpdate("employee"));
        assertNotNull(employee);
    }

    @Test
    @Run(unless = { Dbms.HSQLDB, Dbms.H2, Dbms.POSTGRESQL, Dbms.MYSQL,
            Dbms.DB2, Dbms.SQLITE })
    public void testForUpdateNowait() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        Employee employee = dao.selectById(1, SelectOptions.get()
                .forUpdateNowait());
        assertNotNull(employee);
    }

    @Test
    @Run(unless = { Dbms.HSQLDB, Dbms.H2, Dbms.POSTGRESQL, Dbms.MYSQL,
            Dbms.DB2, Dbms.SQLSERVER, Dbms.SQLITE })
    public void testForUpdateNowaitWithColumns() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        Employee employee = dao.selectById(1, SelectOptions.get()
                .forUpdateNowait("employee_name", "address_id"));
        assertNotNull(employee);
    }

    @Test
    @Run(unless = { Dbms.HSQLDB, Dbms.H2, Dbms.POSTGRESQL, Dbms.MYSQL,
            Dbms.DB2, Dbms.SQLSERVER, Dbms.SQLITE })
    public void testForUpdateWait() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        Employee employee = dao.selectById(1, SelectOptions.get()
                .forUpdateWait(10));
        assertNotNull(employee);
    }

    @Test
    @Run(unless = { Dbms.HSQLDB, Dbms.H2, Dbms.POSTGRESQL, Dbms.MYSQL,
            Dbms.DB2, Dbms.SQLSERVER, Dbms.SQLITE })
    public void testForUpdateWaitWithColumns() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        Employee employee = dao.selectById(1, SelectOptions.get()
                .forUpdateWait(10, "employee_name", "address_id"));
        assertNotNull(employee);
    }
}
