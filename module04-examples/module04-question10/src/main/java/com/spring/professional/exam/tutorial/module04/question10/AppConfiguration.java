package com.spring.professional.exam.tutorial.module04.question10;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Data object class that is used to read application properties
 * from an application.properties file
 * Make sure that the main class has the @EnableConfigurationProperties(AppConfiguration.class)
 * annotation set this will tell spring where the data object is
 */
@ConfigurationProperties(prefix = "app")
@Getter
@Setter
public class AppConfiguration {
    private String propertyA;
}
