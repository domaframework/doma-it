package __.org.seasar.doma.it.domain;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.139+0900")
public final class _Age extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.lang.Integer, org.seasar.doma.it.domain.Age> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final _Age singleton = new _Age();

    private static final org.seasar.doma.it.domain.AgeConverter converter = new org.seasar.doma.it.domain.AgeConverter();

    private _Age() {
        super(() -> new org.seasar.doma.wrapper.IntegerWrapper());
    }

    @Override
    protected org.seasar.doma.it.domain.Age newDomain(java.lang.Integer value) {
        return converter.fromValueToDomain(value);
    }

    @Override
    protected java.lang.Integer getBasicValue(org.seasar.doma.it.domain.Age domain) {
        if (domain == null) {
            return null;
        }
        return converter.fromDomainToValue(domain);
    }

    @Override
    public Class<?> getBasicClass() {
        return java.lang.Integer.class;
    }

    @Override
    public Class<org.seasar.doma.it.domain.Age> getDomainClass() {
        return org.seasar.doma.it.domain.Age.class;
    }

    /**
     * @return the singleton
     */
    public static _Age getSingletonInternal() {
        return singleton;
    }

}
