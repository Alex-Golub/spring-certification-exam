package com.spring.professional.exam.tutorial.module04.question23.application;

import com.spring.professional.exam.tutorial.module04.question23.auto.configuration.filestore.FileStore;
import com.spring.professional.exam.tutorial.module04.question23.auto.configuration.java.JavaEnvInfo;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class Runner implements CommandLineRunner {

    private JavaEnvInfo javaEnvInfo;
    private EmployeesService employeesService;
    private FileStore fileStore; // autowiring according to the property in application.properties

    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);
    }

    @Override
    public void run(String... args) {
        javaEnvInfo.printJvmEnvInfo();
        fileStore.printFileStoreInfo();

        employeesService.printEmails();
    }
}
