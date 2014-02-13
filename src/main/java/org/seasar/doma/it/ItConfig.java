/*
 * Copyright 2004-2009 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.seasar.doma.it;

import java.io.File;
import java.net.URL;

import javax.sql.DataSource;

import org.seasar.doma.internal.util.ResourceUtil;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.ConfigSupport;
import org.seasar.doma.jdbc.JdbcLogger;
import org.seasar.doma.jdbc.SimpleDataSource;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.H2Dialect;
import org.seasar.doma.jdbc.tx.LocalTransactionManager;
import org.seasar.doma.jdbc.tx.LocalTransactionalDataSource;

public class ItConfig implements Config {

    protected static final JdbcLogger jdbcLogger = ConfigSupport.defaultJdbcLogger;

    protected static final Dialect dialect = new H2Dialect();

    private static final DataSource originalDataSource = createDataSource();

    private static final LocalTransactionalDataSource localTxDataSource = createLocalTxDataSource(originalDataSource);

    private static final LocalTransactionManager localTxManager = new LocalTransactionManager(
            localTxDataSource.getLocalTransaction(jdbcLogger));

    @Override
    public DataSource getDataSource() {
        return localTxDataSource;
    }

    @Override
    public Dialect getDialect() {
        return dialect;
    }

    @Override
    public JdbcLogger getJdbcLogger() {
        return jdbcLogger;
    }

    protected static DataSource createDataSource() {
        SimpleDataSource dataSource = new SimpleDataSource();
        URL url = ResourceUtil.getResource("jdbc.dicon");
        File file = new File(url.getFile());
        try {
            String path = file.getParentFile().getCanonicalPath();
            dataSource.setUrl("jdbc:h2:file:" + path
                    + "/data-h2/demo;DB_CLOSE_ON_EXIT=FALSE");
            dataSource.setUser("sa");
            return dataSource;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected static LocalTransactionalDataSource createLocalTxDataSource(
            DataSource dataSource) {
        return new LocalTransactionalDataSource(dataSource);
    }

    public static DataSource getOriginalDataSource() {
        return originalDataSource;
    }

    public static LocalTransactionManager getLocalTransactionManager() {
        return localTxManager;
    }

}
