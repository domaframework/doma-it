package org.seasar.doma.it.domain;

import org.seasar.doma.Domain;

@Domain(valueType = String.class, accessorMethod = "value")
public record DeptLoc(String value) {
}
