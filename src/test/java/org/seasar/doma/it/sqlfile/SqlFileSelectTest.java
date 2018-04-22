package org.seasar.doma.it.sqlfile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.it.Container;
import org.seasar.doma.it.Sandbox;
import org.seasar.doma.it.dao.BranchDao;
import org.seasar.doma.it.dao.BranchDao.Branch;
import org.seasar.doma.it.dao.BranchDao.BranchDetail;
import org.seasar.doma.it.dao.BranchDao.Location;
import org.seasar.doma.it.dao.BranchDaoImpl;
import org.seasar.doma.it.dao.BusinessmanDao;
import org.seasar.doma.it.dao.BusinessmanDaoImpl;
import org.seasar.doma.it.dao.EmployeeDao;
import org.seasar.doma.it.dao.EmployeeDaoImpl;
import org.seasar.doma.it.dao.WorkerDao;
import org.seasar.doma.it.dao.WorkerDaoImpl;
import org.seasar.doma.it.entity.Businessman;
import org.seasar.doma.it.entity.Employee;
import org.seasar.doma.it.entity.Worker;
import org.seasar.doma.it.holder.Salary;
import org.seasar.doma.jdbc.ResultMappingException;

public class SqlFileSelectTest {

    @ClassRule
    public static Container container = new Container();

    @Rule
    public Sandbox sandbox = new Sandbox(container);

    @Test
    public void testEmbeddedVariable() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        List<Employee> list = dao.selectWithOptionalOrderBy("S",
                "order by EMPLOYEE_ID");
        assertEquals(2, list.size());
        assertEquals(Integer.valueOf(1), list.get(0).getEmployeeId());
        assertEquals(Integer.valueOf(8), list.get(1).getEmployeeId());

        list = dao.selectWithOptionalOrderBy("S", "order by EMPLOYEE_ID desc");
        assertEquals(2, list.size());
        assertEquals(Integer.valueOf(8), list.get(0).getEmployeeId());
        assertEquals(Integer.valueOf(1), list.get(1).getEmployeeId());
    }

    @Test
    public void testNull() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        Employee employee = dao.selectById(9);
        assertNull(employee.getManagerId());
    }

    @Test
    public void testPrefixSearch() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        List<Employee> employees = dao.selectByNamePrefix("S");
        assertEquals(2, employees.size());
    }

    @Test
    public void testInsideSearch() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        List<Employee> employees = dao.selectByNameInfix("S");
        assertEquals(5, employees.size());
    }

    @Test
    public void testSuffixSearch() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        List<Employee> employees = dao.selectByNameSuffix("S");
        assertEquals(3, employees.size());
    }

    @Test
    public void testMap() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        Map<String, Object> employee = dao.selectByIdAsMap(1);
        assertNotNull(employee);
        assertNotNull(employee.get("employeeId"));
        assertNotNull(employee.get("employeeName"));
        assertNotNull(employee.get("hiredate"));
    }

    @Test
    public void testMapList() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        List<Map<String, Object>> employees = dao.selectAllAsMapList();
        assertEquals(14, employees.size());
    }

    @Test
    public void testEnsureResultMappping_false() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        List<Employee> employees = dao.selectOnlyNameWithoutMappingCheck();
        assertEquals(14, employees.size());
    }

    @Test
    public void testEnsureResultMappping_true() throws Exception {
        EmployeeDao dao = container.get(config -> new EmployeeDaoImpl(config));
        try {
            dao.selectOnlyNameWithMappingCheck();
            fail();
        } catch (ResultMappingException expected) {
            System.err.print(expected);
        }
    }

    @Test
    public void testOptional() throws Exception {
        WorkerDao dao = container.get(config -> new WorkerDaoImpl(config));
        Worker worker = dao.selectById(Optional.of(9));
        assertEquals(Integer.valueOf(9), worker.employeeId.get());
        assertEquals(Integer.valueOf(7839), worker.employeeNo.get());
        assertEquals("KING", worker.employeeName.get());
        assertFalse(worker.managerId.isPresent());
        assertEquals(java.sql.Date.valueOf("1981-11-17"),
                worker.hiredate.get());
        assertEquals(0, new BigDecimal("5000")
                .compareTo(worker.salary.get().getValue()));
        assertEquals(Integer.valueOf(1), worker.departmentId.get().getValue());
        assertEquals(Integer.valueOf(9), worker.addressId.get());
        assertEquals(Integer.valueOf(1), worker.version.get());
    }

    @Test
    public void testOptional_expression() throws Exception {
        WorkerDao dao = container.get(config -> new WorkerDaoImpl(config));
        Worker worker = new Worker();
        worker.employeeNo = Optional.of(7801);
        worker.managerId = Optional.empty();
        worker.salary = Optional.of(new Salary("3000"));

        List<Worker> workers = dao.selectByExample(worker);
        assertEquals(14, workers.size());

        worker.managerId = Optional.of(1);

        workers = dao.selectByExample(worker);
        assertEquals(3, workers.size());
    }

    @Test
    public void testOptionalInt() throws Exception {
        BusinessmanDao dao = container.get(config -> new BusinessmanDaoImpl(config));
        Businessman worker = dao.selectById(OptionalInt.of(9));
        assertEquals(9, worker.employeeId.getAsInt());
        assertEquals(7839, worker.employeeNo.getAsInt());
        assertEquals("KING", worker.employeeName.get());
        assertFalse(worker.managerId.isPresent());
        assertEquals(java.sql.Date.valueOf("1981-11-17"),
                worker.hiredate.get());
        assertEquals(5000L, worker.salary.getAsLong());
        assertEquals(1, worker.departmentId.getAsInt());
        assertEquals(9, worker.addressId.getAsInt());
        assertEquals(1, worker.version.getAsInt());
    }

    @Test
    public void testOptionalInt_expression() throws Exception {
        BusinessmanDao dao = container.get(config -> new BusinessmanDaoImpl(config));
        Businessman worker = new Businessman();
        worker.employeeNo = OptionalInt.of(7801);
        worker.managerId = OptionalInt.empty();
        worker.salary = OptionalLong.of(3000L);

        List<Businessman> workers = dao.selectByExample(worker);
        assertEquals(14, workers.size());

        worker.managerId = OptionalInt.of(1);

        workers = dao.selectByExample(worker);
        assertEquals(3, workers.size());
    }

    @Test
    public void testNestedEntity() throws Exception {
        BranchDao dao = container.get(config -> new BranchDaoImpl(config));
        Branch branch = dao.selectById(1);
        assertNotNull(branch);
        assertEquals(Integer.valueOf(1), branch.branchId);
        assertEquals(Integer.valueOf(1), branch.version);
        BranchDetail branchDetail = branch.branchDetail;
        assertNotNull(branchDetail);
        assertEquals(Integer.valueOf(10), branchDetail.branchNo);
        assertEquals("ACCOUNTING", branchDetail.branchName);
        Location location = branchDetail.location;
        assertNotNull(location);
        assertEquals("NEW YORK", location.getValue());
    }
}
