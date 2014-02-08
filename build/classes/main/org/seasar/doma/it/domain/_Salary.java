package org.seasar.doma.it.domain;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.131+0900")
public final class _Salary extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.math.BigDecimal, org.seasar.doma.it.domain.Salary> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final _Salary singleton = new _Salary();

    private _Salary() {
        super(() -> new org.seasar.doma.wrapper.BigDecimalWrapper());
    }

    @Override
    protected org.seasar.doma.it.domain.Salary newDomain(java.math.BigDecimal value) {
        if (value == null) {
            return null;
        }
        return new org.seasar.doma.it.domain.Salary(value);
    }

    @Override
    protected java.math.BigDecimal getBasicValue(org.seasar.doma.it.domain.Salary domain) {
        if (domain == null) {
            return null;
        }
        return domain.getValue();
    }

    @Override
    public Class<?> getBasicClass() {
        return java.math.BigDecimal.class;
    }

    @Override
    public Class<org.seasar.doma.it.domain.Salary> getDomainClass() {
        return org.seasar.doma.it.domain.Salary.class;
    }

    /**
     * @return the singleton
     */
    public static _Salary getSingletonInternal() {
        return singleton;
    }

}
