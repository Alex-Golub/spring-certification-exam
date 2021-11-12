package com.spring.professional.exam.tutorial.module03.question03.jdbc.template.service;

import com.spring.professional.exam.tutorial.module03.question03.jdbc.template.dao.EmployeeDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeReportService {

    private final EmployeeDao employeeDao;

    public void printReport() {
        System.out.println("Employee Report Start");

        System.out.println("Employee Count = " + employeeDao.findEmployeesCount());
        System.out.println("First Hired Employee Count = " + employeeDao.findFirstHiredEmployee());
        System.out.println("Highest Salary Employee Count = " + employeeDao.findEmployeeWithHighestSalary());

        System.out.println("Employees List");
        employeeDao.findEmployees().forEach(System.out::println);

        System.out.println("Employee Report Stop");
    }
}
