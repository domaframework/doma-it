package org.seasar.doma.it.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.213+0900")
public final class _NoId extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.seasar.doma.it.entity.NoId> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final _NoId __singleton = new _NoId();

    private static final org.seasar.doma.jdbc.entity.OriginalStatesAccessor<org.seasar.doma.it.entity.NoId> __originalStatesAccessor = new org.seasar.doma.jdbc.entity.OriginalStatesAccessor<>(org.seasar.doma.it.entity.NoId.class, "originalStates");

    /** the value1 */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.NoId, java.lang.Integer, Object> $value1 = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.NoId.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "value1", "VALUE1", true, true, false);

    /** the value2 */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.NoId, java.lang.Integer, Object> $value2 = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.NoId.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "value2", "VALUE2", true, true, false);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<org.seasar.doma.it.entity.NoId> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.NoId, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.NoId, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.NoId, ?>> __entityPropertyTypeMap;

    private _NoId() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<org.seasar.doma.it.entity.NoId>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "NoId";
        __catalogName = "";
        __schemaName = "";
        __tableName = "NO_ID";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.NoId, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.NoId, ?>> __list = new java.util.ArrayList<>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.NoId, ?>> __map = new java.util.HashMap<>(2);
        __list.add($value1);
        __map.put("value1", $value1);
        __list.add($value2);
        __map.put("value2", $value2);
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
    public void preInsert(org.seasar.doma.it.entity.NoId entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.seasar.doma.it.entity.NoId> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.seasar.doma.it.entity.NoId entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.seasar.doma.it.entity.NoId> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.seasar.doma.it.entity.NoId entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.seasar.doma.it.entity.NoId> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.seasar.doma.it.entity.NoId entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.seasar.doma.it.entity.NoId> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.seasar.doma.it.entity.NoId entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.seasar.doma.it.entity.NoId> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.seasar.doma.it.entity.NoId entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.seasar.doma.it.entity.NoId> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.NoId, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.NoId, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.NoId, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.seasar.doma.it.entity.NoId, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.seasar.doma.it.entity.NoId, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.it.entity.NoId newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<org.seasar.doma.it.entity.NoId, ?>> __args) {
        org.seasar.doma.it.entity.NoId entity = new org.seasar.doma.it.entity.NoId();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<org.seasar.doma.it.entity.NoId> getEntityClass() {
        return org.seasar.doma.it.entity.NoId.class;
    }

    @Override
    public org.seasar.doma.it.entity.NoId getOriginalStates(org.seasar.doma.it.entity.NoId __entity) {
        return __originalStatesAccessor.get(__entity);
    }

    @Override
    public void saveCurrentStates(org.seasar.doma.it.entity.NoId __entity) {
        org.seasar.doma.it.entity.NoId __currentStates = new org.seasar.doma.it.entity.NoId();
        $value1.copy(__currentStates, __entity);
        $value2.copy(__currentStates, __entity);
        __originalStatesAccessor.set(__entity, __currentStates);
    }

    /**
     * @return the singleton
     */
    public static _NoId getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _NoId newInstance() {
        return new _NoId();
    }

}
