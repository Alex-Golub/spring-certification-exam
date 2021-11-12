package com.spring.professional.exam.tutorial.module03.question03.jdbc.template;

import com.spring.professional.exam.tutorial.module03.question03.jdbc.template.service.EmployeeReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootConsoleApplication implements CommandLineRunner {

    private final EmployeeReportService employeeReportService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeReportService.printReport();
    }
}
