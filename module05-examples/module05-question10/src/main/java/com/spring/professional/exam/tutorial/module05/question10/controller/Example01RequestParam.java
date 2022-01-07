package com.spring.professional.exam.tutorial.module05.question10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class Example01RequestParam {

  private static final String FIRST_LAST_TEMPLATE = "Received firstName = [%s], lastName = [%s]%n";

  // curl "http://localhost:8080/example01A?firstName=John&lastName=Doe"
  //   Received firstName = [John], lastName = [Doe]
  @GetMapping("/example01A")
  @ResponseBody
  public String example01A(@RequestParam String firstName,
                           @RequestParam String lastName) {
    return String.format(FIRST_LAST_TEMPLATE, firstName, lastName);
  }

  // curl "http://localhost:8080/example01B?firstName=John&lastName=Doe"
  //   Received firstName = [John], lastName = [Doe]
  // curl "http://localhost:8080/example01B?firstName=John"
  //   Received firstName = [John], lastName = [null]
  @GetMapping("/example01B")
  @ResponseBody
  public String example01B(@RequestParam String firstName,
                           @RequestParam(required = false) String lastName) {
    return String.format(FIRST_LAST_TEMPLATE, firstName, lastName);
  }

  // curl "http://localhost:8080/example01C?firstName=John&lastName=Doe"
  //   Received firstName = [John], lastName = [Doe]
  // curl "http://localhost:8080/example01C?firstName=John"
  //   Received firstName = [John], lastName = [N/A]
  @GetMapping("/example01C")
  @ResponseBody
  public String example01C(@RequestParam String firstName,
                           @RequestParam(required = false, defaultValue = "N/A") String lastName) {
    return String.format(FIRST_LAST_TEMPLATE, firstName, lastName);
  }

  // curl "http://localhost:8080/example01D?firstName=John&lastName=Doe"
  //   Received firstName = [John], lastName = [Doe]
  // curl "http://localhost:8080/example01D?firstName=John"
  //   Received firstName = [John], lastName = [N/A]
  @GetMapping("/example01D")
  @ResponseBody
  public String example01D(@RequestParam String firstName,
                           @RequestParam Optional<String> lastName) {
    return String.format(FIRST_LAST_TEMPLATE, firstName, lastName.orElse("N/A"));
  }
}
