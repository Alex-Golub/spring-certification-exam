package com.spring.professional.exam.tutorial.module03.question02.standalone.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;

    /**
     * Setter injection when this bean is first invoked
     * will also init the jdbcTemplate to be able to access
     * the DataSource
     */
    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<String> findEmployeeEmails() {
        return jdbcTemplate.queryForList(
                "select email from employee",
                String.class
        );
    }
}
