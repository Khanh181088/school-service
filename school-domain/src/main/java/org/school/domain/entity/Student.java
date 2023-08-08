package org.school.domain.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@Getter
@Builder(toBuilder = true)
@FieldDefaults(level = PRIVATE)
public class Student {
    Long id;
    String name;
    double math;
    double physics;
    double chemistry;

    public double calcAvgPoint() {
        return (math + physics + chemistry) / 3;
    }
}
