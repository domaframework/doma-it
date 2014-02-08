package org.seasar.doma.it.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.183+0900")
public final class _CompKeyEmployee extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.seasar.doma.it.entity.CompKeyEmployee> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final _CompKeyEmployee __singleton = new _CompKeyEmployee();

    private static final org.seasar.doma.jdbc.entity.OriginalStatesAccessor<org.seasar.doma.it.entity.CompKeyEmployee> __originalStatesAccessor = new org.seasar.doma.jdbc.entity.OriginalStatesAccessor<>(org.seasar.doma.it.entity.CompKeyEmployee.class, "originalStates");

    /** the employeeId1 */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, org.seasar.doma.it.entity.CompKeyEmployee, java.lang.Integer, Object> $employeeId1 = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(org.seasar.doma.it.entity.CompKeyEmployee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "employeeId1", "EMPLOYEE_ID1", false);

    /** the employeeId2 */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, org.seasar.doma.it.entity.CompKeyEmployee, java.lang.Integer, Object> $employeeId2 = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(org.seasar.doma.it.entity.CompKeyEmployee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "employeeId2", "EMPLOYEE_ID2", false);

    /** the employeeNo */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.CompKeyEmployee, java.lang.Integer, Object> $employeeNo = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.CompKeyEmployee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "employeeNo", "EMPLOYEE_NO", true, true, false);

    /** the employeeName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.CompKeyEmployee, java.lang.String, Object> $employeeName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.CompKeyEmployee.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "employeeName", "EMPLOYEE_NAME", true, true, false);

    /** the managerId1 */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.CompKeyEmployee, java.lang.Integer, Object> $managerId1 = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.CompKeyEmployee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "managerId1", "MANAGER_ID1", true, true, false);

    /** the managerId2 */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.CompKeyEmployee, java.lang.Integer, Object> $managerId2 = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.CompKeyEmployee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "managerId2", "MANAGER_ID2", true, true, false);

    /** the hiredate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.CompKeyEmployee, java.sql.Date, Object> $hiredate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.CompKeyEmployee.class, java.sql.Date.class, java.sql.Date.class, () -> new org.seasar.doma.wrapper.DateWrapper(), null, null, "hiredate", "HIREDATE", true, true, false);

    /** the salary */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.CompKeyEmployee, java.math.BigDecimal, Object> $salary = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.CompKeyEmployee.class, java.math.BigDecimal.class, java.math.BigDecimal.class, () -> new org.seasar.doma.wrapper.BigDecimalWrapper(), null, null, "salary", "SALARY", true, true, false);

    /** the departmentId1 */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.CompKeyEmployee, java.lang.Integer, Object> $departmentId1 = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.CompKeyEmployee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "departmentId1", "DEPARTMENT_ID1", true, true, false);

    /** the departmentId2 */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.CompKeyEmployee, java.lang.Integer, Object> $departmentId2 = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.CompKeyEmployee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "departmentId2", "DEPARTMENT_ID2", true, true, false);

    /** the addressId1 */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.CompKeyEmployee, java.lang.Integer, Object> $addressId1 = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.CompKeyEmployee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "addressId1", "ADDRESS_ID1", true, true, false);

    /** the addressId2 */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, org.seasar.doma.it.entity.CompKeyEmployee, java.lang.Integer, Object> $addressId2 = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(org.seasar.doma.it.entity.CompKeyEmployee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "addressId2", "ADDRESS_ID2", true, true, false);

    /** the version */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.seasar.doma.it.entity.CompKeyEmployee, java.lang.Integer, Object> $version = new org.seasar.doma.jdbc.entity.VersionPropertyType<>(org.seasar.doma.it.entity.CompKeyEmployee.class,  java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "version", "VERSION", false);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<org.seasar.doma.it.entity.CompKeyEmployee> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.CompKeyEmployee, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.CompKeyEmployee, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.CompKeyEmployee, ?>> __entityPropertyTypeMap;

    private _CompKeyEmployee() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<org.seasar.doma.it.entity.CompKeyEmployee>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "CompKeyEmployee";
        __catalogName = "";
        __schemaName = "";
        __tableName = "COMP_KEY_EMPLOYEE";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.CompKeyEmployee, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.CompKeyEmployee, ?>> __list = new java.util.ArrayList<>(13);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.CompKeyEmployee, ?>> __map = new java.util.HashMap<>(13);
        __idList.add($employeeId1);
        __list.add($employeeId1);
        __map.put("employeeId1", $employeeId1);
        __idList.add($employeeId2);
        __list.add($employeeId2);
        __map.put("employeeId2", $employeeId2);
        __list.add($employeeNo);
        __map.put("employeeNo", $employeeNo);
        __list.add($employeeName);
        __map.put("employeeName", $employeeName);
        __list.add($managerId1);
        __map.put("managerId1", $managerId1);
        __list.add($managerId2);
        __map.put("managerId2", $managerId2);
        __list.add($hiredate);
        __map.put("hiredate", $hiredate);
        __list.add($salary);
        __map.put("salary", $salary);
        __list.add($departmentId1);
        __map.put("departmentId1", $departmentId1);
        __list.add($departmentId2);
        __map.put("departmentId2", $departmentId2);
        __list.add($addressId1);
        __map.put("addressId1", $addressId1);
        __list.add($addressId2);
        __map.put("addressId2", $addressId2);
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
    public void preInsert(org.seasar.doma.it.entity.CompKeyEmployee entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.seasar.doma.it.entity.CompKeyEmployee> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.seasar.doma.it.entity.CompKeyEmployee entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.seasar.doma.it.entity.CompKeyEmployee> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.seasar.doma.it.entity.CompKeyEmployee entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.seasar.doma.it.entity.CompKeyEmployee> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.seasar.doma.it.entity.CompKeyEmployee entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.seasar.doma.it.entity.CompKeyEmployee> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.seasar.doma.it.entity.CompKeyEmployee entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.seasar.doma.it.entity.CompKeyEmployee> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.seasar.doma.it.entity.CompKeyEmployee entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.seasar.doma.it.entity.CompKeyEmployee> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.CompKeyEmployee, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.CompKeyEmployee, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.seasar.doma.it.entity.CompKeyEmployee, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.seasar.doma.it.entity.CompKeyEmployee, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.seasar.doma.it.entity.CompKeyEmployee, ?, ?> getVersionPropertyType() {
        return $version;
    }

    @Override
    public org.seasar.doma.it.entity.CompKeyEmployee newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<org.seasar.doma.it.entity.CompKeyEmployee, ?>> __args) {
        org.seasar.doma.it.entity.CompKeyEmployee entity = new org.seasar.doma.it.entity.CompKeyEmployee();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<org.seasar.doma.it.entity.CompKeyEmployee> getEntityClass() {
        return org.seasar.doma.it.entity.CompKeyEmployee.class;
    }

    @Override
    public org.seasar.doma.it.entity.CompKeyEmployee getOriginalStates(org.seasar.doma.it.entity.CompKeyEmployee __entity) {
        return __originalStatesAccessor.get(__entity);
    }

    @Override
    public void saveCurrentStates(org.seasar.doma.it.entity.CompKeyEmployee __entity) {
        org.seasar.doma.it.entity.CompKeyEmployee __currentStates = new org.seasar.doma.it.entity.CompKeyEmployee();
        $employeeId1.copy(__currentStates, __entity);
        $employeeId2.copy(__currentStates, __entity);
        $employeeNo.copy(__currentStates, __entity);
        $employeeName.copy(__currentStates, __entity);
        $managerId1.copy(__currentStates, __entity);
        $managerId2.copy(__currentStates, __entity);
        $hiredate.copy(__currentStates, __entity);
        $salary.copy(__currentStates, __entity);
        $departmentId1.copy(__currentStates, __entity);
        $departmentId2.copy(__currentStates, __entity);
        $addressId1.copy(__currentStates, __entity);
        $addressId2.copy(__currentStates, __entity);
        $version.copy(__currentStates, __entity);
        __originalStatesAccessor.set(__entity, __currentStates);
    }

    /**
     * @return the singleton
     */
    public static _CompKeyEmployee getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _CompKeyEmployee newInstance() {
        return new _CompKeyEmployee();
    }

}
