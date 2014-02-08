package org.seasar.doma.it.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.379+0900")
 class EmployeeDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.seasar.doma.it.dao.EmployeeDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectByExample", org.seasar.doma.it.entity.Employee.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectWithOptionalOrderBy", java.lang.String.class, java.lang.String.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectById", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectById", java.lang.Integer.class, org.seasar.doma.jdbc.SelectOptions.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectByNames", java.util.List.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectByIdAsMap", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectAllAsMapList");

    private static final java.lang.reflect.Method __method7 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectAllAsMapList", org.seasar.doma.jdbc.IterationCallback.class);

    private static final java.lang.reflect.Method __method8 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectAllAsMapList", org.seasar.doma.jdbc.IterationCallback.class, org.seasar.doma.jdbc.SelectOptions.class);

    private static final java.lang.reflect.Method __method9 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectByNamePrefix", java.lang.String.class);

    private static final java.lang.reflect.Method __method10 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectByNameInfix", java.lang.String.class);

    private static final java.lang.reflect.Method __method11 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectByNameSuffix", java.lang.String.class);

    private static final java.lang.reflect.Method __method12 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectAll");

    private static final java.lang.reflect.Method __method13 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectAll", org.seasar.doma.jdbc.SelectOptions.class);

    private static final java.lang.reflect.Method __method14 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectOnlyNameWithMappingCheck");

    private static final java.lang.reflect.Method __method15 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectOnlyNameWithoutMappingCheck");

    private static final java.lang.reflect.Method __method16 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectAll", org.seasar.doma.jdbc.IterationCallback.class);

    private static final java.lang.reflect.Method __method17 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectAll", org.seasar.doma.jdbc.IterationCallback.class, org.seasar.doma.jdbc.SelectOptions.class);

    private static final java.lang.reflect.Method __method18 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectAllSalary", org.seasar.doma.jdbc.IterationCallback.class);

    private static final java.lang.reflect.Method __method19 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "selectAllSalary", org.seasar.doma.jdbc.IterationCallback.class, org.seasar.doma.jdbc.SelectOptions.class);

    private static final java.lang.reflect.Method __method20 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "streamAll", java.util.function.Function.class);

    private static final java.lang.reflect.Method __method21 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "streamBySalary", java.math.BigDecimal.class, java.util.function.Function.class);

    private static final java.lang.reflect.Method __method23 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "delete", org.seasar.doma.it.entity.Employee.class);

    private static final java.lang.reflect.Method __method24 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "deleteBySqlFile", org.seasar.doma.it.entity.Employee.class);

    private static final java.lang.reflect.Method __method25 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "delete_ignoreVersion", org.seasar.doma.it.entity.Employee.class);

    private static final java.lang.reflect.Method __method26 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "delete_suppressOptimisticLockException", org.seasar.doma.it.entity.Employee.class);

    private static final java.lang.reflect.Method __method27 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "delete", java.util.List.class);

    private static final java.lang.reflect.Method __method28 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "delete_ignoreVersion", java.util.List.class);

    private static final java.lang.reflect.Method __method29 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "delete_suppressOptimisticLockException", java.util.List.class);

    private static final java.lang.reflect.Method __method30 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.EmployeeDao.class, "deleteBySqlFile", java.util.List.class);

    /** */
    public EmployeeDaoImpl() {
        super(new org.seasar.doma.it.ItConfig());
    }

    /**
     * @param connection the connection
     */
    public EmployeeDaoImpl(java.sql.Connection connection) {
        super(new org.seasar.doma.it.ItConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public EmployeeDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.seasar.doma.it.ItConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected EmployeeDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected EmployeeDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected EmployeeDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Employee> selectByExample(org.seasar.doma.it.entity.Employee e) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByExample", e);
        try {
            if (e == null) {
                throw new org.seasar.doma.DomaNullPointerException("e");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectByExample.sql");
            __query.addParameter("e", org.seasar.doma.it.entity.Employee.class, e);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectByExample");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<org.seasar.doma.it.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal()));
            java.util.List<org.seasar.doma.it.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByExample", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByExample", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Employee> selectWithOptionalOrderBy(java.lang.String employeeName, java.lang.String orderBy) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectWithOptionalOrderBy", employeeName, orderBy);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectWithOptionalOrderBy.sql");
            __query.addParameter("employeeName", java.lang.String.class, employeeName);
            __query.addParameter("orderBy", java.lang.String.class, orderBy);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectWithOptionalOrderBy");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<org.seasar.doma.it.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal()));
            java.util.List<org.seasar.doma.it.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectWithOptionalOrderBy", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectWithOptionalOrderBy", __e);
            throw __e;
        }
    }

    @Override
    public org.seasar.doma.it.entity.Employee selectById(java.lang.Integer employeeId) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectById", employeeId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectById.sql");
            __query.addParameter("employeeId", java.lang.Integer.class, employeeId);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<org.seasar.doma.it.entity.Employee> __command = getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal()));
            org.seasar.doma.it.entity.Employee __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public org.seasar.doma.it.entity.Employee selectById(java.lang.Integer employeeId, org.seasar.doma.jdbc.SelectOptions options) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectById", employeeId, options);
        try {
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectById.sql");
            __query.setOptions(options);
            __query.addParameter("employeeId", java.lang.Integer.class, employeeId);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<org.seasar.doma.it.entity.Employee> __command = getCommandImplementors().createSelectCommand(__method3, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal()));
            org.seasar.doma.it.entity.Employee __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Employee> selectByNames(java.util.List<java.lang.String> names) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByNames", names);
        try {
            if (names == null) {
                throw new org.seasar.doma.DomaNullPointerException("names");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method4);
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectByNames.sql");
            __query.addParameter("names", java.util.List.class, names);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectByNames");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<org.seasar.doma.it.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method4, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal()));
            java.util.List<org.seasar.doma.it.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByNames", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByNames", __e);
            throw __e;
        }
    }

    @Override
    public java.util.Map<java.lang.String, java.lang.Object> selectByIdAsMap(java.lang.Integer employeeId) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByIdAsMap", employeeId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method5);
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectByIdAsMap.sql");
            __query.addParameter("employeeId", java.lang.Integer.class, employeeId);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectByIdAsMap");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.Map<java.lang.String, java.lang.Object>> __command = getCommandImplementors().createSelectCommand(__method5, __query, new org.seasar.doma.internal.jdbc.command.MapSingleResultHandler(org.seasar.doma.MapKeyNamingType.CAMEL_CASE));
            java.util.Map<java.lang.String, java.lang.Object> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByIdAsMap", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByIdAsMap", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> selectAllAsMapList() {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAllAsMapList");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method6);
            __query.setMethod(__method6);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectAllAsMapList.sql");
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectAllAsMapList");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> __command = getCommandImplementors().createSelectCommand(__method6, __query, new org.seasar.doma.internal.jdbc.command.MapResultListHandler(org.seasar.doma.MapKeyNamingType.CAMEL_CASE));
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAllAsMapList", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAllAsMapList", __e);
            throw __e;
        }
    }

    @Override
    public <R> R selectAllAsMapList(org.seasar.doma.jdbc.IterationCallback<java.util.Map<java.lang.String, java.lang.Object>, R> callback) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAllAsMapList", callback);
        try {
            if (callback == null) {
                throw new org.seasar.doma.DomaNullPointerException("callback");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method7);
            __query.setMethod(__method7);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectAllAsMapList.sql");
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectAllAsMapList");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<R> __command = getCommandImplementors().createSelectCommand(__method7, __query, new org.seasar.doma.internal.jdbc.command.MapIterationHandler<R>(org.seasar.doma.MapKeyNamingType.CAMEL_CASE, callback));
            R __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAllAsMapList", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAllAsMapList", __e);
            throw __e;
        }
    }

    @Override
    public <R> R selectAllAsMapList(org.seasar.doma.jdbc.IterationCallback<java.util.Map<java.lang.String, java.lang.Object>, R> callback, org.seasar.doma.jdbc.SelectOptions options) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAllAsMapList", callback, options);
        try {
            if (callback == null) {
                throw new org.seasar.doma.DomaNullPointerException("callback");
            }
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method8);
            __query.setMethod(__method8);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectAllAsMapList.sql");
            __query.setOptions(options);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectAllAsMapList");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<R> __command = getCommandImplementors().createSelectCommand(__method8, __query, new org.seasar.doma.internal.jdbc.command.MapIterationHandler<R>(org.seasar.doma.MapKeyNamingType.CAMEL_CASE, callback));
            R __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAllAsMapList", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAllAsMapList", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Employee> selectByNamePrefix(java.lang.String employeeName) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByNamePrefix", employeeName);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method9);
            __query.setMethod(__method9);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectByNamePrefix.sql");
            __query.addParameter("employeeName", java.lang.String.class, employeeName);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectByNamePrefix");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<org.seasar.doma.it.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method9, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal()));
            java.util.List<org.seasar.doma.it.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByNamePrefix", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByNamePrefix", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Employee> selectByNameInfix(java.lang.String employeeName) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByNameInfix", employeeName);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method10);
            __query.setMethod(__method10);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectByNameInfix.sql");
            __query.addParameter("employeeName", java.lang.String.class, employeeName);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectByNameInfix");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<org.seasar.doma.it.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method10, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal()));
            java.util.List<org.seasar.doma.it.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByNameInfix", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByNameInfix", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Employee> selectByNameSuffix(java.lang.String employeeName) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByNameSuffix", employeeName);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method11);
            __query.setMethod(__method11);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectByNameSuffix.sql");
            __query.addParameter("employeeName", java.lang.String.class, employeeName);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectByNameSuffix");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<org.seasar.doma.it.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method11, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal()));
            java.util.List<org.seasar.doma.it.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByNameSuffix", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectByNameSuffix", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Employee> selectAll() {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method12);
            __query.setMethod(__method12);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectAll.sql");
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<org.seasar.doma.it.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method12, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal()));
            java.util.List<org.seasar.doma.it.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Employee> selectAll(org.seasar.doma.jdbc.SelectOptions options) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAll", options);
        try {
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method13);
            __query.setMethod(__method13);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectAll.sql");
            __query.setOptions(options);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<org.seasar.doma.it.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method13, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal()));
            java.util.List<org.seasar.doma.it.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Employee> selectOnlyNameWithMappingCheck() {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectOnlyNameWithMappingCheck");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method14);
            __query.setMethod(__method14);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectOnlyNameWithMappingCheck.sql");
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectOnlyNameWithMappingCheck");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(true);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<org.seasar.doma.it.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method14, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal()));
            java.util.List<org.seasar.doma.it.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectOnlyNameWithMappingCheck", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectOnlyNameWithMappingCheck", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Employee> selectOnlyNameWithoutMappingCheck() {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectOnlyNameWithoutMappingCheck");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method15);
            __query.setMethod(__method15);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectOnlyNameWithoutMappingCheck.sql");
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectOnlyNameWithoutMappingCheck");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<org.seasar.doma.it.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method15, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal()));
            java.util.List<org.seasar.doma.it.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectOnlyNameWithoutMappingCheck", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectOnlyNameWithoutMappingCheck", __e);
            throw __e;
        }
    }

    @Override
    public <R> R selectAll(org.seasar.doma.jdbc.IterationCallback<org.seasar.doma.it.entity.Employee, R> callback) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAll", callback);
        try {
            if (callback == null) {
                throw new org.seasar.doma.DomaNullPointerException("callback");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method16);
            __query.setMethod(__method16);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectAll.sql");
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<R> __command = getCommandImplementors().createSelectCommand(__method16, __query, new org.seasar.doma.internal.jdbc.command.EntityIterationHandler<org.seasar.doma.it.entity.Employee, R>(org.seasar.doma.it.entity._Employee.getSingletonInternal(), callback));
            R __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public <R> R selectAll(org.seasar.doma.jdbc.IterationCallback<org.seasar.doma.it.entity.Employee, R> callback, org.seasar.doma.jdbc.SelectOptions options) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAll", callback, options);
        try {
            if (callback == null) {
                throw new org.seasar.doma.DomaNullPointerException("callback");
            }
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method17);
            __query.setMethod(__method17);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectAll.sql");
            __query.setOptions(options);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<R> __command = getCommandImplementors().createSelectCommand(__method17, __query, new org.seasar.doma.internal.jdbc.command.EntityIterationHandler<org.seasar.doma.it.entity.Employee, R>(org.seasar.doma.it.entity._Employee.getSingletonInternal(), callback));
            R __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public <R> R selectAllSalary(org.seasar.doma.jdbc.IterationCallback<java.math.BigDecimal, R> callback) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAllSalary", callback);
        try {
            if (callback == null) {
                throw new org.seasar.doma.DomaNullPointerException("callback");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method18);
            __query.setMethod(__method18);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectAllSalary.sql");
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectAllSalary");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<R> __command = getCommandImplementors().createSelectCommand(__method18, __query, new org.seasar.doma.internal.jdbc.command.BasicIterationHandler<java.math.BigDecimal, R>(org.seasar.doma.wrapper.BigDecimalWrapper::new, callback));
            R __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAllSalary", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAllSalary", __e);
            throw __e;
        }
    }

    @Override
    public <R> R selectAllSalary(org.seasar.doma.jdbc.IterationCallback<java.math.BigDecimal, R> callback, org.seasar.doma.jdbc.SelectOptions options) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAllSalary", callback, options);
        try {
            if (callback == null) {
                throw new org.seasar.doma.DomaNullPointerException("callback");
            }
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method19);
            __query.setMethod(__method19);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/selectAllSalary.sql");
            __query.setOptions(options);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectAllSalary");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<R> __command = getCommandImplementors().createSelectCommand(__method19, __query, new org.seasar.doma.internal.jdbc.command.BasicIterationHandler<java.math.BigDecimal, R>(org.seasar.doma.wrapper.BigDecimalWrapper::new, callback));
            R __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAllSalary", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectAllSalary", __e);
            throw __e;
        }
    }

    @Override
    public <R> R streamAll(java.util.function.Function<java.util.stream.Stream<org.seasar.doma.it.entity.Employee>, R> mapper) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "streamAll", mapper);
        try {
            if (mapper == null) {
                throw new org.seasar.doma.DomaNullPointerException("mapper");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method20);
            __query.setMethod(__method20);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/streamAll.sql");
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("streamAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<R> __command = getCommandImplementors().createSelectCommand(__method20, __query, new org.seasar.doma.internal.jdbc.command.EntityStreamHandler<R, org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal(), mapper));
            R __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "streamAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "streamAll", __e);
            throw __e;
        }
    }

    @Override
    public <R> R streamBySalary(java.math.BigDecimal salary, java.util.function.Function<java.util.stream.Stream<org.seasar.doma.it.entity.Employee>, R> mapper) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "streamBySalary", salary, mapper);
        try {
            if (mapper == null) {
                throw new org.seasar.doma.DomaNullPointerException("mapper");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method21);
            __query.setMethod(__method21);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/streamBySalary.sql");
            __query.addParameter("salary", java.math.BigDecimal.class, salary);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("streamBySalary");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<R> __command = getCommandImplementors().createSelectCommand(__method21, __query, new org.seasar.doma.internal.jdbc.command.EntityStreamHandler<R, org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal(), mapper));
            R __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "streamBySalary", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "streamBySalary", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Employee> selectWithBuilder() {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectWithBuilder");
        try {
            java.util.List<org.seasar.doma.it.entity.Employee> __result = org.seasar.doma.it.dao.EmployeeDao.super.selectWithBuilder();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectWithBuilder", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "selectWithBuilder", __e);
            throw __e;
        }
    }

    @Override
    public int delete(org.seasar.doma.it.entity.Employee entity) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<org.seasar.doma.it.entity.Employee> __query = getQueryImplementors().createAutoDeleteQuery(__method23, org.seasar.doma.it.entity._Employee.getSingletonInternal());
            __query.setMethod(__method23);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method23, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int deleteBySqlFile(org.seasar.doma.it.entity.Employee entity) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "deleteBySqlFile", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.SqlFileDeleteQuery __query = getQueryImplementors().createSqlFileDeleteQuery(__method24);
            __query.setMethod(__method24);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/deleteBySqlFile.sql");
            __query.addParameter("entity", org.seasar.doma.it.entity.Employee.class, entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("deleteBySqlFile");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("entity", entity, org.seasar.doma.it.entity._Employee.getSingletonInternal());
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method24, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "deleteBySqlFile", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "deleteBySqlFile", __e);
            throw __e;
        }
    }

    @Override
    public int delete_ignoreVersion(org.seasar.doma.it.entity.Employee entity) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete_ignoreVersion", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<org.seasar.doma.it.entity.Employee> __query = getQueryImplementors().createAutoDeleteQuery(__method25, org.seasar.doma.it.entity._Employee.getSingletonInternal());
            __query.setMethod(__method25);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("delete_ignoreVersion");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(true);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method25, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete_ignoreVersion", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete_ignoreVersion", __e);
            throw __e;
        }
    }

    @Override
    public int delete_suppressOptimisticLockException(org.seasar.doma.it.entity.Employee entity) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete_suppressOptimisticLockException", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<org.seasar.doma.it.entity.Employee> __query = getQueryImplementors().createAutoDeleteQuery(__method26, org.seasar.doma.it.entity._Employee.getSingletonInternal());
            __query.setMethod(__method26);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("delete_suppressOptimisticLockException");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(true);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method26, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete_suppressOptimisticLockException", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete_suppressOptimisticLockException", __e);
            throw __e;
        }
    }

    @Override
    public int[] delete(java.util.List<org.seasar.doma.it.entity.Employee> entity) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoBatchDeleteQuery<org.seasar.doma.it.entity.Employee> __query = getQueryImplementors().createAutoBatchDeleteQuery(__method27, org.seasar.doma.it.entity._Employee.getSingletonInternal());
            __query.setMethod(__method27);
            __query.setConfig(__config);
            __query.setEntities(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchDeleteCommand __command = getCommandImplementors().createBatchDeleteCommand(__method27, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int[] delete_ignoreVersion(java.util.List<org.seasar.doma.it.entity.Employee> entity) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete_ignoreVersion", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoBatchDeleteQuery<org.seasar.doma.it.entity.Employee> __query = getQueryImplementors().createAutoBatchDeleteQuery(__method28, org.seasar.doma.it.entity._Employee.getSingletonInternal());
            __query.setMethod(__method28);
            __query.setConfig(__config);
            __query.setEntities(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("delete_ignoreVersion");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIgnored(true);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchDeleteCommand __command = getCommandImplementors().createBatchDeleteCommand(__method28, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete_ignoreVersion", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete_ignoreVersion", __e);
            throw __e;
        }
    }

    @Override
    public int[] delete_suppressOptimisticLockException(java.util.List<org.seasar.doma.it.entity.Employee> entity) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete_suppressOptimisticLockException", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoBatchDeleteQuery<org.seasar.doma.it.entity.Employee> __query = getQueryImplementors().createAutoBatchDeleteQuery(__method29, org.seasar.doma.it.entity._Employee.getSingletonInternal());
            __query.setMethod(__method29);
            __query.setConfig(__config);
            __query.setEntities(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("delete_suppressOptimisticLockException");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(true);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchDeleteCommand __command = getCommandImplementors().createBatchDeleteCommand(__method29, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete_suppressOptimisticLockException", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "delete_suppressOptimisticLockException", __e);
            throw __e;
        }
    }

    @Override
    public int[] deleteBySqlFile(java.util.List<org.seasar.doma.it.entity.Employee> entity) {
        entering("org.seasar.doma.it.dao.EmployeeDaoImpl", "deleteBySqlFile", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.SqlFileBatchDeleteQuery<org.seasar.doma.it.entity.Employee> __query = getQueryImplementors().createSqlFileBatchDeleteQuery(__method30, org.seasar.doma.it.entity.Employee.class);
            __query.setMethod(__method30);
            __query.setConfig(__config);
            __query.setElements(entity);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/EmployeeDao/deleteBySqlFile.sql");
            __query.setParameterName("entity");
            __query.setCallerClassName("org.seasar.doma.it.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("deleteBySqlFile");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setEntityType(org.seasar.doma.it.entity._Employee.getSingletonInternal());
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchDeleteCommand __command = getCommandImplementors().createBatchDeleteCommand(__method30, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.EmployeeDaoImpl", "deleteBySqlFile", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.EmployeeDaoImpl", "deleteBySqlFile", __e);
            throw __e;
        }
    }

}
