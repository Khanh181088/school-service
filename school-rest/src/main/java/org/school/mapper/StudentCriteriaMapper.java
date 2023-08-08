package org.school.mapper;

import org.school.domain.vo.StudentCriteria;
import org.school.dto.StudentCriteriaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.SET_TO_NULL;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = SET_TO_NULL,
        nullValueCheckStrategy = ALWAYS
)
public interface StudentCriteriaMapper {
    StudentCriteria map(StudentCriteriaDTO source);
}
