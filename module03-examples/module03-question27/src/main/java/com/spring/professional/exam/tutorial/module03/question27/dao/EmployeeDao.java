package com.spring.professional.exam.tutorial.module03.question27.dao;

import com.spring.professional.exam.tutorial.module03.question27.ds.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    Employee findByFirstNameAndLastName(String firstName, String lastName);

    List<Employee> findTop3ByOrderBySalaryDesc();

    List<Employee> findByHireDateBetween(Date min, Date max);

    List<Employee> findByOrderByHireDateDesc();

    Employee findFirstByEmailContainingAndHireDateBetween(String email, Date from, Date to);
}
