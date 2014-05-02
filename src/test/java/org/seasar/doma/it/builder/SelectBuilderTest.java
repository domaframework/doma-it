package org.seasar.doma.it.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.MapKeyNamingType;
import org.seasar.doma.it.Container;
import org.seasar.doma.it.Sandbox;
import org.seasar.doma.it.dao.EmployeeDao;
import org.seasar.doma.it.entity.Employee;
import org.seasar.doma.jdbc.builder.SelectBuilder;

public class SelectBuilderTest {

    @ClassRule
    public static Container container = new Container();

    @Rule
    public Sandbox sandbox = new Sandbox(container);

    @Test
    public void testGetScalarSingleResult() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_NAME from EMPLOYEE");
        builder.sql("where");
        builder.sql("EMPLOYEE_ID = ").param(int.class, 1);
        String name = builder.getScalarSingleResult(String.class);
        assertEquals("SMITH", name);
    }

    @Test
    public void testGetScalarSingleResult_null() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_NAME from EMPLOYEE");
        builder.sql("where");
        builder.sql("EMPLOYEE_ID = ").param(int.class, 99);
        String name = builder.getScalarSingleResult(String.class);
        assertNull(name);
    }

    @Test
    public void testGetOptionalScalarSingleResult() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_NAME from EMPLOYEE");
        builder.sql("where");
        builder.sql("EMPLOYEE_ID = ").param(int.class, 1);
        Optional<String> name = builder
                .getOptionalScalarSingleResult(String.class);
        assertEquals("SMITH", name.get());
    }

    @Test
    public void testGetOptionalScalarSingleResult_null() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_NAME from EMPLOYEE");
        builder.sql("where");
        builder.sql("EMPLOYEE_ID = ").param(int.class, 99);
        Optional<String> name = builder
                .getOptionalScalarSingleResult(String.class);
        assertFalse(name.isPresent());
    }

    @Test
    public void testGetScalarResultList() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_NAME from EMPLOYEE");
        List<String> list = builder.getScalarResultList(String.class);
        assertEquals(14, list.size());
        assertEquals("SMITH", list.get(0));
    }

    @Test
    public void testGetScalarResultList_null() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select null from EMPLOYEE");
        List<String> list = builder.getScalarResultList(String.class);
        assertEquals(14, list.size());
        assertEquals(null, list.get(0));
    }

    @Test
    public void testGetOptionalScalarResultList() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_NAME from EMPLOYEE");
        List<Optional<String>> list = builder
                .getOptionalScalarResultList(String.class);
        assertEquals(14, list.size());
        assertEquals("SMITH", list.get(0).get());
    }

    @Test
    public void testGetOptionalScalarResultList_null() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select null from EMPLOYEE");
        List<Optional<String>> list = builder
                .getOptionalScalarResultList(String.class);
        assertEquals(14, list.size());
        assertFalse(list.get(0).isPresent());
    }

    @Test
    public void testStreamScalar() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_NAME from EMPLOYEE");
        builder.sql("where");
        builder.sql("EMPLOYEE_ID = ").param(int.class, 1);
        Optional<String> name = builder.streamScalar(String.class,
                stream -> stream.findFirst());
        assertEquals("SMITH", name.get());
    }

    @Test
    public void testStreamScalar_null() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select null from EMPLOYEE");
        builder.sql("where");
        builder.sql("EMPLOYEE_ID = ").param(int.class, 99);
        Optional<String> name = builder.streamScalar(String.class,
                stream -> stream.findFirst());
        assertFalse(name.isPresent());
    }

    @Test
    public void testStreamOptionalScalar() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_NAME from EMPLOYEE");
        builder.sql("where");
        builder.sql("EMPLOYEE_ID = ").param(int.class, 1);
        Optional<Optional<String>> name = builder.streamOptionalScalar(
                String.class, stream -> stream.findFirst());
        assertEquals("SMITH", name.get().get());
    }

    @Test
    public void testStreamOptionalScalar_null() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select null from EMPLOYEE");
        builder.sql("where");
        builder.sql("EMPLOYEE_ID = ").param(int.class, 1);
        Optional<Optional<String>> name = builder.streamOptionalScalar(
                String.class, stream -> stream.findFirst());
        assertFalse(name.get().isPresent());
    }

    @Test
    public void testGetMapSingleResult() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_ID, EMPLOYEE_NAME, HIREDATE from EMPLOYEE");
        builder.sql("where");
        builder.sql("EMPLOYEE_ID = ").param(int.class, 1);
        Map<String, Object> employee = builder
                .getMapSingleResult(MapKeyNamingType.CAMEL_CASE);
        assertNotNull(employee);
        assertNotNull(employee.get("employeeId"));
        assertNotNull(employee.get("employeeName"));
        assertNotNull(employee.get("hiredate"));
    }

    @Test
    public void testGetMapSingleResult_null() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_ID, EMPLOYEE_NAME, HIREDATE from EMPLOYEE");
        builder.sql("where");
        builder.sql("EMPLOYEE_ID = ").param(int.class, 99);
        Map<String, Object> employee = builder
                .getMapSingleResult(MapKeyNamingType.CAMEL_CASE);
        assertNull(employee);
    }

    @Test
    public void testGetOptionalMapSingleResult() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_ID, EMPLOYEE_NAME, HIREDATE from EMPLOYEE");
        builder.sql("where");
        builder.sql("EMPLOYEE_ID = ").param(int.class, 1);
        Optional<Map<String, Object>> employee = builder
                .getOptionalMapSingleResult(MapKeyNamingType.CAMEL_CASE);
        assertNotNull(employee);
        assertEquals("SMITH", employee.get().get("employeeName"));
    }

    @Test
    public void testGetOptionalMapSingleResult_null() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_ID, EMPLOYEE_NAME, HIREDATE from EMPLOYEE");
        builder.sql("where");
        builder.sql("EMPLOYEE_ID = ").param(int.class, 99);
        Optional<Map<String, Object>> employee = builder
                .getOptionalMapSingleResult(MapKeyNamingType.CAMEL_CASE);
        assertNotNull(employee);
        assertFalse(employee.isPresent());
    }

    @Test
    public void testGetMapResultList() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_ID, EMPLOYEE_NAME, HIREDATE from EMPLOYEE");
        List<Map<String, Object>> employees = builder
                .getMapResultList(MapKeyNamingType.CAMEL_CASE);
        assertNotNull(employees);
        assertEquals(14, employees.size());
    }

    @Test
    public void testStreamMap() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_ID, EMPLOYEE_NAME, HIREDATE from EMPLOYEE");
        Optional<Map<String, Object>> result = builder.streamMap(
                MapKeyNamingType.CAMEL_CASE, stream -> stream.findFirst());
        assertEquals("SMITH", result.get().get("employeeName"));
    }

    @Test
    public void testGetEntitySingleResult() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_ID, EMPLOYEE_NAME, HIREDATE from EMPLOYEE");
        builder.sql("where");
        builder.sql("EMPLOYEE_ID = ").param(int.class, 1);
        Employee employee = builder.getEntitySingleResult(Employee.class);
        assertNotNull(employee);
        assertEquals("SMITH", employee.getEmployeeName());
    }

    @Test
    public void testGetEntitySingleResult_null() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_ID, EMPLOYEE_NAME, HIREDATE from EMPLOYEE");
        builder.sql("where");
        builder.sql("EMPLOYEE_ID = ").param(int.class, 99);
        Employee employee = builder.getEntitySingleResult(Employee.class);
        assertNull(employee);
    }

    @Test
    public void testGetOptionalEntitySingleResult() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_ID, EMPLOYEE_NAME, HIREDATE from EMPLOYEE");
        builder.sql("where");
        builder.sql("EMPLOYEE_ID = ").param(int.class, 1);
        Optional<Employee> employee = builder
                .getOptionalEntitySingleResult(Employee.class);
        assertNotNull(employee);
        assertEquals("SMITH", employee.get().getEmployeeName());
    }

    @Test
    public void testGetOptionalEntitySingleResult_null() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_ID, EMPLOYEE_NAME, HIREDATE from EMPLOYEE");
        builder.sql("where");
        builder.sql("EMPLOYEE_ID = ").param(int.class, 99);
        Optional<Employee> employee = builder
                .getOptionalEntitySingleResult(Employee.class);
        assertNotNull(employee);
        assertFalse(employee.isPresent());
    }

    @Test
    public void testGetEntityResultList() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_ID, EMPLOYEE_NAME, HIREDATE from EMPLOYEE");
        List<Employee> employees = builder.getEntityResultList(Employee.class);
        assertEquals(14, employees.size());
        assertEquals("SMITH", employees.get(0).getEmployeeName());
    }

    @Test
    public void testStreamEntity() throws Exception {
        SelectBuilder builder = SelectBuilder
                .newInstance(container.get(c -> c));
        builder.sql("select EMPLOYEE_ID, EMPLOYEE_NAME, HIREDATE from EMPLOYEE");
        Optional<Employee> employee = builder.streamEntity(Employee.class,
                stream -> stream.findFirst());
        assertEquals("SMITH", employee.get().getEmployeeName());
    }

    @Test
    public void testSelectBuilderInDao() throws Exception {
        EmployeeDao dao = container.get(EmployeeDao::get);
        List<Employee> employees = dao.selectWithBuilder();
        assertEquals(14, employees.size());
    }
}
