package com.spring.professional.exam.tutorial.module05.question05.controller;

import com.spring.professional.exam.tutorial.module05.question05.dao.ArticlesDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class IndexController {

  private ArticlesDao articlesDao;

  @GetMapping(path = {"/", "/index", "/home"}) // match against one or more paths
  public String index(Model model) {
    model.addAttribute("articles", articlesDao.findAll());

    return "index";
  }
}
