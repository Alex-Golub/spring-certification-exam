package com.spring.professional.exam.tutorial.module03.question08.service;

import com.spring.professional.exam.tutorial.module03.question08.dao.EmployeeDao;
import com.spring.professional.exam.tutorial.module03.question08.ds.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

@Service
@RequiredArgsConstructor
public class EmployeesService {
    private final EmployeeDao employeeDao;

    public void printEmployees() {
        System.out.println("Printing list of employees");
        employeeDao.findAllEmployees().forEach(System.out::println);
    }

    public void deleteAllEmployees() {
        System.out.println("Deleting all employees...");
        employeeDao.deleteAllEmployees();
    }

    /**
     * Each employee will be saved and upon reaching employee with id -1 exception
     * is thrown and db not reverted to previous state i.e. 3 db is now populated with
     * 3 employee instances thus violating the consistency rule see ACID
     */
    public void saveEmployeesWithoutTransaction() {
        System.out.println("Saving employees without transaction...");
        saveEmployees();
    }

    /**
     * All transactions are made in one go and if one of them fail then DB is rolled back ta previous
     * state preserving the state before transaction was made (consistency)
     */
    @Transactional
    public void saveEmployeesInTransaction() {
        System.out.println("Saving employees with transaction...");
        saveEmployees();
    }

    private void saveEmployees() {
        employeeDao.saveEmployee(new Employee(1, "John", "Doe", "John.Doe@corp.com", "555-55-55", Date.valueOf("2019-06-05"), 70000));
        employeeDao.saveEmployee(new Employee(2, "Willow", "Zhang", "Willow.Zhang@corp.com", "555-55-56", Date.valueOf("2019-07-12"), 80000));
        employeeDao.saveEmployee(new Employee(3, "Jayvon", "Grant", "Jayvon.Grant@corp.com", "555-55-57", Date.valueOf("2019-07-17"), 90000));

        // Employee with -ve id is not allowed in DB thus this will throw exception
        // If @Transactional is not used then first three employees will be persisted to DB
        // If @Transactional is used then all the saveEmployee(Employee) should be persisted as one unit
        // but since there is invalid employee id the transaction will fail as a unit and all all changes
        // will be reverted (consistency rule)
        employeeDao.saveEmployee(new Employee(-1, "Shaylee", "Mcclure", "Shaylee.Mcclure@corp.com", "555-55-58", Date.valueOf("2019-07-19"), 120000));
        employeeDao.saveEmployee(new Employee(5, "Miley", "Krueger", "Miley.Krueger@corp.com", "555-55-59", Date.valueOf("2019-07-20"), 110000));
    }
}
