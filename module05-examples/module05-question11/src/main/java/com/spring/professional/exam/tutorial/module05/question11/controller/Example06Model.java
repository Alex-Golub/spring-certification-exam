package com.spring.professional.exam.tutorial.module05.question11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class Example06Model {

  // Visit http://localhost:8080/example06A
  @GetMapping("/example06A")
  public Model example06A() {
    Model model = new BindingAwareModelMap();
    model.addAttribute("names", Arrays.asList("John", "Mary", "William", "James"));
    model.addAttribute("cities", Arrays.asList("New York City", "Tokyo", "Sydney", "Bengaluru"));
    return model;
  }

  // Visit http://localhost:8080/example06B
  @GetMapping("/example06B")
  public Map example06B() {
    return Map.of(
            "names", Arrays.asList("John", "Mary", "William", "James"),
            "cities", Arrays.asList("New York City", "Tokyo", "Sydney", "Bengaluru")
    );
  }
}
