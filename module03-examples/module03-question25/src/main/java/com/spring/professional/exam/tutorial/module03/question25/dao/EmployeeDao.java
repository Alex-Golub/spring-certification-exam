package com.spring.professional.exam.tutorial.module03.question25.dao;

import com.spring.professional.exam.tutorial.module03.question25.ds.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

    // In addition to generated functionality that we get from CrudRepository<T, ID>
    // we can define our custom queries without implementation, they will be implemented auto.
    // by Spring, convention must be followed e.g. findBy...
    Employee findByEmail(String email);

    List<Employee> findByLastName(String lastName);

    List<Employee> findBySalaryBetween(float min, float max);
}
