package org.seasar.doma.it.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.448+0900")
 class SalEmpDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.seasar.doma.it.dao.SalEmpDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.SalEmpDao.class, "selectAll");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.SalEmpDao.class, "insert", org.seasar.doma.it.entity.SalEmp.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.SalEmpDao.class, "update", org.seasar.doma.it.entity.SalEmp.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.SalEmpDao.class, "createIntegerArray", java.lang.Integer[].class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.SalEmpDao.class, "createString2DArray", java.lang.String[][].class);

    /** */
    public SalEmpDaoImpl() {
        super(new org.seasar.doma.it.ItConfig());
    }

    /**
     * @param connection the connection
     */
    public SalEmpDaoImpl(java.sql.Connection connection) {
        super(new org.seasar.doma.it.ItConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public SalEmpDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.seasar.doma.it.ItConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected SalEmpDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected SalEmpDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected SalEmpDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.SalEmp> selectAll() {
        entering("org.seasar.doma.it.dao.SalEmpDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/SalEmpDao/selectAll.sql");
            __query.setCallerClassName("org.seasar.doma.it.dao.SalEmpDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<org.seasar.doma.it.entity.SalEmp>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.seasar.doma.it.entity.SalEmp>(org.seasar.doma.it.entity._SalEmp.getSingletonInternal()));
            java.util.List<org.seasar.doma.it.entity.SalEmp> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.SalEmpDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.SalEmpDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public int insert(org.seasar.doma.it.entity.SalEmp entity) {
        entering("org.seasar.doma.it.dao.SalEmpDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<org.seasar.doma.it.entity.SalEmp> __query = getQueryImplementors().createAutoInsertQuery(__method1, org.seasar.doma.it.entity._SalEmp.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.SalEmpDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method1, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.SalEmpDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.SalEmpDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(org.seasar.doma.it.entity.SalEmp entity) {
        entering("org.seasar.doma.it.dao.SalEmpDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<org.seasar.doma.it.entity.SalEmp> __query = getQueryImplementors().createAutoUpdateQuery(__method2, org.seasar.doma.it.entity._SalEmp.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.SalEmpDaoImpl");
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
            exiting("org.seasar.doma.it.dao.SalEmpDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.SalEmpDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public java.sql.Array createIntegerArray(java.lang.Integer[] elements) {
        entering("org.seasar.doma.it.dao.SalEmpDaoImpl", "createIntegerArray", (Object)elements);
        try {
            if (elements == null) {
                throw new org.seasar.doma.DomaNullPointerException("elements");
            }
            org.seasar.doma.jdbc.query.ArrayCreateQuery __query = getQueryImplementors().createArrayCreateQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setCallerClassName("org.seasar.doma.it.dao.SalEmpDaoImpl");
            __query.setCallerMethodName("createIntegerArray");
            __query.setTypeName("integer");
            __query.setElements(elements);
            __query.prepare();
            org.seasar.doma.jdbc.command.CreateCommand<java.sql.Array> __command = getCommandImplementors().createCreateCommand(__method3, __query);
            java.sql.Array __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.SalEmpDaoImpl", "createIntegerArray", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.SalEmpDaoImpl", "createIntegerArray", __e);
            throw __e;
        }
    }

    @Override
    public java.sql.Array createString2DArray(java.lang.String[][] elements) {
        entering("org.seasar.doma.it.dao.SalEmpDaoImpl", "createString2DArray", (Object)elements);
        try {
            if (elements == null) {
                throw new org.seasar.doma.DomaNullPointerException("elements");
            }
            org.seasar.doma.jdbc.query.ArrayCreateQuery __query = getQueryImplementors().createArrayCreateQuery(__method4);
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setCallerClassName("org.seasar.doma.it.dao.SalEmpDaoImpl");
            __query.setCallerMethodName("createString2DArray");
            __query.setTypeName("text");
            __query.setElements(elements);
            __query.prepare();
            org.seasar.doma.jdbc.command.CreateCommand<java.sql.Array> __command = getCommandImplementors().createCreateCommand(__method4, __query);
            java.sql.Array __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.SalEmpDaoImpl", "createString2DArray", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.SalEmpDaoImpl", "createString2DArray", __e);
            throw __e;
        }
    }

}
