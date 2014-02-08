package org.seasar.doma.it.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.210+0900")
public final class _IdentityStrategy extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.seasar.doma.it.entity.IdentityStrategy> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final _IdentityStrategy __singleton = new _IdentityStrategy();

    private static final org.seasar.doma.jdbc.entity.OriginalStatesAccessor<org.seasar.doma.it.entity.IdentityStrategy> __originalStatesAccessor = new org.seasar.doma.jdbc.entity.OriginalStatesAccessor<>(org.seasar.doma.it.entity.IdentityStrategy.class, "originalStates");

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the id */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.seasar.doma.it.entity.IdentityStrategy, java.lang.Integer, Object> $id = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(org.seasar.doma.it.entity.IdentityStrategy.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "id", "ID", false, __idGenerator);

    /** the value */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.IdentityStrategy, java.lang.Integer, Object> $value = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.IdentityStrategy.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "value", "VALUE", true, true, false);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<org.seasar.doma.it.entity.IdentityStrategy> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.IdentityStrategy, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.IdentityStrategy, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.IdentityStrategy, ?>> __entityPropertyTypeMap;

    private _IdentityStrategy() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<org.seasar.doma.it.entity.IdentityStrategy>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "IdentityStrategy";
        __catalogName = "";
        __schemaName = "";
        __tableName = "IDENTITY_STRATEGY";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.IdentityStrategy, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.IdentityStrategy, ?>> __list = new java.util.ArrayList<>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.IdentityStrategy, ?>> __map = new java.util.HashMap<>(2);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __list.add($value);
        __map.put("value", $value);
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
    public void preInsert(org.seasar.doma.it.entity.IdentityStrategy entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.seasar.doma.it.entity.IdentityStrategy> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.seasar.doma.it.entity.IdentityStrategy entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.seasar.doma.it.entity.IdentityStrategy> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.seasar.doma.it.entity.IdentityStrategy entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.seasar.doma.it.entity.IdentityStrategy> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.seasar.doma.it.entity.IdentityStrategy entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.seasar.doma.it.entity.IdentityStrategy> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.seasar.doma.it.entity.IdentityStrategy entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.seasar.doma.it.entity.IdentityStrategy> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.seasar.doma.it.entity.IdentityStrategy entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.seasar.doma.it.entity.IdentityStrategy> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.IdentityStrategy, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.IdentityStrategy, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.IdentityStrategy, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.seasar.doma.it.entity.IdentityStrategy, ?, ?> getGeneratedIdPropertyType() {
        return $id;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.seasar.doma.it.entity.IdentityStrategy, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.it.entity.IdentityStrategy newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<org.seasar.doma.it.entity.IdentityStrategy, ?>> __args) {
        org.seasar.doma.it.entity.IdentityStrategy entity = new org.seasar.doma.it.entity.IdentityStrategy();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<org.seasar.doma.it.entity.IdentityStrategy> getEntityClass() {
        return org.seasar.doma.it.entity.IdentityStrategy.class;
    }

    @Override
    public org.seasar.doma.it.entity.IdentityStrategy getOriginalStates(org.seasar.doma.it.entity.IdentityStrategy __entity) {
        return __originalStatesAccessor.get(__entity);
    }

    @Override
    public void saveCurrentStates(org.seasar.doma.it.entity.IdentityStrategy __entity) {
        org.seasar.doma.it.entity.IdentityStrategy __currentStates = new org.seasar.doma.it.entity.IdentityStrategy();
        $id.copy(__currentStates, __entity);
        $value.copy(__currentStates, __entity);
        __originalStatesAccessor.set(__entity, __currentStates);
    }

    /**
     * @return the singleton
     */
    public static _IdentityStrategy getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _IdentityStrategy newInstance() {
        return new _IdentityStrategy();
    }

}
