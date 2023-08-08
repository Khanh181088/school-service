package org.school.data.config;


import org.school.data.adapter.StudentRepositoryAdapter;
import org.school.data.jpa.entity.StudentEntity;

import org.school.data.jpa.repository.StudentJpaRepository;
import org.school.data.jpa.spec.StudentSpecificationBuilder;

import org.school.data.jpa.spec.processor.StudentCriteriaProcessor;
import org.school.data.jpa.spec.processor.StudentNameProcessor;

import org.school.data.mapper.StudentDataMapper;

import org.school.domain.repository.StudentRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@Configuration
@EntityScan(basePackageClasses = StudentEntity.class)
@EnableJpaRepositories(basePackageClasses = StudentJpaRepository.class)
public class DataJpaConfiguration {

    @Bean
    public StudentRepository studentRepositoryAdapter(StudentJpaRepository studentJpaRepository,
                                                      StudentDataMapper mapper,
                                                      StudentSpecificationBuilder studentSpecificationBuilder) {
        return new StudentRepositoryAdapter(studentJpaRepository, mapper, studentSpecificationBuilder);
    }

    @Bean
    StudentSpecificationBuilder studentSpecificationBuilder(List<StudentCriteriaProcessor> studentCriteriaProcessors) {
        return new StudentSpecificationBuilder(studentCriteriaProcessors);
    }

    @Bean
    StudentCriteriaProcessor studentNameProcessor() {
        return new StudentNameProcessor();
    }


}
