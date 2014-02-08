package org.seasar.doma.it.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.337+0900")
 class EmpDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.seasar.doma.it.dao.EmpDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmpDao.class, "selectAll");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmpDao.class, "selectById", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmpDao.class, "createTable");

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmpDao.class, "insert", org.seasar.doma.it.entity.Emp.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmpDao.class, "update", org.seasar.doma.it.entity.Emp.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmpDao.class, "delete", org.seasar.doma.it.entity.Emp.class);

    /** */
    public EmpDaoImpl() {
        super(new org.seasar.doma.it.ItConfig());
    }

    /**
     * @param connection the connection
     */
    public EmpDaoImpl(java.sql.Connection connection) {
        super(new org.seasar.doma.it.ItConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public EmpDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.seasar.doma.it.ItConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected EmpDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected EmpDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected EmpDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Emp> selectAll() {
        entering("org.seasar.doma.it.dao.EmpDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmpDao/selectAll.sql");
            __query.setCallerClassName("org.seasar.doma.it.dao.EmpDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<org.seasar.doma.it.entity.Emp>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.seasar.doma.it.entity.Emp>(org.seasar.doma.it.entity._Emp.getSingletonInternal()));
            java.util.List<org.seasar.doma.it.entity.Emp> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmpDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmpDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public org.seasar.doma.it.entity.Emp selectById(java.lang.Integer id) {
        entering("org.seasar.doma.it.dao.EmpDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmpDao/selectById.sql");
            __query.addParameter("id", java.lang.Integer.class, id);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmpDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<org.seasar.doma.it.entity.Emp> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.seasar.doma.it.entity.Emp>(org.seasar.doma.it.entity._Emp.getSingletonInternal()));
            org.seasar.doma.it.entity.Emp __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmpDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmpDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public int createTable() {
        entering("org.seasar.doma.it.dao.EmpDaoImpl", "createTable");
        try {
            org.seasar.doma.jdbc.query.SqlFileUpdateQuery __query = getQueryImplementors().createSqlFileUpdateQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmpDao/createTable.sql");
            __query.setCallerClassName("org.seasar.doma.it.dao.EmpDaoImpl");
            __query.setCallerMethodName("createTable");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method2, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmpDaoImpl", "createTable", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmpDaoImpl", "createTable", __e);
            throw __e;
        }
    }

    @Override
    public int insert(org.seasar.doma.it.entity.Emp e) {
        entering("org.seasar.doma.it.dao.EmpDaoImpl", "insert", e);
        try {
            if (e == null) {
                throw new org.seasar.doma.DomaNullPointerException("e");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<org.seasar.doma.it.entity.Emp> __query = getQueryImplementors().createAutoInsertQuery(__method3, org.seasar.doma.it.entity._Emp.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntity(e);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmpDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmpDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmpDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(org.seasar.doma.it.entity.Emp e) {
        entering("org.seasar.doma.it.dao.EmpDaoImpl", "update", e);
        try {
            if (e == null) {
                throw new org.seasar.doma.DomaNullPointerException("e");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<org.seasar.doma.it.entity.Emp> __query = getQueryImplementors().createAutoUpdateQuery(__method4, org.seasar.doma.it.entity._Emp.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntity(e);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmpDaoImpl");
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
            exiting("org.seasar.doma.it.dao.EmpDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmpDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(org.seasar.doma.it.entity.Emp e) {
        entering("org.seasar.doma.it.dao.EmpDaoImpl", "delete", e);
        try {
            if (e == null) {
                throw new org.seasar.doma.DomaNullPointerException("e");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<org.seasar.doma.it.entity.Emp> __query = getQueryImplementors().createAutoDeleteQuery(__method5, org.seasar.doma.it.entity._Emp.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setEntity(e);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmpDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method5, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmpDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmpDaoImpl", "delete", __e);
            throw __e;
        }
    }

}
