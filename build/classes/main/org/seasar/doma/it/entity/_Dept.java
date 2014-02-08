package org.seasar.doma.it.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.191+0900")
public final class _Dept extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.seasar.doma.it.entity.Dept> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final _Dept __singleton = new _Dept();

    /** the departmentId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, org.seasar.doma.it.entity.Dept, java.lang.Integer, org.seasar.doma.it.domain.Identity<org.seasar.doma.it.entity.Dept>> $departmentId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(org.seasar.doma.it.entity.Dept.class, org.seasar.doma.it.domain.Identity.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, org.seasar.doma.it.domain._Identity.<org.seasar.doma.it.entity.Dept>getSingletonInternal(), "departmentId", "DEPARTMENT_ID", false);

    /** the departmentNo */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.Dept, java.lang.Integer, Object> $departmentNo = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Dept.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "departmentNo", "DEPARTMENT_NO", true, true, false);

    /** the departmentName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.Dept, java.lang.String, Object> $departmentName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Dept.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "departmentName", "DEPARTMENT_NAME", true, true, false);

    /** the location */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.Dept, java.lang.String, org.seasar.doma.it.domain.Location<org.seasar.doma.it.entity.Dept>> $location = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Dept.class, org.seasar.doma.it.domain.Location.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, __.org.seasar.doma.it.domain._Location.<org.seasar.doma.it.entity.Dept>getSingletonInternal(), "location", "LOCATION", true, true, false);

    /** the version */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.seasar.doma.it.entity.Dept, java.lang.Integer, Object> $version = new org.seasar.doma.jdbc.entity.VersionPropertyType<>(org.seasar.doma.it.entity.Dept.class,  java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "version", "VERSION", false);

    private final org.seasar.doma.it.entity.DeptListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Dept, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Dept, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Dept, ?>> __entityPropertyTypeMap;

    private _Dept() {
        __listener = new org.seasar.doma.it.entity.DeptListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = true;
        __name = "Dept";
        __catalogName = "";
        __schemaName = "";
        __tableName = "DEPARTMENT";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Dept, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Dept, ?>> __list = new java.util.ArrayList<>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Dept, ?>> __map = new java.util.HashMap<>(5);
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
    public void preInsert(org.seasar.doma.it.entity.Dept entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.seasar.doma.it.entity.Dept> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.seasar.doma.it.entity.Dept entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.seasar.doma.it.entity.Dept> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.seasar.doma.it.entity.Dept entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.seasar.doma.it.entity.Dept> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.seasar.doma.it.entity.Dept entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.seasar.doma.it.entity.Dept> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.seasar.doma.it.entity.Dept entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.seasar.doma.it.entity.Dept> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.seasar.doma.it.entity.Dept entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.seasar.doma.it.entity.Dept> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Dept, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Dept, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Dept, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.seasar.doma.it.entity.Dept, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.seasar.doma.it.entity.Dept, ?, ?> getVersionPropertyType() {
        return $version;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.it.entity.Dept newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<org.seasar.doma.it.entity.Dept, ?>> __args) {
        return new org.seasar.doma.it.entity.Dept(
            (org.seasar.doma.it.domain.Identity<org.seasar.doma.it.entity.Dept>)__args.get("departmentId").get(),
            (java.lang.Integer)__args.get("departmentNo").get(),
            (java.lang.String)__args.get("departmentName").get(),
            (org.seasar.doma.it.domain.Location<org.seasar.doma.it.entity.Dept>)__args.get("location").get(),
            (java.lang.Integer)__args.get("version").get());
    }

    @Override
    public Class<org.seasar.doma.it.entity.Dept> getEntityClass() {
        return org.seasar.doma.it.entity.Dept.class;
    }

    @Override
    public org.seasar.doma.it.entity.Dept getOriginalStates(org.seasar.doma.it.entity.Dept __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.seasar.doma.it.entity.Dept __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Dept getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Dept newInstance() {
        return new _Dept();
    }

}
