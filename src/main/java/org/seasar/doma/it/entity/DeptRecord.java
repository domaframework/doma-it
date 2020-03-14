package org.seasar.doma.it.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.Version;
import org.seasar.doma.it.domain.DeptLoc;
import org.seasar.doma.it.embeddable.DeptInfo;

@Entity
@Table(name = "Department")
public record DeptRecord(
        @Id Integer departmentId,
        DeptInfo deptInfo,
        DeptLoc location,
        @Version Integer version) {
}
