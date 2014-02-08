package org.seasar.doma.it.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.418+0900")
 class PersonDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.seasar.doma.it.dao.PersonDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.PersonDao.class, "selectById", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.PersonDao.class, "delete", org.seasar.doma.it.entity.Person.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.PersonDao.class, "delete", java.util.List.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.PersonDao.class, "deleteBySqlFile", org.seasar.doma.it.entity.Person.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.PersonDao.class, "deleteBySqlFile", java.util.List.class);

    /** */
    public PersonDaoImpl() {
        super(new org.seasar.doma.it.ItConfig());
    }

    /**
     * @param connection the connection
     */
    public PersonDaoImpl(java.sql.Connection connection) {
        super(new org.seasar.doma.it.ItConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public PersonDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.seasar.doma.it.ItConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected PersonDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected PersonDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected PersonDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public org.seasar.doma.it.entity.Person selectById(java.lang.Integer employeeId) {
        entering("org.seasar.doma.it.dao.PersonDaoImpl", "selectById", employeeId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/PersonDao/selectById.sql");
            __query.addParameter("employeeId", java.lang.Integer.class, employeeId);
            __query.setCallerClassName("org.seasar.doma.it.dao.PersonDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<org.seasar.doma.it.entity.Person> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.seasar.doma.it.entity.Person>(org.seasar.doma.it.entity._Person.getSingletonInternal()));
            org.seasar.doma.it.entity.Person __result = __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.PersonDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.PersonDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Person> delete(org.seasar.doma.it.entity.Person entity) {
        entering("org.seasar.doma.it.dao.PersonDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<org.seasar.doma.it.entity.Person> __query = getQueryImplementors().createAutoDeleteQuery(__method1, org.seasar.doma.it.entity._Person.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.PersonDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method1, __query);
            int __count = __command.execute();
            __query.complete();
            org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Person> __result = new org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Person>(__count, __query.getEntity());
            exiting("org.seasar.doma.it.dao.PersonDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.PersonDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Person> delete(java.util.List<org.seasar.doma.it.entity.Person> entity) {
        entering("org.seasar.doma.it.dao.PersonDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoBatchDeleteQuery<org.seasar.doma.it.entity.Person> __query = getQueryImplementors().createAutoBatchDeleteQuery(__method2, org.seasar.doma.it.entity._Person.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntities(entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.PersonDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchDeleteCommand __command = getCommandImplementors().createBatchDeleteCommand(__method2, __query);
            int[] __counts = __command.execute();
            __query.complete();
            org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Person> __result = new org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Person>(__counts, __query.getEntities());
            exiting("org.seasar.doma.it.dao.PersonDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.PersonDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Person> deleteBySqlFile(org.seasar.doma.it.entity.Person entity) {
        entering("org.seasar.doma.it.dao.PersonDaoImpl", "deleteBySqlFile", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.SqlFileDeleteQuery __query = getQueryImplementors().createSqlFileDeleteQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/PersonDao/deleteBySqlFile.sql");
            __query.addParameter("entity", org.seasar.doma.it.entity.Person.class, entity);
            __query.setCallerClassName("org.seasar.doma.it.dao.PersonDaoImpl");
            __query.setCallerMethodName("deleteBySqlFile");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("entity", entity, org.seasar.doma.it.entity._Person.getSingletonInternal());
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method3, __query);
            int __count = __command.execute();
            __query.complete();
            org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Person> __result = new org.seasar.doma.jdbc.Result<org.seasar.doma.it.entity.Person>(__count, __query.getEntity(org.seasar.doma.it.entity.Person.class));
            exiting("org.seasar.doma.it.dao.PersonDaoImpl", "deleteBySqlFile", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.PersonDaoImpl", "deleteBySqlFile", __e);
            throw __e;
        }
    }

    @Override
    public org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Person> deleteBySqlFile(java.util.List<org.seasar.doma.it.entity.Person> entity) {
        entering("org.seasar.doma.it.dao.PersonDaoImpl", "deleteBySqlFile", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.SqlFileBatchDeleteQuery<org.seasar.doma.it.entity.Person> __query = getQueryImplementors().createSqlFileBatchDeleteQuery(__method4, org.seasar.doma.it.entity.Person.class);
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setElements(entity);
            __query.setSqlFilePath("META-INF/org/seasar/doma/it/dao/PersonDao/deleteBySqlFile.sql");
            __query.setParameterName("entity");
            __query.setCallerClassName("org.seasar.doma.it.dao.PersonDaoImpl");
            __query.setCallerMethodName("deleteBySqlFile");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setEntityType(org.seasar.doma.it.entity._Person.getSingletonInternal());
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchDeleteCommand __command = getCommandImplementors().createBatchDeleteCommand(__method4, __query);
            int[] __counts = __command.execute();
            __query.complete();
            org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Person> __result = new org.seasar.doma.jdbc.BatchResult<org.seasar.doma.it.entity.Person>(__counts, __query.getEntities());
            exiting("org.seasar.doma.it.dao.PersonDaoImpl", "deleteBySqlFile", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.PersonDaoImpl", "deleteBySqlFile", __e);
            throw __e;
        }
    }

}
