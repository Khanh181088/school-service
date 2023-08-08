package org.school.data.jpa.spec.processor;

import org.school.data.jpa.entity.StudentEntity;
import org.school.domain.vo.StudentCriteria;
import org.springframework.data.jpa.domain.Specification;

public interface StudentCriteriaProcessor {
    boolean needBuild(StudentCriteria studentCriteria);

    Specification<StudentEntity> build(StudentCriteria studentCriteria);
}
