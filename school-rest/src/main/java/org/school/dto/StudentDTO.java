package org.school.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class StudentDTO {
    Long id;
    String name;
    double math;
    double physics;
    double chemistry;
}
