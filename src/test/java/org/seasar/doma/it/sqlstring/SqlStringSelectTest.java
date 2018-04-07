package org.seasar.doma.it.sqlstring;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.it.Container;
import org.seasar.doma.it.Sandbox;
import org.seasar.doma.it.dao.BranchDao;
import org.seasar.doma.it.dao.BranchDao.Branch;
import org.seasar.doma.it.dao.BranchDao.BranchDetail;
import org.seasar.doma.it.dao.BranchDao.Location;
import org.seasar.doma.it.dao.BusinessmanDao;
import org.seasar.doma.it.dao.EmployeeDao;
import org.seasar.doma.it.dao.SkilledEmployeeDao;
import org.seasar.doma.it.dao.WorkerDao;
import org.seasar.doma.it.entity.Businessman;
import org.seasar.doma.it.entity.Employee;
import org.seasar.doma.it.entity.Worker;
import org.seasar.doma.it.holder.Salary;
import org.seasar.doma.jdbc.ResultMappingException;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

public class SqlStringSelectTest {

    @ClassRule
    public static Container container = new Container();

    @Rule
    public Sandbox sandbox = new Sandbox(container);

    @Test
    public void testSelectById() throws Exception {
        var dao = container.get(SkilledEmployeeDao::get);
        var employee = dao.selectById(1);
        assertNotNull(employee);
    }
}
