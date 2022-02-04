package com.spring.professional.exam.tutorial.module07.question15.controller;

import com.spring.professional.exam.tutorial.module07.question15.ds.Customer;
import com.spring.professional.exam.tutorial.module07.question15.ds.CustomerStatistics;
import com.spring.professional.exam.tutorial.module07.question15.service.CustomerStatisticsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
public class StatisticsControllerV1 {

  private CustomerStatisticsService customerStatisticsService;

  // curl -v -X POST -H 'Content-Type: application/json' -d '{ "code": "CS", "firstName": "Christine", "lastName": "Smart" }' http://localhost:8080/api/v1/calculateStatistics
  @PostMapping("/api/v1/calculateStatistics")
  @ResponseBody // CustomerStatistics object is bound to the body of the response
  public CustomerStatistics getStatistics(@RequestBody Customer customer) {
    return new CustomerStatistics(customer, customerStatisticsService.calculateStatistics(customer));
  }
}
