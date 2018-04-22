package org.seasar.doma.it.sqlfile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
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
import org.seasar.doma.jdbc.BatchResult;

public class SqlFileBatchDeleteTest {

  @ClassRule public static Container container = new Container();

  @Rule public Sandbox sandbox = new Sandbox(container);

  @Test
  public void test() throws Exception {
    EmployeeDao dao = container.get(EmployeeDaoImpl::new);
    Employee employee = new Employee();
    employee.setEmployeeId(1);
    employee.setVersion(1);
    Employee employee2 = new Employee();
    employee2.setEmployeeId(2);
    employee2.setVersion(1);
    int[] result = dao.deleteBySqlFile(Arrays.asList(employee, employee2));
    assertEquals(2, result.length);
    assertEquals(1, result[0]);
    assertEquals(1, result[1]);

    employee = dao.selectById(1);
    assertNull(employee);
    employee = dao.selectById(2);
    assertNull(employee);
  }

  @Test
  public void testImmutable() throws Exception {
    PersonDao dao = container.get(PersonDaoImpl::new);
    Person person = new Person(1, null, null, null, null, null, null, null, 1);
    Person person2 = new Person(2, null, null, null, null, null, null, null, 1);
    BatchResult<Person> result = dao.deleteBySqlFile(Arrays.asList(person, person2));
    int[] counts = result.getCounts();
    assertEquals(2, counts.length);
    assertEquals(1, counts[0]);
    assertEquals(1, counts[1]);
    person = result.getEntities().get(0);
    assertEquals("null_preD_postD", person.getEmployeeName());
    person2 = result.getEntities().get(1);
    assertEquals("null_preD_postD", person2.getEmployeeName());

    person = dao.selectById(1);
    assertNull(person);
    person2 = dao.selectById(2);
    assertNull(person);
  }
}
