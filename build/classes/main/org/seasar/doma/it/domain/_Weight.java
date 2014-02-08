package org.seasar.doma.it.domain;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.132+0900")
public final class _Weight extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.lang.Integer, org.seasar.doma.it.domain.Weight> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final _Weight singleton = new _Weight();

    private _Weight() {
        super(() -> new org.seasar.doma.wrapper.IntegerWrapper());
    }

    @Override
    protected org.seasar.doma.it.domain.Weight newDomain(java.lang.Integer value) {
        return new org.seasar.doma.it.domain.Weight(value);
    }

    @Override
    protected java.lang.Integer getBasicValue(org.seasar.doma.it.domain.Weight domain) {
        if (domain == null) {
            return null;
        }
        return domain.getValue();
    }

    @Override
    public Class<?> getBasicClass() {
        return java.lang.Integer.class;
    }

    @Override
    public Class<org.seasar.doma.it.domain.Weight> getDomainClass() {
        return org.seasar.doma.it.domain.Weight.class;
    }

    /**
     * @return the singleton
     */
    public static _Weight getSingletonInternal() {
        return singleton;
    }

}
