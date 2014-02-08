package org.seasar.doma.it.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.205+0900")
public final class _Employee extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.seasar.doma.it.entity.Employee> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final _Employee __singleton = new _Employee();

    private static final org.seasar.doma.jdbc.entity.OriginalStatesAccessor<org.seasar.doma.it.entity.Employee> __originalStatesAccessor = new org.seasar.doma.jdbc.entity.OriginalStatesAccessor<>(org.seasar.doma.it.entity.Employee.class, "originalStates");

    /** the employeeId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, org.seasar.doma.it.entity.Employee, java.lang.Integer, Object> $employeeId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(org.seasar.doma.it.entity.Employee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "employeeId", "EMPLOYEE_ID", false);

    /** the employeeNo */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.Employee, java.lang.Integer, Object> $employeeNo = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Employee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "employeeNo", "EMPLOYEE_NO", true, true, false);

    /** the employeeName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.Employee, java.lang.String, Object> $employeeName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Employee.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "employeeName", "EMPLOYEE_NAME", true, true, false);

    /** the managerId */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.Employee, java.lang.Integer, Object> $managerId = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Employee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "managerId", "MANAGER_ID", true, true, false);

    /** the hiredate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.Employee, java.sql.Date, Object> $hiredate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Employee.class, java.sql.Date.class, java.sql.Date.class, () -> new org.seasar.doma.wrapper.DateWrapper(), null, null, "hiredate", "HIREDATE", true, true, false);

    /** the salary */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.Employee, java.math.BigDecimal, org.seasar.doma.it.domain.Salary> $salary = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Employee.class, org.seasar.doma.it.domain.Salary.class, java.math.BigDecimal.class, () -> new org.seasar.doma.wrapper.BigDecimalWrapper(), null, org.seasar.doma.it.domain._Salary.getSingletonInternal(), "salary", "SALARY", true, true, false);

    /** the departmentId */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.Employee, java.lang.Integer, org.seasar.doma.it.domain.Identity<org.seasar.doma.it.entity.Department>> $departmentId = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Employee.class, org.seasar.doma.it.domain.Identity.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, org.seasar.doma.it.domain._Identity.<org.seasar.doma.it.entity.Department>getSingletonInternal(), "departmentId", "DEPARTMENT_ID", true, true, false);

    /** the addressId */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.Employee, java.lang.Integer, Object> $addressId = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.Employee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "addressId", "ADDRESS_ID", true, true, false);

    /** the version */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.seasar.doma.it.entity.Employee, java.lang.Integer, Object> $version = new org.seasar.doma.jdbc.entity.VersionPropertyType<>(org.seasar.doma.it.entity.Employee.class,  java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "version", "VERSION", false);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<org.seasar.doma.it.entity.Employee> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Employee, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Employee, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Employee, ?>> __entityPropertyTypeMap;

    private _Employee() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<org.seasar.doma.it.entity.Employee>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "Employee";
        __catalogName = "";
        __schemaName = "";
        __tableName = "EMPLOYEE";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Employee, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Employee, ?>> __list = new java.util.ArrayList<>(9);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Employee, ?>> __map = new java.util.HashMap<>(9);
        __idList.add($employeeId);
        __list.add($employeeId);
        __map.put("employeeId", $employeeId);
        __list.add($employeeNo);
        __map.put("employeeNo", $employeeNo);
        __list.add($employeeName);
        __map.put("employeeName", $employeeName);
        __list.add($managerId);
        __map.put("managerId", $managerId);
        __list.add($hiredate);
        __map.put("hiredate", $hiredate);
        __list.add($salary);
        __map.put("salary", $salary);
        __list.add($departmentId);
        __map.put("departmentId", $departmentId);
        __list.add($addressId);
        __map.put("addressId", $addressId);
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
    public void preInsert(org.seasar.doma.it.entity.Employee entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.seasar.doma.it.entity.Employee> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.seasar.doma.it.entity.Employee entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.seasar.doma.it.entity.Employee> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.seasar.doma.it.entity.Employee entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.seasar.doma.it.entity.Employee> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.seasar.doma.it.entity.Employee entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.seasar.doma.it.entity.Employee> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.seasar.doma.it.entity.Employee entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.seasar.doma.it.entity.Employee> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.seasar.doma.it.entity.Employee entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.seasar.doma.it.entity.Employee> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Employee, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Employee, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.Employee, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.seasar.doma.it.entity.Employee, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.seasar.doma.it.entity.Employee, ?, ?> getVersionPropertyType() {
        return $version;
    }

    @Override
    public org.seasar.doma.it.entity.Employee newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<org.seasar.doma.it.entity.Employee, ?>> __args) {
        org.seasar.doma.it.entity.Employee entity = new org.seasar.doma.it.entity.Employee();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<org.seasar.doma.it.entity.Employee> getEntityClass() {
        return org.seasar.doma.it.entity.Employee.class;
    }

    @Override
    public org.seasar.doma.it.entity.Employee getOriginalStates(org.seasar.doma.it.entity.Employee __entity) {
        return __originalStatesAccessor.get(__entity);
    }

    @Override
    public void saveCurrentStates(org.seasar.doma.it.entity.Employee __entity) {
        org.seasar.doma.it.entity.Employee __currentStates = new org.seasar.doma.it.entity.Employee();
        $employeeId.copy(__currentStates, __entity);
        $employeeNo.copy(__currentStates, __entity);
        $employeeName.copy(__currentStates, __entity);
        $managerId.copy(__currentStates, __entity);
        $hiredate.copy(__currentStates, __entity);
        $salary.copy(__currentStates, __entity);
        $departmentId.copy(__currentStates, __entity);
        $addressId.copy(__currentStates, __entity);
        $version.copy(__currentStates, __entity);
        __originalStatesAccessor.set(__entity, __currentStates);
    }

    /**
     * @return the singleton
     */
    public static _Employee getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Employee newInstance() {
        return new _Employee();
    }

}
