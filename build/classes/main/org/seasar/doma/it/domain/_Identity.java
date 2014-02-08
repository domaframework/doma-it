package org.seasar.doma.it.domain;

/**
 * @param <T> T
 */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.127+0900")
public final class _Identity<T> extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.lang.Integer, org.seasar.doma.it.domain.Identity<T>> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    @SuppressWarnings("rawtypes")
    private static final _Identity singleton = new _Identity();

    private _Identity() {
        super(() -> new org.seasar.doma.wrapper.IntegerWrapper());
    }

    @Override
    protected org.seasar.doma.it.domain.Identity<T> newDomain(java.lang.Integer value) {
        if (value == null) {
            return null;
        }
        return new org.seasar.doma.it.domain.Identity<T>(value);
    }

    @Override
    protected java.lang.Integer getBasicValue(org.seasar.doma.it.domain.Identity<T> domain) {
        if (domain == null) {
            return null;
        }
        return domain.getValue();
    }

    @Override
    public Class<?> getBasicClass() {
        return java.lang.Integer.class;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<org.seasar.doma.it.domain.Identity<T>> getDomainClass() {
        Class<?> clazz = org.seasar.doma.it.domain.Identity.class;
        return (Class<org.seasar.doma.it.domain.Identity<T>>) clazz;
    }

    /**
     * @return the singleton
     */
    @SuppressWarnings("unchecked")
    public static <T> _Identity<T> getSingletonInternal() {
        return (_Identity<T>) singleton;
    }

}
