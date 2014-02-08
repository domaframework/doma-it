package org.seasar.doma.it.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.467+0900")
public class WorkerDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.seasar.doma.it.dao.WorkerDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.WorkerDao.class, "selectAll");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.WorkerDao.class, "selectById", java.util.Optional.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.WorkerDao.class, "selectByExample", org.seasar.doma.it.entity.Worker.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.WorkerDao.class, "insert", org.seasar.doma.it.entity.Worker.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.WorkerDao.class, "update", org.seasar.doma.it.entity.Worker.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.WorkerDao.class, "delete", org.seasar.doma.it.entity.Worker.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.WorkerDao.class, "insert", java.util.List.class);

    private static final java.lang.reflect.Method __method7 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.WorkerDao.class, "update", java.util.List.class);

    private static final java.lang.reflect.Method __method8 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.WorkerDao.class, "delete", java.util.List.class);

    /** */
    public WorkerDaoImpl() {
        super(new org.seasar.doma.it.ItConfig());
    }

    /**
     * @param connection the connection
     */
    public WorkerDaoImpl(java.sql.Connection connection) {
        super(new org.seasar.doma.it.ItConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public WorkerDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.seasar.doma.it.ItConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected WorkerDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected WorkerDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected WorkerDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Worker> selectAll() {
        entering("org.seasar.doma.it.dao.WorkerDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/WorkerDao/selectAll.sql");
            __query.setCallerClassName("org.seasar.doma.it.dao.WorkerDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<org.seasar.doma.it.entity.Worker>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.seasar.doma.it.entity.Worker>(org.seasar.doma.it.entity._Worker.getSingletonInternal()));
            java.util.List<org.seasar.doma.it.entity.Worker> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.WorkerDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.WorkerDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public org.seasar.doma.it.entity.Worker selectById(java.util.Optional<java.lang.Integer> id) {
        entering("org.seasar.doma.it.dao.WorkerDaoImpl", "selectById", id);
        try {
            if (id == null) {
                throw new org.seasar.doma.DomaNullPointerException("id");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/WorkerDao/selectById.sql");
            __query.addParameter("id", java.lang.Integer.class, id.orElse(null));
            __query.setCallerClassName("org.seasar.doma.it.dao.WorkerDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<org.seasar.doma.it.entity.Worker> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.seasar.doma.it.entity.Worker>(org.seasar.doma.it.entity._Worker.getSingletonInternal()));
            org.seasar.doma.it.entity.Worker __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.WorkerDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.WorkerDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Worker> selectByExample(org.seasar.doma.it.entity.Worker worker) {
        entering("org.seasar.doma.it.dao.WorkerDaoImpl", "selectByExample", worker);
        try {
            if (worker == null) {
                throw new org.seasar.doma.DomaNullPointerException("worker");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/WorkerDao/selectByExample.sql");
            __query.addParameter("worker", org.seasar.doma.it.entity.Worker.class, worker);
            __query.setCallerClassName("org.seasar.doma.it.dao.WorkerDaoImpl");
            __query.setCallerMethodName("selectByExample");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<org.seasar.doma.it.entity.Worker>> __command = getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.seasar.doma.it.entity.Worker>(org.seasar.doma.it.entity._Worker.getSingletonInternal()));
            java.util.List<org.seasar.doma.it.entity.Worker> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.WorkerDaoImpl", "selectByExample", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.WorkerDaoImpl", "selectByExample", __e);
            throw __e;
        }
    }

    @Override
    public int insert(org.seasar.doma.it.entity.Worker entity) {
        entering("org.seasar.doma.it.dao.WorkerDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<org.seasar.doma.it.entity.Worker> __query = getQueryImplementors().createAutoInsertQuery(__method3, org.seasar.doma.it.entity._Worker.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.WorkerDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.WorkerDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.WorkerDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(org.seasar.doma.it.entity.Worker entity) {
        entering("org.seasar.doma.it.dao.WorkerDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<org.seasar.doma.it.entity.Worker> __query = getQueryImplementors().createAutoUpdateQuery(__method4, org.seasar.doma.it.entity._Worker.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.WorkerDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method4, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.WorkerDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.WorkerDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(org.seasar.doma.it.entity.Worker entity) {
        entering("org.seasar.doma.it.dao.WorkerDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<org.seasar.doma.it.entity.Worker> __query = getQueryImplementors().createAutoDeleteQuery(__method5, org.seasar.doma.it.entity._Worker.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.WorkerDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method5, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.WorkerDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.WorkerDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int[] insert(java.util.List<org.seasar.doma.it.entity.Worker> entity) {
        entering("org.seasar.doma.it.dao.WorkerDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoBatchInsertQuery<org.seasar.doma.it.entity.Worker> __query = getQueryImplementors().createAutoBatchInsertQuery(__method6, org.seasar.doma.it.entity._Worker.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(__config);
            __query.setEntities(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.WorkerDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchInsertCommand __command = getCommandImplementors().createBatchInsertCommand(__method6, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.WorkerDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.WorkerDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int[] update(java.util.List<org.seasar.doma.it.entity.Worker> entity) {
        entering("org.seasar.doma.it.dao.WorkerDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoBatchUpdateQuery<org.seasar.doma.it.entity.Worker> __query = getQueryImplementors().createAutoBatchUpdateQuery(__method7, org.seasar.doma.it.entity._Worker.getSingletonInternal());
            __query.setMethod(__method7);
            __query.setConfig(__config);
            __query.setEntities(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.WorkerDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchUpdateCommand __command = getCommandImplementors().createBatchUpdateCommand(__method7, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.WorkerDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.WorkerDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int[] delete(java.util.List<org.seasar.doma.it.entity.Worker> entity) {
        entering("org.seasar.doma.it.dao.WorkerDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoBatchDeleteQuery<org.seasar.doma.it.entity.Worker> __query = getQueryImplementors().createAutoBatchDeleteQuery(__method8, org.seasar.doma.it.entity._Worker.getSingletonInternal());
            __query.setMethod(__method8);
            __query.setConfig(__config);
            __query.setEntities(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.WorkerDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchDeleteCommand __command = getCommandImplementors().createBatchDeleteCommand(__method8, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.WorkerDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.WorkerDaoImpl", "delete", __e);
            throw __e;
        }
    }

}
