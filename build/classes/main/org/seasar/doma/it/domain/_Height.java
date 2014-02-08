package org.seasar.doma.it.domain;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.124+0900")
public final class _Height extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.lang.Integer, org.seasar.doma.it.domain.Height> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final _Height singleton = new _Height();

    private _Height() {
        super(() -> new org.seasar.doma.wrapper.IntegerWrapper());
    }

    @Override
    protected org.seasar.doma.it.domain.Height newDomain(java.lang.Integer value) {
        if (value == null) {
            return null;
        }
        return new org.seasar.doma.it.domain.Height(value);
    }

    @Override
    protected java.lang.Integer getBasicValue(org.seasar.doma.it.domain.Height domain) {
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
    public Class<org.seasar.doma.it.domain.Height> getDomainClass() {
        return org.seasar.doma.it.domain.Height.class;
    }

    /**
     * @return the singleton
     */
    public static _Height getSingletonInternal() {
        return singleton;
    }

}
