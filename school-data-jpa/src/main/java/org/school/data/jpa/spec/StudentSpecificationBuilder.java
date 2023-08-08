package org.school.data.jpa.spec;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.school.data.jpa.entity.StudentEntity;
import org.school.data.jpa.spec.processor.StudentCriteriaProcessor;
import org.school.domain.vo.StudentCriteria;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentSpecificationBuilder {

    List<StudentCriteriaProcessor> studentCriteriaProcessors;

    public Specification<StudentEntity> build(StudentCriteria studentCriteria) {
        Specification<StudentEntity> result = null;
        for (StudentCriteriaProcessor studentCriteriaProcessor : studentCriteriaProcessors) {
            if (studentCriteriaProcessor.needBuild(studentCriteria)) {
                Specification<StudentEntity> specification = studentCriteriaProcessor.build(studentCriteria);
                if (result == null) {
                    result = specification;
                } else {
                    result = result.and(specification);
                }
            }
        }
        return result;
    }
}
