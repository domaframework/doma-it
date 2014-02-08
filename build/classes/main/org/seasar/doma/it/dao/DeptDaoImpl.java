package org.seasar.doma.it.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.332+0900")
 class DeptDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.seasar.doma.it.dao.DeptDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DeptDao.class, "selectById", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DeptDao.class, "insert", org.seasar.doma.it.entity.Dept.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DeptDao.class, "update", org.seasar.doma.it.entity.Dept.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DeptDao.class, "insert", java.util.List.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DeptDao.class, "update", java.util.List.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DeptDao.class, "insertBySqlFile", org.seasar.doma.it.entity.Dept.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DeptDao.class, "updateBySqlFile", org.seasar.doma.it.entity.Dept.class);

    private static final java.lang.reflect.Method __method7 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DeptDao.class, "insertBySqlFile", java.util.List.class);

    private static final java.lang.reflect.Method __method8 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DeptDao.class, "updateBySqlFile", java.util.List.class);

    /** */
    public DeptDaoImpl() {
        super(new org.seasar.doma.it.ItConfig());
    }

    /**
     * @param connection the connection
     */
    public DeptDaoImpl(java.sql.Connection connection) {
        super(new org.seasar.doma.it.ItConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public DeptDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.seasar.doma.it.ItConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected DeptDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected DeptDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected DeptDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public org.seasar.doma.it.entity.Dept selectById(java.lang.Integer departmentId) {
        entering("org.seasar.doma.it.dao.DeptDaoImpl", "selectById", departmentId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/DeptDao/selectById.sql");
            __query.addParameter("departmentId", java.lang.Integer.class, departmentId);
            __query.setCallerClassName("org.seasar.doma.it.dao.DeptDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<org.seasar.doma.it.entity.Dept> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.seasar.doma.it.entity.Dept>(org.seasar.doma.it.entity._Dept.getSingletonInternal()));
            org.seasar.doma.it.entity.Dept __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.DeptDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DeptDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Dept> insert(org.seasar.doma.it.entity.Dept d) {
        entering("org.seasar.doma.it.dao.DeptDaoImpl", "insert", d);
        try {
            if (d == null) {
                throw new org.seasar.doma.DomaNullPointerException("d");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<org.seasar.doma.it.entity.Dept> __query = getQueryImplementors().createAutoInsertQuery(__method1, org.seasar.doma.it.entity._Dept.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setEntity(d);
            __query.setCallerClassName("org.seasar.doma.it.dao.DeptDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method1, __query);
            int __count = __command.execute();
            __query.complete();
            org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Dept> __result = new org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Dept>(__count, __query.getEntity());
            exiting("org.seasar.doma.it.dao.DeptDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DeptDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Dept> update(org.seasar.doma.it.entity.Dept d) {
        entering("org.seasar.doma.it.dao.DeptDaoImpl", "update", d);
        try {
            if (d == null) {
                throw new org.seasar.doma.DomaNullPointerException("d");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<org.seasar.doma.it.entity.Dept> __query = getQueryImplementors().createAutoUpdateQuery(__method2, org.seasar.doma.it.entity._Dept.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntity(d);
            __query.setCallerClassName("org.seasar.doma.it.dao.DeptDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method2, __query);
            int __count = __command.execute();
            __query.complete();
            org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Dept> __result = new org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Dept>(__count, __query.getEntity());
            exiting("org.seasar.doma.it.dao.DeptDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DeptDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Dept> insert(java.util.List<org.seasar.doma.it.entity.Dept> entity) {
        entering("org.seasar.doma.it.dao.DeptDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoBatchInsertQuery<org.seasar.doma.it.entity.Dept> __query = getQueryImplementors().createAutoBatchInsertQuery(__method3, org.seasar.doma.it.entity._Dept.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntities(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.DeptDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchInsertCommand __command = getCommandImplementors().createBatchInsertCommand(__method3, __query);
            int[] __counts = __command.execute();
            __query.complete();
            org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Dept> __result = new org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Dept>(__counts, __query.getEntities());
            exiting("org.seasar.doma.it.dao.DeptDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DeptDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Dept> update(java.util.List<org.seasar.doma.it.entity.Dept> entity) {
        entering("org.seasar.doma.it.dao.DeptDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoBatchUpdateQuery<org.seasar.doma.it.entity.Dept> __query = getQueryImplementors().createAutoBatchUpdateQuery(__method4, org.seasar.doma.it.entity._Dept.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntities(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.DeptDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchUpdateCommand __command = getCommandImplementors().createBatchUpdateCommand(__method4, __query);
            int[] __counts = __command.execute();
            __query.complete();
            org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Dept> __result = new org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Dept>(__counts, __query.getEntities());
            exiting("org.seasar.doma.it.dao.DeptDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DeptDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Dept> insertBySqlFile(org.seasar.doma.it.entity.Dept entity) {
        entering("org.seasar.doma.it.dao.DeptDaoImpl", "insertBySqlFile", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.SqlFileInsertQuery __query = getQueryImplementors().createSqlFileInsertQuery(__method5);
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/DeptDao/insertBySqlFile.sql");
            __query.addParameter("entity", org.seasar.doma.it.entity.Dept.class, entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.DeptDaoImpl");
            __query.setCallerMethodName("insertBySqlFile");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("entity", entity, org.seasar.doma.it.entity._Dept.getSingletonInternal());
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method5, __query);
            int __count = __command.execute();
            __query.complete();
            org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Dept> __result = new org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Dept>(__count, __query.getEntity(org.seasar.doma.it.entity.Dept.class));
            exiting("org.seasar.doma.it.dao.DeptDaoImpl", "insertBySqlFile", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DeptDaoImpl", "insertBySqlFile", __e);
            throw __e;
        }
    }

    @Override
    public org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Dept> updateBySqlFile(org.seasar.doma.it.entity.Dept entity) {
        entering("org.seasar.doma.it.dao.DeptDaoImpl", "updateBySqlFile", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.SqlFileUpdateQuery __query = getQueryImplementors().createSqlFileUpdateQuery(__method6);
            __query.setMethod(__method6);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/DeptDao/updateBySqlFile.sql");
            __query.addParameter("entity", org.seasar.doma.it.entity.Dept.class, entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.DeptDaoImpl");
            __query.setCallerMethodName("updateBySqlFile");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("entity", entity, org.seasar.doma.it.entity._Dept.getSingletonInternal());
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method6, __query);
            int __count = __command.execute();
            __query.complete();
            org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Dept> __result = new org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Dept>(__count, __query.getEntity(org.seasar.doma.it.entity.Dept.class));
            exiting("org.seasar.doma.it.dao.DeptDaoImpl", "updateBySqlFile", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DeptDaoImpl", "updateBySqlFile", __e);
            throw __e;
        }
    }

    @Override
    public org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Dept> insertBySqlFile(java.util.List<org.seasar.doma.it.entity.Dept> entity) {
        entering("org.seasar.doma.it.dao.DeptDaoImpl", "insertBySqlFile", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.SqlFileBatchInsertQuery<org.seasar.doma.it.entity.Dept> __query = getQueryImplementors().createSqlFileBatchInsertQuery(__method7, org.seasar.doma.it.entity.Dept.class);
            __query.setMethod(__method7);
            __query.setConfig(__config);
            __query.setElements(entity);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/DeptDao/insertBySqlFile.sql");
            __query.setParameterName("entity");
            __query.setCallerClassName("org.seasar.doma.it.dao.DeptDaoImpl");
            __query.setCallerMethodName("insertBySqlFile");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setEntityType(org.seasar.doma.it.entity._Dept.getSingletonInternal());
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchInsertCommand __command = getCommandImplementors().createBatchInsertCommand(__method7, __query);
            int[] __counts = __command.execute();
            __query.complete();
            org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Dept> __result = new org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Dept>(__counts, __query.getEntities());
            exiting("org.seasar.doma.it.dao.DeptDaoImpl", "insertBySqlFile", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DeptDaoImpl", "insertBySqlFile", __e);
            throw __e;
        }
    }

    @Override
    public org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Dept> updateBySqlFile(java.util.List<org.seasar.doma.it.entity.Dept> entity) {
        entering("org.seasar.doma.it.dao.DeptDaoImpl", "updateBySqlFile", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.SqlFileBatchUpdateQuery<org.seasar.doma.it.entity.Dept> __query = getQueryImplementors().createSqlFileBatchUpdateQuery(__method8, org.seasar.doma.it.entity.Dept.class);
            __query.setMethod(__method8);
            __query.setConfig(__config);
            __query.setElements(entity);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/DeptDao/updateBySqlFile.sql");
            __query.setParameterName("entity");
            __query.setCallerClassName("org.seasar.doma.it.dao.DeptDaoImpl");
            __query.setCallerMethodName("updateBySqlFile");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setEntityType(org.seasar.doma.it.entity._Dept.getSingletonInternal());
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchUpdateCommand __command = getCommandImplementors().createBatchUpdateCommand(__method8, __query);
            int[] __counts = __command.execute();
            __query.complete();
            org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Dept> __result = new org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Dept>(__counts, __query.getEntities());
            exiting("org.seasar.doma.it.dao.DeptDaoImpl", "updateBySqlFile", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DeptDaoImpl", "updateBySqlFile", __e);
            throw __e;
        }
    }

}
