package org.school.mapper;

import org.school.domain.entity.Student;
import org.school.dto.StudentDTO;
import org.mapstruct.Mapper;

import java.util.List;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.SET_TO_NULL;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = SET_TO_NULL,
        nullValueCheckStrategy = ALWAYS
)
public interface StudentDTOMapper {
    StudentDTO map(Student student);
    List<StudentDTO> map(List<Student> student);
}
