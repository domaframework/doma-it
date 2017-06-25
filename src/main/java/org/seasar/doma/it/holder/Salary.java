package org.seasar.doma.it.holder;

import java.math.BigDecimal;

import org.seasar.doma.Holder;

@Holder(valueType = BigDecimal.class)
public class Salary {

    private final BigDecimal value;

    public Salary(BigDecimal value) {
        this.value = value;
    }

    public Salary(String value) {
        this(new BigDecimal(value));
    }

    public BigDecimal getValue() {
        return value;
    }
}
