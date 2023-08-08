package org.school.data.jpa.spec.processor;

import org.school.data.jpa.entity.StudentEntity;
import org.school.domain.vo.StudentCriteria;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;

import static org.apache.commons.lang3.StringUtils.isBlank;

public class StudentNameProcessor implements StudentCriteriaProcessor {

    @Override
    public boolean needBuild(StudentCriteria criteria) {
        return !isBlank(criteria.getName());
    }

    @Override
    public Specification<StudentEntity> build(StudentCriteria criteria) {
        return (root, query, criteriaBuilder) -> {
            Path<String> childPath = root.get("name");
            Predicate predicate = criteriaBuilder.like(criteriaBuilder.lower(childPath), String.format("%%%s%%", criteria.getName().toLowerCase()));
            return criteriaBuilder.or(predicate);
        };
    }
}
