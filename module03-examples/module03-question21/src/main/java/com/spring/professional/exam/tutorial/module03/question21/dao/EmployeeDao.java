package com.spring.professional.exam.tutorial.module03.question21.dao;

import com.spring.professional.exam.tutorial.module03.question21.ds.Employee;
import org.springframework.data.repository.CrudRepository;

// EnableJpaRepositories is configured to scan this interface and since it extends CrudRepository
// Spring data will take care of creating DAO for an Employee object Ctrl + F12 to see all
// the generated methods by Spring Data
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
}
