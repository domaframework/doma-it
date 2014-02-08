package org.seasar.doma.it.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.201+0900")
public final class _Emp3 extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.seasar.doma.it.entity.Emp3> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final _Emp3 __singleton = new _Emp3();

    private static final org.seasar.doma.jdbc.entity.OriginalStatesAccessor<org.seasar.doma.it.entity.Emp3> __originalStatesAccessor = new org.seasar.doma.jdbc.entity.OriginalStatesAccessor<>(org.seasar.doma.it.entity.Emp.class, "originalStates");

    /** the id */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<org.seasar.doma.it.entity.Emp, org.seasar.doma.it.entity.Emp3, java.lang.Integer, Object> $id = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(org.seasar.doma.it.entity.Emp3.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), org.seasar.doma.it.entity._Emp.getSingletonInternal().$id, null, "id", "ID", false);

    /** the name */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<org.seasar.doma.it.entity.Emp, org.seasar.doma.it.entity.Emp3, java.lang.String, Object> $name = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Emp3.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), org.seasar.doma.it.entity._Emp.getSingletonInternal().$name, null, "name", "NAME", true, true, false);

    /** the salary */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<org.seasar.doma.it.entity.Emp, org.seasar.doma.it.entity.Emp3, java.math.BigDecimal, Object> $salary = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Emp3.class, java.math.BigDecimal.class, java.math.BigDecimal.class, () -> new org.seasar.doma.wrapper.BigDecimalWrapper(), org.seasar.doma.it.entity._Emp.getSingletonInternal().$salary, null, "salary", "SALARY", true, true, false);

    /** the version */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<org.seasar.doma.it.entity.Emp, org.seasar.doma.it.entity.Emp3, java.lang.Integer, Object> $version = new org.seasar.doma.jdbc.entity.VersionPropertyType<>(org.seasar.doma.it.entity.Emp3.class,  java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), org.seasar.doma.it.entity._Emp.getSingletonInternal().$version, null, "version", "VERSION", false);

    /** the insertTimestamp */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<org.seasar.doma.it.entity.Emp, org.seasar.doma.it.entity.Emp3, java.sql.Timestamp, Object> $insertTimestamp = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Emp3.class, java.sql.Timestamp.class, java.sql.Timestamp.class, () -> new org.seasar.doma.wrapper.TimestampWrapper(), org.seasar.doma.it.entity._Emp.getSingletonInternal().$insertTimestamp, null, "insertTimestamp", "INSERT_TIMESTAMP", true, true, false);

    /** the updateTimestamp */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<org.seasar.doma.it.entity.Emp, org.seasar.doma.it.entity.Emp3, java.sql.Timestamp, Object> $updateTimestamp = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Emp3.class, java.sql.Timestamp.class, java.sql.Timestamp.class, () -> new org.seasar.doma.wrapper.TimestampWrapper(), org.seasar.doma.it.entity._Emp.getSingletonInternal().$updateTimestamp, null, "updateTimestamp", "UPDATE_TIMESTAMP", true, true, false);

    /** the age */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<org.seasar.doma.it.entity.Emp2, org.seasar.doma.it.entity.Emp3, java.lang.Integer, org.seasar.doma.it.domain.Age> $age = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Emp3.class, org.seasar.doma.it.domain.Age.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), org.seasar.doma.it.entity._Emp2.getSingletonInternal().$age, __.org.seasar.doma.it.domain._Age.getSingletonInternal(), "age", "AGE", true, true, false);

    /** the address */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.Emp3, java.lang.String, Object> $address = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Emp3.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "address", "ADDRESS", true, true, false);

    private final org.seasar.doma.it.entity.EmpListener<org.seasar.doma.it.entity.Emp3> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Emp3, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Emp3, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Emp3, ?>> __entityPropertyTypeMap;

    private _Emp3() {
        __listener = new org.seasar.doma.it.entity.EmpListener<org.seasar.doma.it.entity.Emp3>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "Emp3";
        __catalogName = "";
        __schemaName = "";
        __tableName = "EMP3";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Emp3, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Emp3, ?>> __list = new java.util.ArrayList<>(8);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Emp3, ?>> __map = new java.util.HashMap<>(8);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __list.add($name);
        __map.put("name", $name);
        __list.add($salary);
        __map.put("salary", $salary);
        __list.add($version);
        __map.put("version", $version);
        __list.add($insertTimestamp);
        __map.put("insertTimestamp", $insertTimestamp);
        __list.add($updateTimestamp);
        __map.put("updateTimestamp", $updateTimestamp);
        __list.add($age);
        __map.put("age", $age);
        __list.add($address);
        __map.put("address", $address);
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
    public void preInsert(org.seasar.doma.it.entity.Emp3 entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.seasar.doma.it.entity.Emp3> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.seasar.doma.it.entity.Emp3 entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.seasar.doma.it.entity.Emp3> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.seasar.doma.it.entity.Emp3 entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.seasar.doma.it.entity.Emp3> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.seasar.doma.it.entity.Emp3 entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.seasar.doma.it.entity.Emp3> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.seasar.doma.it.entity.Emp3 entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.seasar.doma.it.entity.Emp3> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.seasar.doma.it.entity.Emp3 entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.seasar.doma.it.entity.Emp3> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Emp3, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Emp3, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Emp3, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.seasar.doma.it.entity.Emp3, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<org.seasar.doma.it.entity.Emp, org.seasar.doma.it.entity.Emp3, ?, ?> getVersionPropertyType() {
        return $version;
    }

    @Override
    public org.seasar.doma.it.entity.Emp3 newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<org.seasar.doma.it.entity.Emp3, ?>> __args) {
        org.seasar.doma.it.entity.Emp3 entity = new org.seasar.doma.it.entity.Emp3();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<org.seasar.doma.it.entity.Emp3> getEntityClass() {
        return org.seasar.doma.it.entity.Emp3.class;
    }

    @Override
    public org.seasar.doma.it.entity.Emp3 getOriginalStates(org.seasar.doma.it.entity.Emp3 __entity) {
        return __originalStatesAccessor.get(__entity);
    }

    @Override
    public void saveCurrentStates(org.seasar.doma.it.entity.Emp3 __entity) {
        org.seasar.doma.it.entity.Emp3 __currentStates = new org.seasar.doma.it.entity.Emp3();
        $id.copy(__currentStates, __entity);
        $name.copy(__currentStates, __entity);
        $salary.copy(__currentStates, __entity);
        $version.copy(__currentStates, __entity);
        $insertTimestamp.copy(__currentStates, __entity);
        $updateTimestamp.copy(__currentStates, __entity);
        $age.copy(__currentStates, __entity);
        $address.copy(__currentStates, __entity);
        __originalStatesAccessor.set(__entity, __currentStates);
    }

    /**
     * @return the singleton
     */
    public static _Emp3 getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Emp3 newInstance() {
        return new _Emp3();
    }

}
