package org.seasar.doma.it.sqlfile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.it.Container;
import org.seasar.doma.it.Sandbox;
import org.seasar.doma.it.dao.EmployeeDao;
import org.seasar.doma.it.dao.EmployeeDaoImpl;
import org.seasar.doma.it.dao.PersonDao;
import org.seasar.doma.it.dao.PersonDaoImpl;
import org.seasar.doma.it.entity.Employee;
import org.seasar.doma.it.entity.Person;
import org.seasar.doma.jdbc.Result;

public class SqlFileDeleteTest {

    @ClassRule
    public static Container container = new Container();

    @Rule
    public Sandbox sandbox = new Sandbox(container);

    @Test
    public void test() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        Employee employee = new Employee();
        employee.setEmployeeId(1);
        employee.setVersion(1);
        int result = dao.deleteBySqlFile(employee);
        assertEquals(1, result);

        employee = dao.selectById(1);
        assertNull(employee);
    }

    @Test
    public void testImmutable() throws Exception {
        PersonDao dao = container.get(config -> new PersonDaoImpl(config));
        Person person = new Person(1, null, null, null, null, null, null, null,
                1);
        Result<Person> result = dao.deleteBySqlFile(person);
        assertEquals(1, result.getCount());
        person = result.getEntity();
        assertEquals("null_preD_postD", person.getEmployeeName());

        person = dao.selectById(1);
        assertNull(person);
    }
}
