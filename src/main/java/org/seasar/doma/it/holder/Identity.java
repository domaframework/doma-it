package org.seasar.doma.it.holder;

import org.seasar.doma.Holder;

@Holder(valueType = Integer.class)
public class Identity<T> {

    private final Integer value;

    public Identity(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }
}
