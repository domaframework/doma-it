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

import org.seasar.doma.SingletonConfig;
import org.seasar.doma.internal.util.ResourceUtil;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.SimpleDataSource;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.H2Dialect;
import org.seasar.doma.jdbc.tx.LocalTransactionDataSource;
import org.seasar.doma.jdbc.tx.LocalTransactionManager;

@SingletonConfig
public final class ItConfig implements Config {

    private static ItConfig config = new ItConfig();

    private final Dialect dialect;

    private final DataSource originalDataSource;

    private final LocalTransactionDataSource dataSource;

    private final LocalTransactionManager transactionManager;

    private ItConfig() {
        dialect = new H2Dialect();
        originalDataSource = createDataSource();
        dataSource = new LocalTransactionDataSource(originalDataSource);
        transactionManager = new LocalTransactionManager(
                dataSource.getLocalTransaction(getJdbcLogger()));
    }

    private DataSource createDataSource() {
        SimpleDataSource dataSource = new SimpleDataSource();
        URL url = ResourceUtil.getResource("env_ut.txt");
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

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }

    @Override
    public Dialect getDialect() {
        return dialect;
    }

    @Override
    public LocalTransactionManager getLocalTransactionManager() {
        return transactionManager;
    }

    public DataSource getOriginalDataSource() {
        return originalDataSource;
    }

    public static ItConfig singleton() {
        return config;
    }
}
