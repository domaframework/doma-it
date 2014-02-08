package org.seasar.doma.it.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.283+0900")
 class CompKeyDepartmentDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.seasar.doma.it.dao.CompKeyDepartmentDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.CompKeyDepartmentDao.class, "selectById", java.lang.Integer.class, java.lang.Integer.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.CompKeyDepartmentDao.class, "insert", org.seasar.doma.it.entity.CompKeyDepartment.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.CompKeyDepartmentDao.class, "update", org.seasar.doma.it.entity.CompKeyDepartment.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.CompKeyDepartmentDao.class, "insert", java.util.List.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.CompKeyDepartmentDao.class, "update", java.util.List.class);

    /** */
    public CompKeyDepartmentDaoImpl() {
        super(new org.seasar.doma.it.ItConfig());
    }

    /**
     * @param connection the connection
     */
    public CompKeyDepartmentDaoImpl(java.sql.Connection connection) {
        super(new org.seasar.doma.it.ItConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public CompKeyDepartmentDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.seasar.doma.it.ItConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected CompKeyDepartmentDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected CompKeyDepartmentDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected CompKeyDepartmentDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public org.seasar.doma.it.entity.CompKeyDepartment selectById(java.lang.Integer departmentId1, java.lang.Integer departmentId2) {
        entering("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl", "selectById", departmentId1, departmentId2);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/CompKeyDepartmentDao/selectById.sql");
            __query.addParameter("departmentId1", java.lang.Integer.class, departmentId1);
            __query.addParameter("departmentId2", java.lang.Integer.class, departmentId2);
            __query.setCallerClassName("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<org.seasar.doma.it.entity.CompKeyDepartment> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.seasar.doma.it.entity.CompKeyDepartment>(org.seasar.doma.it.entity._CompKeyDepartment.getSingletonInternal()));
            org.seasar.doma.it.entity.CompKeyDepartment __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public int insert(org.seasar.doma.it.entity.CompKeyDepartment entity) {
        entering("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<org.seasar.doma.it.entity.CompKeyDepartment> __query = getQueryImplementors().createAutoInsertQuery(__method1, org.seasar.doma.it.entity._CompKeyDepartment.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method1, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(org.seasar.doma.it.entity.CompKeyDepartment entity) {
        entering("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<org.seasar.doma.it.entity.CompKeyDepartment> __query = getQueryImplementors().createAutoUpdateQuery(__method2, org.seasar.doma.it.entity._CompKeyDepartment.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl");
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
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int[] insert(java.util.List<org.seasar.doma.it.entity.CompKeyDepartment> entities) {
        entering("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl", "insert", entities);
        try {
            if (entities == null) {
                throw new org.seasar.doma.DomaNullPointerException("entities");
            }
            org.seasar.doma.jdbc.query.AutoBatchInsertQuery<org.seasar.doma.it.entity.CompKeyDepartment> __query = getQueryImplementors().createAutoBatchInsertQuery(__method3, org.seasar.doma.it.entity._CompKeyDepartment.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntities(entities);
            __query.setCallerClassName("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchInsertCommand __command = getCommandImplementors().createBatchInsertCommand(__method3, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int[] update(java.util.List<org.seasar.doma.it.entity.CompKeyDepartment> entities) {
        entering("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl", "update", entities);
        try {
            if (entities == null) {
                throw new org.seasar.doma.DomaNullPointerException("entities");
            }
            org.seasar.doma.jdbc.query.AutoBatchUpdateQuery<org.seasar.doma.it.entity.CompKeyDepartment> __query = getQueryImplementors().createAutoBatchUpdateQuery(__method4, org.seasar.doma.it.entity._CompKeyDepartment.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntities(entities);
            __query.setCallerClassName("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl");
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
            exiting("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.CompKeyDepartmentDaoImpl", "update", __e);
            throw __e;
        }
    }

}
