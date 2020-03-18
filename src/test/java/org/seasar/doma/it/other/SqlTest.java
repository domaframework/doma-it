package org.seasar.doma.it.other;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.seasar.doma.it.IntegrationTestEnvironment;
import org.seasar.doma.it.dao.EmployeeDao;
import org.seasar.doma.it.dao.EmployeeDaoImpl;
import org.seasar.doma.it.entity.Employee;
import org.seasar.doma.jdbc.Config;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(IntegrationTestEnvironment.class)
public class SqlTest {

  @Test
  void test(Config config) {
      EmployeeDao dao = new EmployeeDaoImpl(config);
      List<Employee> list = dao.selectByNames(Arrays.asList("SMITH", "SCOTT"));
      assertEquals(2, list.size());
      assertEquals(Integer.valueOf(1), list.get(0).getEmployeeId());
      assertEquals(Integer.valueOf(8), list.get(1).getEmployeeId());
  }
}
