package com.spring.professional.exam.tutorial.module04.question06.java.properties;

import com.spring.professional.exam.tutorial.module04.question06.java.properties.configuration.ApplicationConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationConfiguration.class)
@RequiredArgsConstructor
public class SpringBootConsoleApplication implements CommandLineRunner {

    private final ApplicationConfiguration applicationConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Configuration injected from properties:");
        System.out.println(applicationConfiguration);
    }
}
