package com.spring.professional.exam.tutorial.module03.question21.ds;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor // Hibernate requires a no-arg constructor
@Getter
@Setter
@Entity // Object of this type will be a row in a DB
@ToString
public class Employee {
    @Id
    private int id; // unique ID for this entity
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date hireDate;
    private float salary;
}
