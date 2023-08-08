package org.school.domain.repository;

import org.school.domain.entity.Student;
import org.school.domain.vo.StudentCriteria;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    List<Student> search(StudentCriteria criteria);
    Student get(Long id);
}
