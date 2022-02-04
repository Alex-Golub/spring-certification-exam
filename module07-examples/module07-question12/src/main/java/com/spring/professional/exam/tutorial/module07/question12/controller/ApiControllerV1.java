package com.spring.professional.exam.tutorial.module07.question12.controller;

import com.spring.professional.exam.tutorial.module07.question12.dao.AddressesDao;
import com.spring.professional.exam.tutorial.module07.question12.dao.CustomersDao;
import com.spring.professional.exam.tutorial.module07.question12.ds.Address;
import com.spring.professional.exam.tutorial.module07.question12.ds.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/api/v1")
@AllArgsConstructor
public class ApiControllerV1 {

  private CustomersDao customersDao;
  private AddressesDao addressesDao;

  // curl localhost:8080/api/v1/customers |jq
  @GetMapping("customers")
  public Iterable<Customer> listCustomers() {
    return customersDao.findAll();
  }

  // curl localhost:8080/api/v1/addresses |jq
  @GetMapping("addresses")
  public Iterable<Address> listAddresses() {
    return addressesDao.findAll();
  }
}
