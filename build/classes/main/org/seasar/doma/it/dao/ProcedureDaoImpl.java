package org.seasar.doma.it.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.437+0900")
 class ProcedureDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.seasar.doma.it.dao.ProcedureDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.ProcedureDao.class, "proc_none_param");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.ProcedureDao.class, "proc_simpletype_param", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.ProcedureDao.class, "proc_simpletype_time_param", java.sql.Time.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.ProcedureDao.class, "proc_dto_param", java.lang.Integer.class, org.seasar.doma.jdbc.Reference.class, org.seasar.doma.jdbc.Reference.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.ProcedureDao.class, "proc_dto_time_param", java.sql.Time.class, org.seasar.doma.jdbc.Reference.class, org.seasar.doma.jdbc.Reference.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.ProcedureDao.class, "proc_resultset", java.util.List.class, java.lang.Integer.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.ProcedureDao.class, "proc_resultset_check", java.util.List.class, java.lang.Integer.class);

    private static final java.lang.reflect.Method __method7 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.ProcedureDao.class, "proc_resultset_nocheck", java.util.List.class, java.lang.Integer.class);

    private static final java.lang.reflect.Method __method8 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.ProcedureDao.class, "proc_resultset_map", java.util.List.class, java.lang.Integer.class);

    private static final java.lang.reflect.Method __method9 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.ProcedureDao.class, "proc_resultset_out", java.util.List.class, java.lang.Integer.class, org.seasar.doma.jdbc.Reference.class);

    private static final java.lang.reflect.Method __method10 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.ProcedureDao.class, "proc_resultset_update", java.util.List.class, java.lang.Integer.class);

    private static final java.lang.reflect.Method __method11 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.ProcedureDao.class, "proc_resultset_update2", java.util.List.class, java.lang.Integer.class);

    private static final java.lang.reflect.Method __method12 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.ProcedureDao.class, "proc_resultsets", java.util.List.class, java.util.List.class, java.lang.Integer.class, java.lang.Integer.class);

    private static final java.lang.reflect.Method __method13 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.ProcedureDao.class, "proc_resultsets_updates_out", java.util.List.class, java.util.List.class, java.lang.Integer.class, java.lang.Integer.class, org.seasar.doma.jdbc.Reference.class);

    /** */
    public ProcedureDaoImpl() {
        super(new org.seasar.doma.it.ItConfig());
    }

    /**
     * @param connection the connection
     */
    public ProcedureDaoImpl(java.sql.Connection connection) {
        super(new org.seasar.doma.it.ItConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public ProcedureDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.seasar.doma.it.ItConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected ProcedureDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected ProcedureDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected ProcedureDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public void proc_none_param() {
        entering("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_none_param");
        try {
            org.seasar.doma.jdbc.query.AutoProcedureQuery __query = getQueryImplementors().createAutoProcedureQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setProcedureName("proc_none_param");
            __query.setQuoteRequired(false);
            __query.setCallerClassName("org.seasar.doma.it.dao.ProcedureDaoImpl");
            __query.setCallerMethodName("proc_none_param");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.ProcedureCommand __command = getCommandImplementors().createProcedureCommand(__method0, __query);
            __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_none_param", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_none_param", __e);
            throw __e;
        }
    }

    @Override
    public void proc_simpletype_param(java.lang.Integer param1) {
        entering("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_simpletype_param", param1);
        try {
            org.seasar.doma.jdbc.query.AutoProcedureQuery __query = getQueryImplementors().createAutoProcedureQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setProcedureName("proc_simpletype_param");
            __query.setQuoteRequired(false);
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, param1));
            __query.setCallerClassName("org.seasar.doma.it.dao.ProcedureDaoImpl");
            __query.setCallerMethodName("proc_simpletype_param");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.ProcedureCommand __command = getCommandImplementors().createProcedureCommand(__method1, __query);
            __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_simpletype_param", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_simpletype_param", __e);
            throw __e;
        }
    }

    @Override
    public void proc_simpletype_time_param(java.sql.Time param1) {
        entering("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_simpletype_time_param", param1);
        try {
            org.seasar.doma.jdbc.query.AutoProcedureQuery __query = getQueryImplementors().createAutoProcedureQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setProcedureName("proc_simpletype_time_param");
            __query.setQuoteRequired(false);
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.sql.Time>(org.seasar.doma.wrapper.TimeWrapper::new, param1));
            __query.setCallerClassName("org.seasar.doma.it.dao.ProcedureDaoImpl");
            __query.setCallerMethodName("proc_simpletype_time_param");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.ProcedureCommand __command = getCommandImplementors().createProcedureCommand(__method2, __query);
            __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_simpletype_time_param", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_simpletype_time_param", __e);
            throw __e;
        }
    }

    @Override
    public void proc_dto_param(java.lang.Integer param1, org.seasar.doma.jdbc.Reference<java.lang.Integer> param2, org.seasar.doma.jdbc.Reference<java.lang.Integer> param3) {
        entering("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_dto_param", param1, param2, param3);
        try {
            if (param2 == null) {
                throw new org.seasar.doma.DomaNullPointerException("param2");
            }
            if (param3 == null) {
                throw new org.seasar.doma.DomaNullPointerException("param3");
            }
            org.seasar.doma.jdbc.query.AutoProcedureQuery __query = getQueryImplementors().createAutoProcedureQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setProcedureName("proc_dto_param");
            __query.setQuoteRequired(false);
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, param1));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInOutParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, param2));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicOutParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, param3));
            __query.setCallerClassName("org.seasar.doma.it.dao.ProcedureDaoImpl");
            __query.setCallerMethodName("proc_dto_param");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.ProcedureCommand __command = getCommandImplementors().createProcedureCommand(__method3, __query);
            __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_dto_param", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_dto_param", __e);
            throw __e;
        }
    }

    @Override
    public void proc_dto_time_param(java.sql.Time param1, org.seasar.doma.jdbc.Reference<java.sql.Time> param2, org.seasar.doma.jdbc.Reference<java.sql.Time> param3) {
        entering("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_dto_time_param", param1, param2, param3);
        try {
            if (param2 == null) {
                throw new org.seasar.doma.DomaNullPointerException("param2");
            }
            if (param3 == null) {
                throw new org.seasar.doma.DomaNullPointerException("param3");
            }
            org.seasar.doma.jdbc.query.AutoProcedureQuery __query = getQueryImplementors().createAutoProcedureQuery(__method4);
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setProcedureName("proc_dto_time_param");
            __query.setQuoteRequired(false);
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.sql.Time>(org.seasar.doma.wrapper.TimeWrapper::new, param1));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInOutParameter<java.sql.Time>(org.seasar.doma.wrapper.TimeWrapper::new, param2));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicOutParameter<java.sql.Time>(org.seasar.doma.wrapper.TimeWrapper::new, param3));
            __query.setCallerClassName("org.seasar.doma.it.dao.ProcedureDaoImpl");
            __query.setCallerMethodName("proc_dto_time_param");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.ProcedureCommand __command = getCommandImplementors().createProcedureCommand(__method4, __query);
            __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_dto_time_param", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_dto_time_param", __e);
            throw __e;
        }
    }

    @Override
    public void proc_resultset(java.util.List<org.seasar.doma.it.entity.Employee> employees, java.lang.Integer employee_id) {
        entering("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset", employees, employee_id);
        try {
            if (employees == null) {
                throw new org.seasar.doma.DomaNullPointerException("employees");
            }
            org.seasar.doma.jdbc.query.AutoProcedureQuery __query = getQueryImplementors().createAutoProcedureQuery(__method5);
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setProcedureName("proc_resultset");
            __query.setQuoteRequired(false);
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.EntityListParameter<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal(), employees, "employees", false));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, employee_id));
            __query.setCallerClassName("org.seasar.doma.it.dao.ProcedureDaoImpl");
            __query.setCallerMethodName("proc_resultset");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.ProcedureCommand __command = getCommandImplementors().createProcedureCommand(__method5, __query);
            __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset", __e);
            throw __e;
        }
    }

    @Override
    public void proc_resultset_check(java.util.List<org.seasar.doma.it.entity.Employee> employees, java.lang.Integer employee_id) {
        entering("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_check", employees, employee_id);
        try {
            if (employees == null) {
                throw new org.seasar.doma.DomaNullPointerException("employees");
            }
            org.seasar.doma.jdbc.query.AutoProcedureQuery __query = getQueryImplementors().createAutoProcedureQuery(__method6);
            __query.setMethod(__method6);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setProcedureName("proc_resultset");
            __query.setQuoteRequired(false);
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.EntityListParameter<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal(), employees, "employees", true));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, employee_id));
            __query.setCallerClassName("org.seasar.doma.it.dao.ProcedureDaoImpl");
            __query.setCallerMethodName("proc_resultset_check");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.ProcedureCommand __command = getCommandImplementors().createProcedureCommand(__method6, __query);
            __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_check", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_check", __e);
            throw __e;
        }
    }

    @Override
    public void proc_resultset_nocheck(java.util.List<org.seasar.doma.it.entity.Employee> employees, java.lang.Integer employee_id) {
        entering("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_nocheck", employees, employee_id);
        try {
            if (employees == null) {
                throw new org.seasar.doma.DomaNullPointerException("employees");
            }
            org.seasar.doma.jdbc.query.AutoProcedureQuery __query = getQueryImplementors().createAutoProcedureQuery(__method7);
            __query.setMethod(__method7);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setProcedureName("proc_resultset");
            __query.setQuoteRequired(false);
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.EntityListParameter<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal(), employees, "employees", false));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, employee_id));
            __query.setCallerClassName("org.seasar.doma.it.dao.ProcedureDaoImpl");
            __query.setCallerMethodName("proc_resultset_nocheck");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.ProcedureCommand __command = getCommandImplementors().createProcedureCommand(__method7, __query);
            __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_nocheck", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_nocheck", __e);
            throw __e;
        }
    }

    @Override
    public void proc_resultset_map(java.util.List<java.util.Map<java.lang.String, java.lang.Object>> employees, java.lang.Integer employee_id) {
        entering("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_map", employees, employee_id);
        try {
            if (employees == null) {
                throw new org.seasar.doma.DomaNullPointerException("employees");
            }
            org.seasar.doma.jdbc.query.AutoProcedureQuery __query = getQueryImplementors().createAutoProcedureQuery(__method8);
            __query.setMethod(__method8);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setProcedureName("proc_resultset");
            __query.setQuoteRequired(false);
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.MapListParameter(org.seasar.doma.MapKeyNamingType.CAMEL_CASE, employees, "employees"));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, employee_id));
            __query.setCallerClassName("org.seasar.doma.it.dao.ProcedureDaoImpl");
            __query.setCallerMethodName("proc_resultset_map");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.ProcedureCommand __command = getCommandImplementors().createProcedureCommand(__method8, __query);
            __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_map", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_map", __e);
            throw __e;
        }
    }

    @Override
    public void proc_resultset_out(java.util.List<org.seasar.doma.it.entity.Employee> employees, java.lang.Integer employee_id, org.seasar.doma.jdbc.Reference<java.lang.Integer> count) {
        entering("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_out", employees, employee_id, count);
        try {
            if (employees == null) {
                throw new org.seasar.doma.DomaNullPointerException("employees");
            }
            if (count == null) {
                throw new org.seasar.doma.DomaNullPointerException("count");
            }
            org.seasar.doma.jdbc.query.AutoProcedureQuery __query = getQueryImplementors().createAutoProcedureQuery(__method9);
            __query.setMethod(__method9);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setProcedureName("proc_resultset_out");
            __query.setQuoteRequired(false);
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.EntityListParameter<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal(), employees, "employees", false));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, employee_id));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicOutParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, count));
            __query.setCallerClassName("org.seasar.doma.it.dao.ProcedureDaoImpl");
            __query.setCallerMethodName("proc_resultset_out");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.ProcedureCommand __command = getCommandImplementors().createProcedureCommand(__method9, __query);
            __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_out", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_out", __e);
            throw __e;
        }
    }

    @Override
    public void proc_resultset_update(java.util.List<org.seasar.doma.it.entity.Employee> employees, java.lang.Integer employee_id) {
        entering("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_update", employees, employee_id);
        try {
            if (employees == null) {
                throw new org.seasar.doma.DomaNullPointerException("employees");
            }
            org.seasar.doma.jdbc.query.AutoProcedureQuery __query = getQueryImplementors().createAutoProcedureQuery(__method10);
            __query.setMethod(__method10);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setProcedureName("proc_resultset_update");
            __query.setQuoteRequired(false);
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.EntityListParameter<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal(), employees, "employees", false));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, employee_id));
            __query.setCallerClassName("org.seasar.doma.it.dao.ProcedureDaoImpl");
            __query.setCallerMethodName("proc_resultset_update");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.ProcedureCommand __command = getCommandImplementors().createProcedureCommand(__method10, __query);
            __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_update", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_update", __e);
            throw __e;
        }
    }

    @Override
    public void proc_resultset_update2(java.util.List<org.seasar.doma.it.entity.Employee> employees, java.lang.Integer employee_id) {
        entering("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_update2", employees, employee_id);
        try {
            if (employees == null) {
                throw new org.seasar.doma.DomaNullPointerException("employees");
            }
            org.seasar.doma.jdbc.query.AutoProcedureQuery __query = getQueryImplementors().createAutoProcedureQuery(__method11);
            __query.setMethod(__method11);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setProcedureName("proc_resultset_update2");
            __query.setQuoteRequired(false);
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.EntityListParameter<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal(), employees, "employees", false));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, employee_id));
            __query.setCallerClassName("org.seasar.doma.it.dao.ProcedureDaoImpl");
            __query.setCallerMethodName("proc_resultset_update2");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.ProcedureCommand __command = getCommandImplementors().createProcedureCommand(__method11, __query);
            __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_update2", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultset_update2", __e);
            throw __e;
        }
    }

    @Override
    public void proc_resultsets(java.util.List<org.seasar.doma.it.entity.Employee> employees, java.util.List<org.seasar.doma.it.entity.Department> departments, java.lang.Integer employee_id, java.lang.Integer department_id) {
        entering("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultsets", employees, departments, employee_id, department_id);
        try {
            if (employees == null) {
                throw new org.seasar.doma.DomaNullPointerException("employees");
            }
            if (departments == null) {
                throw new org.seasar.doma.DomaNullPointerException("departments");
            }
            org.seasar.doma.jdbc.query.AutoProcedureQuery __query = getQueryImplementors().createAutoProcedureQuery(__method12);
            __query.setMethod(__method12);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setProcedureName("proc_resultsets");
            __query.setQuoteRequired(false);
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.EntityListParameter<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal(), employees, "employees", false));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.EntityListParameter<org.seasar.doma.it.entity.Department>(org.seasar.doma.it.entity._Department.getSingletonInternal(), departments, "departments", false));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, employee_id));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, department_id));
            __query.setCallerClassName("org.seasar.doma.it.dao.ProcedureDaoImpl");
            __query.setCallerMethodName("proc_resultsets");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.ProcedureCommand __command = getCommandImplementors().createProcedureCommand(__method12, __query);
            __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultsets", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultsets", __e);
            throw __e;
        }
    }

    @Override
    public void proc_resultsets_updates_out(java.util.List<org.seasar.doma.it.entity.Employee> employees, java.util.List<org.seasar.doma.it.entity.Department> departments, java.lang.Integer employee_id, java.lang.Integer department_id, org.seasar.doma.jdbc.Reference<java.lang.Integer> count) {
        entering("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultsets_updates_out", employees, departments, employee_id, department_id, count);
        try {
            if (employees == null) {
                throw new org.seasar.doma.DomaNullPointerException("employees");
            }
            if (departments == null) {
                throw new org.seasar.doma.DomaNullPointerException("departments");
            }
            if (count == null) {
                throw new org.seasar.doma.DomaNullPointerException("count");
            }
            org.seasar.doma.jdbc.query.AutoProcedureQuery __query = getQueryImplementors().createAutoProcedureQuery(__method13);
            __query.setMethod(__method13);
            __query.setConfig(__config);
            __query.setCatalogName("");
            __query.setSchemaName("");
            __query.setProcedureName("proc_resultsets_updates_out");
            __query.setQuoteRequired(false);
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.EntityListParameter<org.seasar.doma.it.entity.Employee>(org.seasar.doma.it.entity._Employee.getSingletonInternal(), employees, "employees", false));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.EntityListParameter<org.seasar.doma.it.entity.Department>(org.seasar.doma.it.entity._Department.getSingletonInternal(), departments, "departments", false));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, employee_id));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicInParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, department_id));
            __query.addParameter(new org.seasar.doma.internal.jdbc.sql.BasicOutParameter<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, count));
            __query.setCallerClassName("org.seasar.doma.it.dao.ProcedureDaoImpl");
            __query.setCallerMethodName("proc_resultsets_updates_out");
            __query.setQueryTimeout(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.ProcedureCommand __command = getCommandImplementors().createProcedureCommand(__method13, __query);
            __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultsets_updates_out", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.ProcedureDaoImpl", "proc_resultsets_updates_out", __e);
            throw __e;
        }
    }

}
