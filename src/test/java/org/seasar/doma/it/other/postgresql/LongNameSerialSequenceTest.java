package org.seasar.doma.it.other.postgresql;

import java.util.Arrays;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.it.Container;
import org.seasar.doma.it.Dbms;
import org.seasar.doma.it.Run;
import org.seasar.doma.it.Sandbox;
import org.seasar.doma.it.dao.VeryLongCharactersNamedTableDao;
import org.seasar.doma.it.dao.VeryLongCharactersNamedTableDaoImpl;
import org.seasar.doma.it.entity.VeryLongCharactersNamedTable;

@Run(onlyIf = { Dbms.POSTGRESQL },
     unless = { Dbms.H2, Dbms.DB2, Dbms.HSQLDB, Dbms.HSQLDB, Dbms.MYSQL, Dbms.ORACLE, Dbms.SQLITE, Dbms.SQLSERVER })
public class LongNameSerialSequenceTest {

    @ClassRule
    public static Container container = new Container();

    @Rule
    public Sandbox sandbox = new Sandbox(container);

    @Test
    public void testInsert() throws Exception {
    	VeryLongCharactersNamedTableDao dao = container.get(config -> new VeryLongCharactersNamedTableDaoImpl(config));
    	VeryLongCharactersNamedTable entity = new VeryLongCharactersNamedTable();
    	entity.setValue("foo");
    	dao.insert(entity);
    }
    
    @Test
    public void testBatchInsert() throws Exception {
    	VeryLongCharactersNamedTableDao dao = container.get(config -> new VeryLongCharactersNamedTableDaoImpl(config));
    	VeryLongCharactersNamedTable entity1 = new VeryLongCharactersNamedTable();
    	entity1.setValue("foo");
    	VeryLongCharactersNamedTable entity2 = new VeryLongCharactersNamedTable();
    	entity2.setValue("bar");
    	dao.insert(Arrays.asList(entity1, entity2));
    	
    }
}
