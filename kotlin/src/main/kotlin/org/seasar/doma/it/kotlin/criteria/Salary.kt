package org.seasar.doma.it.kotlin.criteria

import org.seasar.doma.Domain
import java.math.BigDecimal

@Domain(valueType = BigDecimal::class)
class Salary(val value: BigDecimal) {

    constructor(value: String?) : this(BigDecimal(value)) {}

    override fun toString(): String {
        return value.toString()
    }
}
