package org.seasar.doma.it.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.316+0900")
 class DepartmentDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.seasar.doma.it.dao.DepartmentDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DepartmentDao.class, "selectById", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DepartmentDao.class, "insert", org.seasar.doma.it.entity.Department.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DepartmentDao.class, "insertBySqlFile", org.seasar.doma.it.entity.Department.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DepartmentDao.class, "insert_excludeNull", org.seasar.doma.it.entity.Department.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DepartmentDao.class, "update", org.seasar.doma.it.entity.Department.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DepartmentDao.class, "updateBySqlFile", org.seasar.doma.it.entity.Department.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DepartmentDao.class, "updateBySqlFile_ignoreVersion", org.seasar.doma.it.entity.Department.class);

    private static final java.lang.reflect.Method __method7 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DepartmentDao.class, "update_excludeNull", org.seasar.doma.it.entity.Department.class);

    private static final java.lang.reflect.Method __method8 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DepartmentDao.class, "update_ignoreVersion", org.seasar.doma.it.entity.Department.class);

    private static final java.lang.reflect.Method __method9 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DepartmentDao.class, "update_suppressOptimisticLockException", org.seasar.doma.it.entity.Department.class);

    private static final java.lang.reflect.Method __method10 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DepartmentDao.class, "insert", java.util.List.class);

    private static final java.lang.reflect.Method __method11 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DepartmentDao.class, "insertBySqlFile", java.util.List.class);

    private static final java.lang.reflect.Method __method12 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DepartmentDao.class, "update", java.util.List.class);

    private static final java.lang.reflect.Method __method13 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DepartmentDao.class, "updateBySqlFile", java.util.List.class);

    private static final java.lang.reflect.Method __method14 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DepartmentDao.class, "updateBySqlFile_suppressOptimisticLockException", java.util.List.class);

    private static final java.lang.reflect.Method __method15 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DepartmentDao.class, "update_ignoreVersion", java.util.List.class);

    private static final java.lang.reflect.Method __method16 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.DepartmentDao.class, "update_suppressOptimisticLockException", java.util.List.class);

    /** */
    public DepartmentDaoImpl() {
        super(new org.seasar.doma.it.ItConfig());
    }

    /**
     * @param connection the connection
     */
    public DepartmentDaoImpl(java.sql.Connection connection) {
        super(new org.seasar.doma.it.ItConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public DepartmentDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.seasar.doma.it.ItConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected DepartmentDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected DepartmentDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected DepartmentDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public org.seasar.doma.it.entity.Department selectById(java.lang.Integer departmentId) {
        entering("org.seasar.doma.it.dao.DepartmentDaoImpl", "selectById", departmentId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/DepartmentDao/selectById.sql");
            __query.addParameter("departmentId", java.lang.Integer.class, departmentId);
            __query.setCallerClassName("org.seasar.doma.it.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<org.seasar.doma.it.entity.Department> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.seasar.doma.it.entity.Department>(org.seasar.doma.it.entity._Department.getSingletonInternal()));
            org.seasar.doma.it.entity.Department __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.DepartmentDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DepartmentDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public int insert(org.seasar.doma.it.entity.Department entity) {
        entering("org.seasar.doma.it.dao.DepartmentDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<org.seasar.doma.it.entity.Department> __query = getQueryImplementors().createAutoInsertQuery(__method1, org.seasar.doma.it.entity._Department.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method1, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.DepartmentDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DepartmentDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int insertBySqlFile(org.seasar.doma.it.entity.Department entity) {
        entering("org.seasar.doma.it.dao.DepartmentDaoImpl", "insertBySqlFile", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.SqlFileInsertQuery __query = getQueryImplementors().createSqlFileInsertQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/DepartmentDao/insertBySqlFile.sql");
            __query.addParameter("entity", org.seasar.doma.it.entity.Department.class, entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("insertBySqlFile");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("entity", entity, org.seasar.doma.it.entity._Department.getSingletonInternal());
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method2, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.DepartmentDaoImpl", "insertBySqlFile", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DepartmentDaoImpl", "insertBySqlFile", __e);
            throw __e;
        }
    }

    @Override
    public int insert_excludeNull(org.seasar.doma.it.entity.Department entity) {
        entering("org.seasar.doma.it.dao.DepartmentDaoImpl", "insert_excludeNull", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<org.seasar.doma.it.entity.Department> __query = getQueryImplementors().createAutoInsertQuery(__method3, org.seasar.doma.it.entity._Department.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("insert_excludeNull");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(true);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.DepartmentDaoImpl", "insert_excludeNull", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DepartmentDaoImpl", "insert_excludeNull", __e);
            throw __e;
        }
    }

    @Override
    public int update(org.seasar.doma.it.entity.Department entity) {
        entering("org.seasar.doma.it.dao.DepartmentDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<org.seasar.doma.it.entity.Department> __query = getQueryImplementors().createAutoUpdateQuery(__method4, org.seasar.doma.it.entity._Department.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.DepartmentDaoImpl");
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
            exiting("org.seasar.doma.it.dao.DepartmentDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DepartmentDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int updateBySqlFile(org.seasar.doma.it.entity.Department entity) {
        entering("org.seasar.doma.it.dao.DepartmentDaoImpl", "updateBySqlFile", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.SqlFileUpdateQuery __query = getQueryImplementors().createSqlFileUpdateQuery(__method5);
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/DepartmentDao/updateBySqlFile.sql");
            __query.addParameter("entity", org.seasar.doma.it.entity.Department.class, entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("updateBySqlFile");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("entity", entity, org.seasar.doma.it.entity._Department.getSingletonInternal());
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method5, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.DepartmentDaoImpl", "updateBySqlFile", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DepartmentDaoImpl", "updateBySqlFile", __e);
            throw __e;
        }
    }

    @Override
    public int updateBySqlFile_ignoreVersion(org.seasar.doma.it.entity.Department entity) {
        entering("org.seasar.doma.it.dao.DepartmentDaoImpl", "updateBySqlFile_ignoreVersion", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.SqlFileUpdateQuery __query = getQueryImplementors().createSqlFileUpdateQuery(__method6);
            __query.setMethod(__method6);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/DepartmentDao/updateBySqlFile_ignoreVersion.sql");
            __query.addParameter("entity", org.seasar.doma.it.entity.Department.class, entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("updateBySqlFile_ignoreVersion");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("entity", entity, org.seasar.doma.it.entity._Department.getSingletonInternal());
            __query.setVersionIgnored(true);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method6, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.DepartmentDaoImpl", "updateBySqlFile_ignoreVersion", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DepartmentDaoImpl", "updateBySqlFile_ignoreVersion", __e);
            throw __e;
        }
    }

    @Override
    public int update_excludeNull(org.seasar.doma.it.entity.Department entity) {
        entering("org.seasar.doma.it.dao.DepartmentDaoImpl", "update_excludeNull", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<org.seasar.doma.it.entity.Department> __query = getQueryImplementors().createAutoUpdateQuery(__method7, org.seasar.doma.it.entity._Department.getSingletonInternal());
            __query.setMethod(__method7);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("update_excludeNull");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(true);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method7, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.DepartmentDaoImpl", "update_excludeNull", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DepartmentDaoImpl", "update_excludeNull", __e);
            throw __e;
        }
    }

    @Override
    public int update_ignoreVersion(org.seasar.doma.it.entity.Department entity) {
        entering("org.seasar.doma.it.dao.DepartmentDaoImpl", "update_ignoreVersion", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<org.seasar.doma.it.entity.Department> __query = getQueryImplementors().createAutoUpdateQuery(__method8, org.seasar.doma.it.entity._Department.getSingletonInternal());
            __query.setMethod(__method8);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("update_ignoreVersion");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(true);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method8, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.DepartmentDaoImpl", "update_ignoreVersion", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DepartmentDaoImpl", "update_ignoreVersion", __e);
            throw __e;
        }
    }

    @Override
    public int update_suppressOptimisticLockException(org.seasar.doma.it.entity.Department entity) {
        entering("org.seasar.doma.it.dao.DepartmentDaoImpl", "update_suppressOptimisticLockException", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<org.seasar.doma.it.entity.Department> __query = getQueryImplementors().createAutoUpdateQuery(__method9, org.seasar.doma.it.entity._Department.getSingletonInternal());
            __query.setMethod(__method9);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("update_suppressOptimisticLockException");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(true);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method9, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.DepartmentDaoImpl", "update_suppressOptimisticLockException", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DepartmentDaoImpl", "update_suppressOptimisticLockException", __e);
            throw __e;
        }
    }

    @Override
    public int[] insert(java.util.List<org.seasar.doma.it.entity.Department> entity) {
        entering("org.seasar.doma.it.dao.DepartmentDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoBatchInsertQuery<org.seasar.doma.it.entity.Department> __query = getQueryImplementors().createAutoBatchInsertQuery(__method10, org.seasar.doma.it.entity._Department.getSingletonInternal());
            __query.setMethod(__method10);
            __query.setConfig(__config);
            __query.setEntities(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchInsertCommand __command = getCommandImplementors().createBatchInsertCommand(__method10, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.DepartmentDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DepartmentDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int[] insertBySqlFile(java.util.List<org.seasar.doma.it.entity.Department> entity) {
        entering("org.seasar.doma.it.dao.DepartmentDaoImpl", "insertBySqlFile", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.SqlFileBatchInsertQuery<org.seasar.doma.it.entity.Department> __query = getQueryImplementors().createSqlFileBatchInsertQuery(__method11, org.seasar.doma.it.entity.Department.class);
            __query.setMethod(__method11);
            __query.setConfig(__config);
            __query.setElements(entity);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/DepartmentDao/insertBySqlFile.sql");
            __query.setParameterName("entity");
            __query.setCallerClassName("org.seasar.doma.it.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("insertBySqlFile");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setEntityType(org.seasar.doma.it.entity._Department.getSingletonInternal());
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchInsertCommand __command = getCommandImplementors().createBatchInsertCommand(__method11, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.DepartmentDaoImpl", "insertBySqlFile", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DepartmentDaoImpl", "insertBySqlFile", __e);
            throw __e;
        }
    }

    @Override
    public int[] update(java.util.List<org.seasar.doma.it.entity.Department> entity) {
        entering("org.seasar.doma.it.dao.DepartmentDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoBatchUpdateQuery<org.seasar.doma.it.entity.Department> __query = getQueryImplementors().createAutoBatchUpdateQuery(__method12, org.seasar.doma.it.entity._Department.getSingletonInternal());
            __query.setMethod(__method12);
            __query.setConfig(__config);
            __query.setEntities(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchUpdateCommand __command = getCommandImplementors().createBatchUpdateCommand(__method12, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.DepartmentDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DepartmentDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int[] updateBySqlFile(java.util.List<org.seasar.doma.it.entity.Department> entity) {
        entering("org.seasar.doma.it.dao.DepartmentDaoImpl", "updateBySqlFile", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.SqlFileBatchUpdateQuery<org.seasar.doma.it.entity.Department> __query = getQueryImplementors().createSqlFileBatchUpdateQuery(__method13, org.seasar.doma.it.entity.Department.class);
            __query.setMethod(__method13);
            __query.setConfig(__config);
            __query.setElements(entity);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/DepartmentDao/updateBySqlFile.sql");
            __query.setParameterName("entity");
            __query.setCallerClassName("org.seasar.doma.it.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("updateBySqlFile");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setEntityType(org.seasar.doma.it.entity._Department.getSingletonInternal());
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchUpdateCommand __command = getCommandImplementors().createBatchUpdateCommand(__method13, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.DepartmentDaoImpl", "updateBySqlFile", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DepartmentDaoImpl", "updateBySqlFile", __e);
            throw __e;
        }
    }

    @Override
    public int[] updateBySqlFile_suppressOptimisticLockException(java.util.List<org.seasar.doma.it.entity.Department> entity) {
        entering("org.seasar.doma.it.dao.DepartmentDaoImpl", "updateBySqlFile_suppressOptimisticLockException", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.SqlFileBatchUpdateQuery<org.seasar.doma.it.entity.Department> __query = getQueryImplementors().createSqlFileBatchUpdateQuery(__method14, org.seasar.doma.it.entity.Department.class);
            __query.setMethod(__method14);
            __query.setConfig(__config);
            __query.setElements(entity);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/DepartmentDao/updateBySqlFile_suppressOptimisticLockException.sql");
            __query.setParameterName("entity");
            __query.setCallerClassName("org.seasar.doma.it.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("updateBySqlFile_suppressOptimisticLockException");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setEntityType(org.seasar.doma.it.entity._Department.getSingletonInternal());
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(true);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchUpdateCommand __command = getCommandImplementors().createBatchUpdateCommand(__method14, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.DepartmentDaoImpl", "updateBySqlFile_suppressOptimisticLockException", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DepartmentDaoImpl", "updateBySqlFile_suppressOptimisticLockException", __e);
            throw __e;
        }
    }

    @Override
    public int[] update_ignoreVersion(java.util.List<org.seasar.doma.it.entity.Department> entity) {
        entering("org.seasar.doma.it.dao.DepartmentDaoImpl", "update_ignoreVersion", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoBatchUpdateQuery<org.seasar.doma.it.entity.Department> __query = getQueryImplementors().createAutoBatchUpdateQuery(__method15, org.seasar.doma.it.entity._Department.getSingletonInternal());
            __query.setMethod(__method15);
            __query.setConfig(__config);
            __query.setEntities(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("update_ignoreVersion");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIgnored(true);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchUpdateCommand __command = getCommandImplementors().createBatchUpdateCommand(__method15, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.DepartmentDaoImpl", "update_ignoreVersion", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DepartmentDaoImpl", "update_ignoreVersion", __e);
            throw __e;
        }
    }

    @Override
    public int[] update_suppressOptimisticLockException(java.util.List<org.seasar.doma.it.entity.Department> entity) {
        entering("org.seasar.doma.it.dao.DepartmentDaoImpl", "update_suppressOptimisticLockException", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoBatchUpdateQuery<org.seasar.doma.it.entity.Department> __query = getQueryImplementors().createAutoBatchUpdateQuery(__method16, org.seasar.doma.it.entity._Department.getSingletonInternal());
            __query.setMethod(__method16);
            __query.setConfig(__config);
            __query.setEntities(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.DepartmentDaoImpl");
            __query.setCallerMethodName("update_suppressOptimisticLockException");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setOptimisticLockExceptionSuppressed(true);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchUpdateCommand __command = getCommandImplementors().createBatchUpdateCommand(__method16, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.DepartmentDaoImpl", "update_suppressOptimisticLockException", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.DepartmentDaoImpl", "update_suppressOptimisticLockException", __e);
            throw __e;
        }
    }

}
