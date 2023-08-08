package org.school.data.mapper;

import org.school.data.jpa.entity.StudentEntity;
import org.school.domain.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.SET_TO_NULL;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = SET_TO_NULL,
        nullValueCheckStrategy = ALWAYS
)
public interface StudentDataMapper {

    Student map(StudentEntity source);

    List<Student> mapList(List<StudentEntity> sources);
}
