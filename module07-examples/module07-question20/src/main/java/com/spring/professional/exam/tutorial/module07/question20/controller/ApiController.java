package com.spring.professional.exam.tutorial.module07.question20.controller;

import com.spring.professional.exam.tutorial.module07.question20.dao.CustomersDao;
import com.spring.professional.exam.tutorial.module07.question20.ds.Customer;
import com.spring.professional.exam.tutorial.module07.question20.ds.CustomerCriteria;
import com.spring.professional.exam.tutorial.module07.question20.ds.Customers;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.net.URI;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ApiController {

  private CustomersDao customersDao;

  @GetMapping("/customers")
  public Customers listCustomers() {
    return new Customers(customersDao.findAll());
  }

  @RequestMapping(method = RequestMethod.HEAD, path = "/customers")
  public ResponseEntity listCustomersCount() {
    return ResponseEntity.ok()
                         .header("Customers-Count", String.valueOf(customersDao.count()))
                         .build();
  }

  @PostMapping("/customers/search")
  public ResponseEntity<Customers> searchCustomersByCriteria(@RequestBody CustomerCriteria customerCriteria) {
    List<Customer> foundCustomers = customersDao.findByFirstNameLike(customerCriteria.getFirstNameLike());

      return !foundCustomers.isEmpty() ?
              ResponseEntity.ok().body(new Customers(foundCustomers)) :
              ResponseEntity.notFound().build();
  }

  @PostMapping("/customers")
  public ResponseEntity<Customer> createCustomer(@RequestBody @Valid Customer customer) {
    Customer savedCustomer = customersDao.save(customer);
    return ResponseEntity.ok()
                         .location(URI.create("/api/customers/" + savedCustomer.getId()))
                         .body(savedCustomer);
  }

  @PutMapping("/customers")
  public Customers updateCustomers(@RequestBody @Valid Collection<Customer> customers) {
    customersDao.deleteAll();

    return new Customers(customersDao.saveAll(customers));
  }

  @DeleteMapping("/customers")
  public ResponseEntity deleteCustomers() {
      if (customersDao.count() > 0) {
          customersDao.deleteAll();
          return new ResponseEntity(HttpStatus.NO_CONTENT);
      }

      return new ResponseEntity(HttpStatus.NOT_FOUND);
  }

  @GetMapping("/customers/{id}")
  public Customer getCustomer(@PathVariable int id) {
    return customersDao.findById(id)
                       .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
  }

  @PutMapping("/customers/{id}")
  public Customer updateCustomer(@PathVariable int id, @RequestBody @Valid Customer customer) {
    customer.setId(id);
    return customersDao.save(customer);
  }

  @DeleteMapping("/customers/{id}")
  public ResponseEntity deleteCustomer(@PathVariable int id) {
      if (customersDao.existsById(id)) {
          customersDao.deleteById(id);
          return new ResponseEntity(HttpStatus.NO_CONTENT);
      }

      return new ResponseEntity(HttpStatus.NOT_FOUND);
  }
}
