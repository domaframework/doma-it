package org.seasar.doma.it.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.403+0900")
 class FunctionDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.seasar.doma.it.dao.FunctionDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.FunctionDao.class, "func_none_param");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.FunctionDao.class, "func_simpletype_param", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.FunctionDao.class, "func_simpletype_time_param", java.sql.Time.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.FunctionDao.class, "func_dto_param", java.lang.Integer.class, java.lang.Integer.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.FunctionDao.class, "func_dto_time_param", java.sql.Time.class, java.lang.Integer.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.FunctionDao.class, "func_resultset", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.FunctionDao.class, "func_resultset_check", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method7 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.FunctionDao.class, "func_resultset_nocheck", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method8 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.FunctionDao.class, "func_resultset_map", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method9 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.FunctionDao.class, "func_resultset_update", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method10 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.FunctionDao.class, "func_resultset_update2", java.lang.Integer.class);

    /** */
    public FunctionDaoImpl() {
        super(new org.seasar.doma.it.ItConfig());
    }

    /**
     * @param connection the connection
     */
    public FunctionDaoImpl(java.sql.Connection connection) {
        super(new org.seasar.doma.it.ItConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public FunctionDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.seasar.doma.it.ItConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected FunctionDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected FunctionDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected FunctionDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public java.lang.Integer func_none_param() {
        entering("org.seasar.doma.it.dao.FunctionDaoImpl", "func_none_param");
        try {
            org.seasar.doma.jdbc.query.AutoFunctionQuery<java.lang.Integer> __query = getQueryImplementors().createAutoFunctionQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setFunctionName("func_none_param");
            __query.setQuoteRequired(false);
            __query.setResultParameter(new org.seasar.doma.internal.jdbc.sql.BasicSingleResultParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, false));
            __query.setCallerClassName("org.seasar.doma.it.dao.FunctionDaoImpl");
            __query.setCallerMethodName("func_none_param");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.FunctionCommand<java.lang.Integer> __command = getCommandImplementors().createFunctionCommand(__method0, __query);
            java.lang.Integer __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.FunctionDaoImpl", "func_none_param", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.FunctionDaoImpl", "func_none_param", __e);
            throw __e;
        }
    }

    @Override
    public java.lang.Integer func_simpletype_param(java.lang.Integer param1) {
        entering("org.seasar.doma.it.dao.FunctionDaoImpl", "func_simpletype_param", param1);
        try {
            org.seasar.doma.jdbc.query.AutoFunctionQuery<java.lang.Integer> __query = getQueryImplementors().createAutoFunctionQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setFunctionName("func_simpletype_param");
            __query.setQuoteRequired(false);
            __query.setResultParameter(new org.seasar.doma.internal.jdbc.sql.BasicSingleResultParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, false));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, param1));
            __query.setCallerClassName("org.seasar.doma.it.dao.FunctionDaoImpl");
            __query.setCallerMethodName("func_simpletype_param");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.FunctionCommand<java.lang.Integer> __command = getCommandImplementors().createFunctionCommand(__method1, __query);
            java.lang.Integer __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.FunctionDaoImpl", "func_simpletype_param", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.FunctionDaoImpl", "func_simpletype_param", __e);
            throw __e;
        }
    }

    @Override
    public java.sql.Time func_simpletype_time_param(java.sql.Time param1) {
        entering("org.seasar.doma.it.dao.FunctionDaoImpl", "func_simpletype_time_param", param1);
        try {
            org.seasar.doma.jdbc.query.AutoFunctionQuery<java.sql.Time> __query = getQueryImplementors().createAutoFunctionQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setFunctionName("func_simpletype_time_param");
            __query.setQuoteRequired(false);
            __query.setResultParameter(new org.seasar.doma.internal.jdbc.sql.BasicSingleResultParameter<java.sql.Time>(org.seasar.doma.wrapper.TimeWrapper::new, false));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.sql.Time>(org.seasar.doma.wrapper.TimeWrapper::new, param1));
            __query.setCallerClassName("org.seasar.doma.it.dao.FunctionDaoImpl");
            __query.setCallerMethodName("func_simpletype_time_param");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.FunctionCommand<java.sql.Time> __command = getCommandImplementors().createFunctionCommand(__method2, __query);
            java.sql.Time __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.FunctionDaoImpl", "func_simpletype_time_param", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.FunctionDaoImpl", "func_simpletype_time_param", __e);
            throw __e;
        }
    }

    @Override
    public java.lang.Integer func_dto_param(java.lang.Integer param1, java.lang.Integer param2) {
        entering("org.seasar.doma.it.dao.FunctionDaoImpl", "func_dto_param", param1, param2);
        try {
            org.seasar.doma.jdbc.query.AutoFunctionQuery<java.lang.Integer> __query = getQueryImplementors().createAutoFunctionQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setFunctionName("func_dto_param");
            __query.setQuoteRequired(false);
            __query.setResultParameter(new org.seasar.doma.internal.jdbc.sql.BasicSingleResultParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, false));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, param1));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, param2));
            __query.setCallerClassName("org.seasar.doma.it.dao.FunctionDaoImpl");
            __query.setCallerMethodName("func_dto_param");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.FunctionCommand<java.lang.Integer> __command = getCommandImplementors().createFunctionCommand(__method3, __query);
            java.lang.Integer __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.FunctionDaoImpl", "func_dto_param", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.FunctionDaoImpl", "func_dto_param", __e);
            throw __e;
        }
    }

    @Override
    public java.sql.Time func_dto_time_param(java.sql.Time param1, java.lang.Integer param2) {
        entering("org.seasar.doma.it.dao.FunctionDaoImpl", "func_dto_time_param", param1, param2);
        try {
            org.seasar.doma.jdbc.query.AutoFunctionQuery<java.sql.Time> __query = getQueryImplementors().createAutoFunctionQuery(__method4);
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setFunctionName("func_dto_time_param");
            __query.setQuoteRequired(false);
            __query.setResultParameter(new org.seasar.doma.internal.jdbc.sql.BasicSingleResultParameter<java.sql.Time>(org.seasar.doma.wrapper.TimeWrapper::new, false));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.sql.Time>(org.seasar.doma.wrapper.TimeWrapper::new, param1));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, param2));
            __query.setCallerClassName("org.seasar.doma.it.dao.FunctionDaoImpl");
            __query.setCallerMethodName("func_dto_time_param");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.FunctionCommand<java.sql.Time> __command = getCommandImplementors().createFunctionCommand(__method4, __query);
            java.sql.Time __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.FunctionDaoImpl", "func_dto_time_param", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.FunctionDaoImpl", "func_dto_time_param", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Employee> func_resultset(java.lang.Integer employee_id) {
        entering("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset", employee_id);
        try {
            org.seasar.doma.jdbc.query.AutoFunctionQuery<java.util.List<org.seasar.doma.it.entity.Employee>> __query = getQueryImplementors().createAutoFunctionQuery(__method5);
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setFunctionName("func_resultset");
            __query.setQuoteRequired(false);
            __query.setResultParameter(new org.seasar.doma.internal.jdbc.sql.EntityResultListParameter<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal(), false));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, employee_id));
            __query.setCallerClassName("org.seasar.doma.it.dao.FunctionDaoImpl");
            __query.setCallerMethodName("func_resultset");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.FunctionCommand<java.util.List<org.seasar.doma.it.entity.Employee>> __command = getCommandImplementors().createFunctionCommand(__method5, __query);
            java.util.List<org.seasar.doma.it.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Employee> func_resultset_check(java.lang.Integer employee_id) {
        entering("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset_check", employee_id);
        try {
            org.seasar.doma.jdbc.query.AutoFunctionQuery<java.util.List<org.seasar.doma.it.entity.Employee>> __query = getQueryImplementors().createAutoFunctionQuery(__method6);
            __query.setMethod(__method6);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setFunctionName("func_resultset");
            __query.setQuoteRequired(false);
            __query.setResultParameter(new org.seasar.doma.internal.jdbc.sql.EntityResultListParameter<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal(), true));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, employee_id));
            __query.setCallerClassName("org.seasar.doma.it.dao.FunctionDaoImpl");
            __query.setCallerMethodName("func_resultset_check");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.FunctionCommand<java.util.List<org.seasar.doma.it.entity.Employee>> __command = getCommandImplementors().createFunctionCommand(__method6, __query);
            java.util.List<org.seasar.doma.it.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset_check", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset_check", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Employee> func_resultset_nocheck(java.lang.Integer employee_id) {
        entering("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset_nocheck", employee_id);
        try {
            org.seasar.doma.jdbc.query.AutoFunctionQuery<java.util.List<org.seasar.doma.it.entity.Employee>> __query = getQueryImplementors().createAutoFunctionQuery(__method7);
            __query.setMethod(__method7);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setFunctionName("func_resultset");
            __query.setQuoteRequired(false);
            __query.setResultParameter(new org.seasar.doma.internal.jdbc.sql.EntityResultListParameter<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal(), false));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, employee_id));
            __query.setCallerClassName("org.seasar.doma.it.dao.FunctionDaoImpl");
            __query.setCallerMethodName("func_resultset_nocheck");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.FunctionCommand<java.util.List<org.seasar.doma.it.entity.Employee>> __command = getCommandImplementors().createFunctionCommand(__method7, __query);
            java.util.List<org.seasar.doma.it.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset_nocheck", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset_nocheck", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> func_resultset_map(java.lang.Integer employee_id) {
        entering("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset_map", employee_id);
        try {
            org.seasar.doma.jdbc.query.AutoFunctionQuery<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> __query = getQueryImplementors().createAutoFunctionQuery(__method8);
            __query.setMethod(__method8);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setFunctionName("func_resultset");
            __query.setQuoteRequired(false);
            __query.setResultParameter(new org.seasar.doma.internal.jdbc.sql.MapResultListParameter(org.seasar.doma.MapKeyNamingType.CAMEL_CASE));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, employee_id));
            __query.setCallerClassName("org.seasar.doma.it.dao.FunctionDaoImpl");
            __query.setCallerMethodName("func_resultset_map");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.FunctionCommand<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> __command = getCommandImplementors().createFunctionCommand(__method8, __query);
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset_map", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset_map", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Employee> func_resultset_update(java.lang.Integer employee_id) {
        entering("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset_update", employee_id);
        try {
            org.seasar.doma.jdbc.query.AutoFunctionQuery<java.util.List<org.seasar.doma.it.entity.Employee>> __query = getQueryImplementors().createAutoFunctionQuery(__method9);
            __query.setMethod(__method9);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setFunctionName("func_resultset_update");
            __query.setQuoteRequired(false);
            __query.setResultParameter(new org.seasar.doma.internal.jdbc.sql.EntityResultListParameter<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal(), false));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, employee_id));
            __query.setCallerClassName("org.seasar.doma.it.dao.FunctionDaoImpl");
            __query.setCallerMethodName("func_resultset_update");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.FunctionCommand<java.util.List<org.seasar.doma.it.entity.Employee>> __command = getCommandImplementors().createFunctionCommand(__method9, __query);
            java.util.List<org.seasar.doma.it.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset_update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset_update", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.seasar.doma.it.entity.Employee> func_resultset_update2(java.lang.Integer employee_id) {
        entering("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset_update2", employee_id);
        try {
            org.seasar.doma.jdbc.query.AutoFunctionQuery<java.util.List<org.seasar.doma.it.entity.Employee>> __query = getQueryImplementors().createAutoFunctionQuery(__method10);
            __query.setMethod(__method10);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setFunctionName("func_resultset_update2");
            __query.setQuoteRequired(false);
            __query.setResultParameter(new org.seasar.doma.internal.jdbc.sql.EntityResultListParameter<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal(), false));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, employee_id));
            __query.setCallerClassName("org.seasar.doma.it.dao.FunctionDaoImpl");
            __query.setCallerMethodName("func_resultset_update2");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.FunctionCommand<java.util.List<org.seasar.doma.it.entity.Employee>> __command = getCommandImplementors().createFunctionCommand(__method10, __query);
            java.util.List<org.seasar.doma.it.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset_update2", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.FunctionDaoImpl", "func_resultset_update2", __e);
            throw __e;
        }
    }

}
