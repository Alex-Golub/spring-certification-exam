package com.spring.professional.exam.tutorial.module05.question11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

@Controller
public class Example14StreamingResponseBody {

  // curl http://localhost:8080/example14
  @GetMapping("/example14")
  public StreamingResponseBody example14() {
    return outputStream -> {
      outputStream.write("John".getBytes());
      outputStream.write("Doe".getBytes());
    };
  }
}
