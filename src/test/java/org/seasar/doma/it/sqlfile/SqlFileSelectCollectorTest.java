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
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.it.Container;
import org.seasar.doma.it.Sandbox;
import org.seasar.doma.it.dao.EmployeeDao;
import org.seasar.doma.it.domain.Identity;
import org.seasar.doma.it.entity.Department;
import org.seasar.doma.it.entity.Employee;

public class SqlFileSelectCollectorTest {

    @ClassRule
    public static Container container = new Container();

    @Rule
    public Sandbox sandbox = new Sandbox(container);

    @Test
    public void testCollectAll() throws Exception {
        EmployeeDao dao = container.get(EmployeeDao::get);
        Long count = dao.collectAll(Collectors.counting());
        assertEquals(new Long(14), count);
    }

    @Test
    public void testCollectAll2() throws Exception {
        EmployeeDao dao = container.get(EmployeeDao::get);
        Map<Identity<Department>, List<Employee>> group = dao
                .collectAll(Collectors.groupingBy(Employee::getDepartmentId));
        System.out.println(group);
    }

    //
    // @Test
    // public void testStreamBySalary() throws Exception {
    // EmployeeDao dao = container.get(EmployeeDao::get);
    // Long count = dao.streamBySalary(new BigDecimal(2000),
    // stream -> stream.count());
    // assertEquals(new Long(6), count);
    // }
    //
    // @Test
    // public void testEntity() throws Exception {
    // EmployeeDao dao = container.get(EmployeeDao::get);
    // long count = dao.streamAll(s -> s.count());
    // assertEquals(14L, count);
    // }
    //
    // @Test
    // public void testEntity_limitOffset() throws Exception {
    // EmployeeDao dao = container.get(EmployeeDao::get);
    // long count = dao.streamAll(s -> s.count(), SelectOptions.get().limit(5)
    // .offset(3));
    // assertEquals(5L, count);
    // }
    //
    // @Test
    // public void testDomain() throws Exception {
    // EmployeeDao dao = container.get(EmployeeDao::get);
    // BigDecimal total = dao.streamAllSalary(s -> s.filter(Objects::nonNull)
    // .reduce(BigDecimal.ZERO, (x, y) -> x.add(y)));
    // assertTrue(new BigDecimal("29025").compareTo(total) == 0);
    // }
    //
    // @Test
    // public void testDomain_limitOffset() throws Exception {
    // EmployeeDao dao = container.get(EmployeeDao::get);
    // BigDecimal total = dao.streamAllSalary(s -> s.filter(Objects::nonNull)
    // .reduce(BigDecimal.ZERO, (x, y) -> x.add(y)), SelectOptions
    // .get().limit(5).offset(3));
    // assertTrue(new BigDecimal("6900").compareTo(total) == 0);
    // }
    //
    // @Test
    // public void testMap() throws Exception {
    // EmployeeDao dao = container.get(EmployeeDao::get);
    // long count = dao.selectAllAsMapList(s -> s.count());
    // assertEquals(14L, count);
    // }
    //
    // @Test
    // public void testMap_limitOffset() throws Exception {
    // EmployeeDao dao = container.get(EmployeeDao::get);
    // long count = dao.selectAllAsMapList(s -> s.count(), SelectOptions.get()
    // .limit(5).offset(3));
    // assertEquals(5L, count);
    // }
}
