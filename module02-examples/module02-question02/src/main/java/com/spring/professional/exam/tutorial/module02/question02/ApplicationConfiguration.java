package com.spring.professional.exam.tutorial.module02.question02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy // Aspect must be enabled in configuration to enable AOP behaviour
public class ApplicationConfiguration {
}
