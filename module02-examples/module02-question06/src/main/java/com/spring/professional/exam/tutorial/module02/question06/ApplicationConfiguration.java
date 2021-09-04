package com.spring.professional.exam.tutorial.module02.question06;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy // Enables support for handling components marked with @Aspect annotation
public class ApplicationConfiguration {
//  @Bean
//  public HelloBeanAspect helloBeanAspect() {
//    return new HelloBeanAspect();
//  }
//
//  @Bean
//  public HelloBean helloBean() {
//    return new HelloBean();
//  }
}
