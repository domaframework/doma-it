package __.org.seasar.doma.it.domain;

/**
 * @param <T> T
 */
@javax.annotation.Generated(value = { "Doma", "2.0-beta-2-SNAPSHOT" }, date = "2014-02-08T10:52:16.141+0900")
public final class _Location<T> extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.lang.String, org.seasar.doma.it.domain.Location<T>> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.0-beta-2-SNAPSHOT");
    }

    @SuppressWarnings("rawtypes")
    private static final _Location singleton = new _Location();

    private static final org.seasar.doma.it.domain.LocationConverter converter = new org.seasar.doma.it.domain.LocationConverter();

    private _Location() {
        super(() -> new org.seasar.doma.wrapper.StringWrapper());
    }

    @SuppressWarnings("unchecked")
    @Override
    protected org.seasar.doma.it.domain.Location<T> newDomain(java.lang.String value) {
        return (org.seasar.doma.it.domain.Location<T>) converter.fromValueToDomain(value);
    }

    @Override
    protected java.lang.String getBasicValue(org.seasar.doma.it.domain.Location<T> domain) {
        if (domain == null) {
            return null;
        }
        return converter.fromDomainToValue(domain);
    }

    @Override
    public Class<?> getBasicClass() {
        return java.lang.String.class;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<org.seasar.doma.it.domain.Location<T>> getDomainClass() {
        Class<?> clazz = org.seasar.doma.it.domain.Location.class;
        return (Class<org.seasar.doma.it.domain.Location<T>>) clazz;
    }

    /**
     * @return the singleton
     */
    @SuppressWarnings("unchecked")
    public static <T> _Location<T> getSingletonInternal() {
        return (_Location<T>) singleton;
    }

}
