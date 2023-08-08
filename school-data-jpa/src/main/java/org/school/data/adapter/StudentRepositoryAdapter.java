package org.school.data.adapter;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.school.data.jpa.repository.StudentJpaRepository;
import org.school.data.jpa.spec.StudentSpecificationBuilder;
import org.school.data.mapper.StudentDataMapper;
import org.school.domain.entity.Student;
import org.school.domain.repository.StudentRepository;
import org.school.domain.vo.StudentCriteria;

import java.util.List;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentRepositoryAdapter implements StudentRepository {

    StudentJpaRepository studentJpaRepository;
    StudentDataMapper mapper;
    StudentSpecificationBuilder specificationBuilder;

    @Override
    public Student get(Long id) {
        return mapper.map(studentJpaRepository.getById(id));
    }


    @Override
    public List<Student> findAll() {
        return mapper.mapList(studentJpaRepository.findAll());
    }

    @Override
    public List<Student> search(StudentCriteria criteria) {
        return mapper.mapList(
                studentJpaRepository.findAll(specificationBuilder.build(criteria))
        );
    }


}
