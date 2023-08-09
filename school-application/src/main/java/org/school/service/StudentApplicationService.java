package org.school.service;

import lombok.AllArgsConstructor;
import org.school.domain.entity.Student;
import org.school.domain.repository.StudentRepository;
import org.school.domain.vo.StudentCriteria;

import java.util.List;

@AllArgsConstructor
public class StudentApplicationService {

    StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public List<Student> search(StudentCriteria studentCriteria) {
        return studentRepository.search(studentCriteria);
    }

    public Student getById(Long id) {
        return studentRepository.get(id);
    }

}
