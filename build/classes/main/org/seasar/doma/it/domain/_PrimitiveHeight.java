package org.seasar.doma.it.domain;

/** */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.129+0900")
public final class _PrimitiveHeight extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.lang.Integer, org.seasar.doma.it.domain.PrimitiveHeight> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    private static final _PrimitiveHeight singleton = new _PrimitiveHeight();

    private _PrimitiveHeight() {
        super(() -> new org.seasar.doma.wrapper.IntegerWrapper());
    }

    @Override
    protected org.seasar.doma.it.domain.PrimitiveHeight newDomain(java.lang.Integer value) {
        return new org.seasar.doma.it.domain.PrimitiveHeight(org.seasar.doma.internal.util.BoxedPrimitiveUtil.unbox(value));
    }

    @Override
    protected java.lang.Integer getBasicValue(org.seasar.doma.it.domain.PrimitiveHeight domain) {
        if (domain == null) {
            return null;
        }
        return domain.getValue();
    }

    @Override
    public Class<?> getBasicClass() {
        return int.class;
    }

    @Override
    public Class<org.seasar.doma.it.domain.PrimitiveHeight> getDomainClass() {
        return org.seasar.doma.it.domain.PrimitiveHeight.class;
    }

    /**
     * @return the singleton
     */
    public static _PrimitiveHeight getSingletonInternal() {
        return singleton;
    }

}
