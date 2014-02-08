package org.seasar.doma.it.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.451+0900")
 class ScriptDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.seasar.doma.it.dao.ScriptDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.ScriptDao.class, "create");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(org.seasar.doma.it.dao.ScriptDao.class, "drop");

    /** */
    public ScriptDaoImpl() {
        super(new org.seasar.doma.it.ItConfig());
    }

    /**
     * @param connection the connection
     */
    public ScriptDaoImpl(java.sql.Connection connection) {
        super(new org.seasar.doma.it.ItConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public ScriptDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.seasar.doma.it.ItConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected ScriptDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected ScriptDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected ScriptDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public void create() {
        entering("org.seasar.doma.it.dao.ScriptDaoImpl", "create");
        try {
            org.seasar.doma.jdbc.query.SqlFileScriptQuery __query = getQueryImplementors().createSqlFileScriptQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setScriptFilePath("META-INF/org/seasar/doma/it/dao/ScriptDao/create.script");
            __query.setCallerClassName("org.seasar.doma.it.dao.ScriptDaoImpl");
            __query.setCallerMethodName("create");
            __query.setBlockDelimiter("");
            __query.setHaltOnError(true);
            __query.prepare();
            org.seasar.doma.jdbc.command.ScriptCommand __command = getCommandImplementors().createScriptCommand(__method0, __query);
            __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.ScriptDaoImpl", "create", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.ScriptDaoImpl", "create", __e);
            throw __e;
        }
    }

    @Override
    public void drop() {
        entering("org.seasar.doma.it.dao.ScriptDaoImpl", "drop");
        try {
            org.seasar.doma.jdbc.query.SqlFileScriptQuery __query = getQueryImplementors().createSqlFileScriptQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setScriptFilePath("META-INF/org/seasar/doma/it/dao/ScriptDao/drop.script");
            __query.setCallerClassName("org.seasar.doma.it.dao.ScriptDaoImpl");
            __query.setCallerMethodName("drop");
            __query.setBlockDelimiter("");
            __query.setHaltOnError(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.ScriptCommand __command = getCommandImplementors().createScriptCommand(__method1, __query);
            __command.execute();
            __query.complete();
            exiting("org.seasar.doma.it.dao.ScriptDaoImpl", "drop", null);
        } catch (java.lang.RuntimeException __e) {
            throwing("org.seasar.doma.it.dao.ScriptDaoImpl", "drop", __e);
            throw __e;
        }
    }

}
