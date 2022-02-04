package com.spring.professional.exam.tutorial.module07.question19.ui.controller;

import com.spring.professional.exam.tutorial.module07.question19.ui.ds.Customer;
import com.spring.professional.exam.tutorial.module07.question19.ui.ds.Customers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller
public class CustomersController {

  @Value("${app.backend.url}")
  private String backendUrl;
  private final RestTemplate restTemplate = new RestTemplate();

  @GetMapping("/customers")
  public ModelAndView index() {
    ResponseEntity<Customers> responseEntity = restTemplate.getForEntity(backendUrl + "/api/customers", Customers.class);

      if (responseEntity.getStatusCode() == HttpStatus.OK) {
          return new ModelAndView("customers", "customers", Objects.requireNonNull(responseEntity.getBody()).getCustomers());
      } else {
          throw new IllegalStateException(String.format("Unable to list customers, received status %s", responseEntity.getStatusCode()));
      }
  }

  @GetMapping("/customers/create")
  public ModelAndView create() {
    return new ModelAndView("customer-create", "customer", new Customer());
  }

  @PostMapping("/customers/create")
  public String create(@ModelAttribute Customer customer, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "customer-create";
    } else {
      ResponseEntity<Customer> responseEntity = restTemplate.postForEntity(backendUrl + "/api/customers", customer, Customer.class);

        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new IllegalStateException(String.format("Unable to create customer, received status %s", responseEntity.getStatusCode()));
        }

      return "redirect:/customers";
    }
  }

  @GetMapping("/customers/delete/{id}")
  public String delete(@PathVariable Integer id) {
    restTemplate.delete(backendUrl + "/api/customers/{id}", id);

    return "redirect:/customers";
  }
}
