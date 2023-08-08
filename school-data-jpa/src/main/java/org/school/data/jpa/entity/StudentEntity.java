package org.school.data.jpa.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.JoinColumnsOrFormulas;
import org.hibernate.annotations.JoinFormula;


import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "STUDENT")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_STUDENT")
    Long id;

    String name;

    double math;
    double physics;
    double chemistry;

}
