package org.seasar.doma.it.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.296+0900")
 class CompKeyEmployeeDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.seasar.doma.it.dao.CompKeyEmployeeDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.CompKeyEmployeeDao.class, "selectById", java.lang.Integer.class, java.lang.Integer.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.CompKeyEmployeeDao.class, "delete", org.seasar.doma.it.entity.CompKeyEmployee.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.CompKeyEmployeeDao.class, "delete", java.util.List.class);

    /** */
    public CompKeyEmployeeDaoImpl() {
        super(new org.seasar.doma.it.ItConfig());
    }

    /**
     * @param connection the connection
     */
    public CompKeyEmployeeDaoImpl(java.sql.Connection connection) {
        super(new org.seasar.doma.it.ItConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public CompKeyEmployeeDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.seasar.doma.it.ItConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected CompKeyEmployeeDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected CompKeyEmployeeDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected CompKeyEmployeeDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public org.seasar.doma.it.entity.CompKeyEmployee selectById(java.lang.Integer employeeId1, java.lang.Integer employeeId2) {
        entering("org.seasar.doma.it.dao.CompKeyEmployeeDaoImpl", "selectById", employeeId1, employeeId2);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/CompKeyEmployeeDao/selectById.sql");
            __query.addParameter("employeeId1", java.lang.Integer.class, employeeId1);
            __query.addParameter("employeeId2", java.lang.Integer.class, employeeId2);
            __query.setCallerClassName("org.seasar.doma.it.dao.CompKeyEmployeeDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<org.seasar.doma.it.entity.CompKeyEmployee> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.seasar.doma.it.entity.CompKeyEmployee>(org.seasar.doma.it.entity._CompKeyEmployee.getSingletonInternal()));
            org.seasar.doma.it.entity.CompKeyEmployee __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.CompKeyEmployeeDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.CompKeyEmployeeDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public int delete(org.seasar.doma.it.entity.CompKeyEmployee entity) {
        entering("org.seasar.doma.it.dao.CompKeyEmployeeDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<org.seasar.doma.it.entity.CompKeyEmployee> __query = getQueryImplementors().createAutoDeleteQuery(__method1, org.seasar.doma.it.entity._CompKeyEmployee.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.CompKeyEmployeeDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method1, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.CompKeyEmployeeDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.CompKeyEmployeeDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int[] delete(java.util.List<org.seasar.doma.it.entity.CompKeyEmployee> entities) {
        entering("org.seasar.doma.it.dao.CompKeyEmployeeDaoImpl", "delete", entities);
        try {
            if (entities == null) {
                throw new org.seasar.doma.DomaNullPointerException("entities");
            }
            org.seasar.doma.jdbc.query.AutoBatchDeleteQuery<org.seasar.doma.it.entity.CompKeyEmployee> __query = getQueryImplementors().createAutoBatchDeleteQuery(__method2, org.seasar.doma.it.entity._CompKeyEmployee.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntities(entities);
            __query.setCallerClassName("org.seasar.doma.it.dao.CompKeyEmployeeDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchDeleteCommand __command = getCommandImplementors().createBatchDeleteCommand(__method2, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.CompKeyEmployeeDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.CompKeyEmployeeDaoImpl", "delete", __e);
            throw __e;
        }
    }

}
