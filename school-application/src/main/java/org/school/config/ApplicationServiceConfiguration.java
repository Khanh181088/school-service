package org.school.config;


import org.school.domain.repository.StudentRepository;

import org.school.service.StudentApplicationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationServiceConfiguration {

    @Bean
    StudentApplicationService studentApplicationService(StudentRepository studentRepository) {
        return new StudentApplicationService(studentRepository);
    }

}
