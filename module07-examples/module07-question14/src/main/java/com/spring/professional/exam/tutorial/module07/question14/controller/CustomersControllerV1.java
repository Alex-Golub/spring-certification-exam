package com.spring.professional.exam.tutorial.module07.question14.controller;

import com.spring.professional.exam.tutorial.module07.question14.ds.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController // @RestController includes @ResponseBody
public class CustomersControllerV1 {

    // curl -i http://localhost:8080/api/v1/customerA
    @GetMapping("/api/v1/customerA")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Customer getCustomerA() {
        return new Customer("CC", "Caitlin", "Chen");
    }

    // curl -i http://localhost:8080/api/v1/customerB
    @GetMapping("/api/v1/customerB")
    @ResponseStatus(HttpStatus.PARTIAL_CONTENT)
    public Customer getCustomerB() {
        return new Customer("KT", "Kamila", "Terry");
    }

    // curl -i http://localhost:8080/api/v1/customerC
    @GetMapping("/api/v1/customerC")
    @ResponseStatus(HttpStatus.MULTI_STATUS)
    public Customer getCustomerC() {
        return new Customer("EH", "Eve", "Harrell");
    }
}
