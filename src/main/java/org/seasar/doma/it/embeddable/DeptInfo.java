package org.seasar.doma.it.embeddable;

import org.seasar.doma.Embeddable;

@Embeddable
public record DeptInfo(Integer departmentNo,
                       String departmentName) {
}
