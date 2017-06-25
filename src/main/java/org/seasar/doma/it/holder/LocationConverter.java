package org.seasar.doma.it.holder;

import org.seasar.doma.ExternalHolder;
import org.seasar.doma.jdbc.holder.HolderConverter;

@ExternalHolder
public class LocationConverter implements HolderConverter<Location<?>, String> {

    @Override
    public String fromHolderToValue(Location<?> domain) {
        return domain.getValue();
    }

    @SuppressWarnings("rawtypes")
    @Override
    public Location<?> fromValueToHolder(String value) {
        return new Location(value);
    }

}
