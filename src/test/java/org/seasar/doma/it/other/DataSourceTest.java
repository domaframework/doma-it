package org.seasar.doma.it.other;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.seasar.doma.it.ItConfig;
import org.seasar.doma.it.dao.EmployeeDao;
import org.seasar.doma.it.entity.Employee;

public class DataSourceTest {

    @Test
    public void test() throws Exception {
        DataSource dataSource = ItConfig.singleton().getOriginalDataSource();
        EmployeeDao dao = EmployeeDao.get(dataSource);
        List<Employee> list = dao.selectAll();
        assertEquals(14, list.size());
        list = dao.selectAll();
        assertEquals(14, list.size());
    }
}
