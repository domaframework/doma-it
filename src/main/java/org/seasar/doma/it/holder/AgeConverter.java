package org.seasar.doma.it.holder;

import org.seasar.doma.ExternalHolder;
import org.seasar.doma.jdbc.holder.HolderConverter;

@ExternalHolder
public class AgeConverter implements HolderConverter<Age, Integer> {

    @Override
    public Integer fromHolderToValue(Age domain) {
        return null;
    }

    @Override
    public Age fromValueToHolder(Integer value) {
        return null;
    }

}
