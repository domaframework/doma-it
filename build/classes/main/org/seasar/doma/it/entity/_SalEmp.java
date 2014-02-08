package org.seasar.doma.it.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.218+0900")
public final class _SalEmp extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.seasar.doma.it.entity.SalEmp> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final _SalEmp __singleton = new _SalEmp();

    private static final org.seasar.doma.jdbc.entity.OriginalStatesAccessor<org.seasar.doma.it.entity.SalEmp> __originalStatesAccessor = new org.seasar.doma.jdbc.entity.OriginalStatesAccessor<>(org.seasar.doma.it.entity.SalEmp.class, "originalStates");

    /** the name */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, org.seasar.doma.it.entity.SalEmp, java.lang.String, Object> $name = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(org.seasar.doma.it.entity.SalEmp.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "name", "NAME", false);

    /** the payByQuarter */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.SalEmp, java.sql.Array, Object> $payByQuarter = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.SalEmp.class, java.sql.Array.class, java.sql.Array.class, () -> new org.seasar.doma.wrapper.ArrayWrapper(), null, null, "payByQuarter", "PAY_BY_QUARTER", true, true, false);

    /** the schedule */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.SalEmp, java.sql.Array, Object> $schedule = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.SalEmp.class, java.sql.Array.class, java.sql.Array.class, () -> new org.seasar.doma.wrapper.ArrayWrapper(), null, null, "schedule", "SCHEDULE", true, true, false);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<org.seasar.doma.it.entity.SalEmp> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.SalEmp, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.SalEmp, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.SalEmp, ?>> __entityPropertyTypeMap;

    private _SalEmp() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<org.seasar.doma.it.entity.SalEmp>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "SalEmp";
        __catalogName = "";
        __schemaName = "";
        __tableName = "SAL_EMP";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.SalEmp, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.SalEmp, ?>> __list = new java.util.ArrayList<>(3);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.SalEmp, ?>> __map = new java.util.HashMap<>(3);
        __idList.add($name);
        __list.add($name);
        __map.put("name", $name);
        __list.add($payByQuarter);
        __map.put("payByQuarter", $payByQuarter);
        __list.add($schedule);
        __map.put("schedule", $schedule);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @Override
    public void preInsert(org.seasar.doma.it.entity.SalEmp entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.seasar.doma.it.entity.SalEmp> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.seasar.doma.it.entity.SalEmp entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.seasar.doma.it.entity.SalEmp> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.seasar.doma.it.entity.SalEmp entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.seasar.doma.it.entity.SalEmp> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.seasar.doma.it.entity.SalEmp entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.seasar.doma.it.entity.SalEmp> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.seasar.doma.it.entity.SalEmp entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.seasar.doma.it.entity.SalEmp> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.seasar.doma.it.entity.SalEmp entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.seasar.doma.it.entity.SalEmp> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.SalEmp, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.SalEmp, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.SalEmp, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.seasar.doma.it.entity.SalEmp, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.seasar.doma.it.entity.SalEmp, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.it.entity.SalEmp newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<org.seasar.doma.it.entity.SalEmp, ?>> __args) {
        org.seasar.doma.it.entity.SalEmp entity = new org.seasar.doma.it.entity.SalEmp();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<org.seasar.doma.it.entity.SalEmp> getEntityClass() {
        return org.seasar.doma.it.entity.SalEmp.class;
    }

    @Override
    public org.seasar.doma.it.entity.SalEmp getOriginalStates(org.seasar.doma.it.entity.SalEmp __entity) {
        return __originalStatesAccessor.get(__entity);
    }

    @Override
    public void saveCurrentStates(org.seasar.doma.it.entity.SalEmp __entity) {
        org.seasar.doma.it.entity.SalEmp __currentStates = new org.seasar.doma.it.entity.SalEmp();
        $name.copy(__currentStates, __entity);
        $payByQuarter.copy(__currentStates, __entity);
        $schedule.copy(__currentStates, __entity);
        __originalStatesAccessor.set(__entity, __currentStates);
    }

    /**
     * @return the singleton
     */
    public static _SalEmp getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _SalEmp newInstance() {
        return new _SalEmp();
    }

}
