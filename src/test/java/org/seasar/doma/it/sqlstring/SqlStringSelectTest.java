package org.seasar.doma.it.sqlstring;

import static org.junit.Assert.assertNotNull;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.it.Container;
import org.seasar.doma.it.Sandbox;
import org.seasar.doma.it.dao.SkilledEmployeeDaoImpl;

public class SqlStringSelectTest {

  @ClassRule public static Container container = new Container();

  @Rule public Sandbox sandbox = new Sandbox(container);

  @Test
  public void testSelectById() throws Exception {
    var dao = container.get(config -> new SkilledEmployeeDaoImpl(config));
    var employee = dao.selectById(1);
    assertNotNull(employee);
  }
}
