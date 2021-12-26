package com.spring.professional.exam.tutorial.module04.question04.application;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
// autoconfiguration for data source will be done in
// a class that imported from a dependency and spring will
// know which classes are for autoconfiguration using the META-INF/spring.factories
// file which is part of the dependency application
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class ApplicationConfiguration {
}
