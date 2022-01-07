package com.spring.professional.exam.tutorial.module05.question09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class Example05HttpSession {

  private final String COUNTER = "counter";

  // curl -c cookie.txt -b cookie.txt localhost:8080/actionE
  // session id must be written to cookie to save the value of COUNTER in the session
  // if cookie is not provided then for each request new value of COUNTER is created
  @GetMapping("/actionE")
  @ResponseBody
  public String actionE(HttpSession httpSession) {
    Integer counter = (Integer) httpSession.getAttribute(COUNTER);
    if (counter == null) {
      httpSession.setAttribute(COUNTER, 0);
      counter = 0;
    }

    httpSession.setAttribute(COUNTER, ++counter);

    return String.format("Counter = [%d]%n", counter);
  }
}
