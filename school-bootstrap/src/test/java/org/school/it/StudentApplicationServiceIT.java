package org.school.it;

import org.school.SchoolApplication;
import org.school.domain.entity.Student;
import org.school.domain.vo.StudentCriteria;
import org.school.service.StudentApplicationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = {SchoolApplication.class})
class StudentApplicationServiceIT {

    @Autowired
    private StudentApplicationService studentApplicationService;

    //TODO: IT ensure the data init  is correctly
    @Test
    void get_should_work_correctly() {
        // When
        Student student = studentApplicationService.getById(1L);
        // Then
        assertThat(student.getId()).isEqualTo(1L);
        assertThat(student.getName()).isEqualTo("Student 1");
        assertThat(student.getMath()).isEqualTo(1);
        assertThat(student.getPhysics()).isEqualTo(2);
        assertThat(student.getChemistry()).isEqualTo(3);
    }

}