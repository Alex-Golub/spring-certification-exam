package com.spring.professional.exam.tutorial.module07.question10.controller;

import com.spring.professional.exam.tutorial.module07.question10.dao.ArticlesDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class ArticlesController {

  private ArticlesDao articlesDao;

  // http://localhost:8080/articles
  @GetMapping("/articles")
  public String listArticles(Model model) {
    model.addAttribute("articles", articlesDao.findAll());

    return "index";
  }
}
