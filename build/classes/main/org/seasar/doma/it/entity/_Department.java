package org.seasar.doma.it.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.188+0900")
public final class _Department extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.seasar.doma.it.entity.Department> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final _Department __singleton = new _Department();

    private static final org.seasar.doma.jdbc.entity.OriginalStatesAccessor<org.seasar.doma.it.entity.Department> __originalStatesAccessor = new org.seasar.doma.jdbc.entity.OriginalStatesAccessor<>(org.seasar.doma.it.entity.Department.class, "originalStates");

    /** the departmentId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, org.seasar.doma.it.entity.Department, java.lang.Integer, org.seasar.doma.it.domain.Identity<org.seasar.doma.it.entity.Department>> $departmentId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(org.seasar.doma.it.entity.Department.class, org.seasar.doma.it.domain.Identity.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, org.seasar.doma.it.domain._Identity.<org.seasar.doma.it.entity.Department>getSingletonInternal(), "departmentId", "DEPARTMENT_ID", false);

    /** the departmentNo */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.Department, java.lang.Integer, Object> $departmentNo = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Department.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "departmentNo", "DEPARTMENT_NO", true, true, false);

    /** the departmentName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.Department, java.lang.String, Object> $departmentName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Department.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "departmentName", "DEPARTMENT_NAME", true, true, false);

    /** the location */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.Department, java.lang.String, org.seasar.doma.it.domain.Location<org.seasar.doma.it.entity.Department>> $location = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Department.class, org.seasar.doma.it.domain.Location.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, __.org.seasar.doma.it.domain._Location.<org.seasar.doma.it.entity.Department>getSingletonInternal(), "location", "LOCATION", true, true, false);

    /** the version */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.seasar.doma.it.entity.Department, java.lang.Integer, Object> $version = new org.seasar.doma.jdbc.entity.VersionPropertyType<>(org.seasar.doma.it.entity.Department.class,  java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "version", "VERSION", false);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<org.seasar.doma.it.entity.Department> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Department, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Department, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Department, ?>> __entityPropertyTypeMap;

    private _Department() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<org.seasar.doma.it.entity.Department>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "Department";
        __catalogName = "";
        __schemaName = "";
        __tableName = "DEPARTMENT";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Department, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Department, ?>> __list = new java.util.ArrayList<>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Department, ?>> __map = new java.util.HashMap<>(5);
        __idList.add($departmentId);
        __list.add($departmentId);
        __map.put("departmentId", $departmentId);
        __list.add($departmentNo);
        __map.put("departmentNo", $departmentNo);
        __list.add($departmentName);
        __map.put("departmentName", $departmentName);
        __list.add($location);
        __map.put("location", $location);
        __list.add($version);
        __map.put("version", $version);
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
    public void preInsert(org.seasar.doma.it.entity.Department entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.seasar.doma.it.entity.Department> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.seasar.doma.it.entity.Department entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.seasar.doma.it.entity.Department> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.seasar.doma.it.entity.Department entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.seasar.doma.it.entity.Department> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.seasar.doma.it.entity.Department entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.seasar.doma.it.entity.Department> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.seasar.doma.it.entity.Department entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.seasar.doma.it.entity.Department> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.seasar.doma.it.entity.Department entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.seasar.doma.it.entity.Department> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Department, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Department, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Department, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.seasar.doma.it.entity.Department, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.seasar.doma.it.entity.Department, ?, ?> getVersionPropertyType() {
        return $version;
    }

    @Override
    public org.seasar.doma.it.entity.Department newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<org.seasar.doma.it.entity.Department, ?>> __args) {
        org.seasar.doma.it.entity.Department entity = new org.seasar.doma.it.entity.Department();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<org.seasar.doma.it.entity.Department> getEntityClass() {
        return org.seasar.doma.it.entity.Department.class;
    }

    @Override
    public org.seasar.doma.it.entity.Department getOriginalStates(org.seasar.doma.it.entity.Department __entity) {
        return __originalStatesAccessor.get(__entity);
    }

    @Override
    public void saveCurrentStates(org.seasar.doma.it.entity.Department __entity) {
        org.seasar.doma.it.entity.Department __currentStates = new org.seasar.doma.it.entity.Department();
        $departmentId.copy(__currentStates, __entity);
        $departmentNo.copy(__currentStates, __entity);
        $departmentName.copy(__currentStates, __entity);
        $location.copy(__currentStates, __entity);
        $version.copy(__currentStates, __entity);
        __originalStatesAccessor.set(__entity, __currentStates);
    }

    /**
     * @return the singleton
     */
    public static _Department getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Department newInstance() {
        return new _Department();
    }

}
