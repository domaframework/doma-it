package org.seasar.doma.it.other;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.it.Container;
import org.seasar.doma.it.Sandbox;
import org.seasar.doma.it.dao.EmployeeDao;
import org.seasar.doma.it.domain.Hiredate;
import org.seasar.doma.it.domain.HiredateImpl;
import org.seasar.doma.it.entity.Employee;

public class ExternalDomainTest {

    @ClassRule
    public static Container container = new Container();

    @Rule
    public Sandbox sandbox = new Sandbox(container);

    @Test
    public void testSelectBySingleExternalDomain() throws Exception {
        EmployeeDao dao = container.get(EmployeeDao::get);
        List<Employee> employee = dao
                .selectByHiredate(new HiredateImpl(Date.valueOf("1980-12-17")));
        assertEquals(1, employee.size());
    }

    @Test
    public void testSelectByExternalDomainList() throws Exception {
        EmployeeDao dao = container.get(EmployeeDao::get);
        Hiredate date = new HiredateImpl(Date.valueOf("1980-12-17"));
        List<Employee> employee = dao.selectByHiredates(Arrays.asList(date));
        assertEquals(1, employee.size());
    }

}
