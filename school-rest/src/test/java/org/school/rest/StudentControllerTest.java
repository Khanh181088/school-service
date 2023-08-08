package org.school.rest;

import org.school.domain.entity.Student;
import org.school.dto.StudentDTO;
import org.school.mapper.StudentCriteriaMapper;
import org.school.mapper.StudentDTOMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.school.service.StudentApplicationService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class StudentControllerTest {

    @InjectMocks
    StudentController studentController;

    @Mock
    StudentDTOMapper studentDTOMapper;

    @Mock
    StudentCriteriaMapper criteriaMapper;

    @Mock
    StudentApplicationService service;

    //TODO: Unit test
    @Test
    public void get_should_work_correctly(){
        // Given
        Long studentId = 1L;

        // Expect service return a student class
        Student student = mock(Student.class);
        doReturn(student).when(service).getById(studentId);

        //Expect mapper return a classs
        StudentDTO expected = mock(StudentDTO.class);
        doReturn(expected).when(studentDTOMapper).map(student);
        // When
        StudentDTO actual = studentController.getById(studentId);
        // Then
        assertThat(actual).isSameAs(expected);
    }

    // Open point about spy and mock
}