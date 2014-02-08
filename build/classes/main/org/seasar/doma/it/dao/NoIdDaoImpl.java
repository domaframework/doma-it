package org.seasar.doma.it.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.413+0900")
 class NoIdDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.seasar.doma.it.dao.NoIdDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.NoIdDao.class, "insert", org.seasar.doma.it.entity.NoId.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.NoIdDao.class, "update", org.seasar.doma.it.entity.NoId.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.NoIdDao.class, "delete", org.seasar.doma.it.entity.NoId.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.NoIdDao.class, "insert", java.util.List.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.NoIdDao.class, "update", java.util.List.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.NoIdDao.class, "delete", java.util.List.class);

    /** */
    public NoIdDaoImpl() {
        super(new org.seasar.doma.it.ItConfig());
    }

    /**
     * @param connection the connection
     */
    public NoIdDaoImpl(java.sql.Connection connection) {
        super(new org.seasar.doma.it.ItConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public NoIdDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.seasar.doma.it.ItConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected NoIdDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected NoIdDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected NoIdDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int insert(org.seasar.doma.it.entity.NoId entity) {
        entering("org.seasar.doma.it.dao.NoIdDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<org.seasar.doma.it.entity.NoId> __query = getQueryImplementors().createAutoInsertQuery(__method0, org.seasar.doma.it.entity._NoId.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.NoIdDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method0, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.NoIdDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.NoIdDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(org.seasar.doma.it.entity.NoId entity) {
        entering("org.seasar.doma.it.dao.NoIdDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<org.seasar.doma.it.entity.NoId> __query = getQueryImplementors().createAutoUpdateQuery(__method1, org.seasar.doma.it.entity._NoId.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.NoIdDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method1, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.NoIdDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.NoIdDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(org.seasar.doma.it.entity.NoId entity) {
        entering("org.seasar.doma.it.dao.NoIdDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<org.seasar.doma.it.entity.NoId> __query = getQueryImplementors().createAutoDeleteQuery(__method2, org.seasar.doma.it.entity._NoId.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.NoIdDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method2, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.NoIdDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.NoIdDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int[] insert(java.util.List<org.seasar.doma.it.entity.NoId> entities) {
        entering("org.seasar.doma.it.dao.NoIdDaoImpl", "insert", entities);
        try {
            if (entities == null) {
                throw new org.seasar.doma.DomaNullPointerException("entities");
            }
            org.seasar.doma.jdbc.query.AutoBatchInsertQuery<org.seasar.doma.it.entity.NoId> __query = getQueryImplementors().createAutoBatchInsertQuery(__method3, org.seasar.doma.it.entity._NoId.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntities(entities);
            __query.setCallerClassName("org.seasar.doma.it.dao.NoIdDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchInsertCommand __command = getCommandImplementors().createBatchInsertCommand(__method3, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.NoIdDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.NoIdDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int[] update(java.util.List<org.seasar.doma.it.entity.NoId> entities) {
        entering("org.seasar.doma.it.dao.NoIdDaoImpl", "update", entities);
        try {
            if (entities == null) {
                throw new org.seasar.doma.DomaNullPointerException("entities");
            }
            org.seasar.doma.jdbc.query.AutoBatchUpdateQuery<org.seasar.doma.it.entity.NoId> __query = getQueryImplementors().createAutoBatchUpdateQuery(__method4, org.seasar.doma.it.entity._NoId.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntities(entities);
            __query.setCallerClassName("org.seasar.doma.it.dao.NoIdDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchUpdateCommand __command = getCommandImplementors().createBatchUpdateCommand(__method4, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.NoIdDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.NoIdDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int[] delete(java.util.List<org.seasar.doma.it.entity.NoId> entities) {
        entering("org.seasar.doma.it.dao.NoIdDaoImpl", "delete", entities);
        try {
            if (entities == null) {
                throw new org.seasar.doma.DomaNullPointerException("entities");
            }
            org.seasar.doma.jdbc.query.AutoBatchDeleteQuery<org.seasar.doma.it.entity.NoId> __query = getQueryImplementors().createAutoBatchDeleteQuery(__method5, org.seasar.doma.it.entity._NoId.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setEntities(entities);
            __query.setCallerClassName("org.seasar.doma.it.dao.NoIdDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchDeleteCommand __command = getCommandImplementors().createBatchDeleteCommand(__method5, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.NoIdDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.NoIdDaoImpl", "delete", __e);
            throw __e;
        }
    }

}
