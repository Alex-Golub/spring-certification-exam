package com.spring.professional.exam.tutorial.module07.question10.controller;

import com.spring.professional.exam.tutorial.module07.question10.dao.ArticlesDao;
import com.spring.professional.exam.tutorial.module07.question10.ds.Article;
import com.spring.professional.exam.tutorial.module07.question10.ds.Articles;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
@RequestMapping(value = "/api/articles")
@AllArgsConstructor
public class ArticlesRestController {

  private ArticlesDao articlesDao;

  // curl localhost:8080/api/articles |jq
  @GetMapping(produces = APPLICATION_JSON_VALUE)
  public ResponseEntity<Iterable<Article>> listArticlesJSON() {
    return ResponseEntity.ok().body(articlesDao.findAll());
  }

  // curl -H 'Accept: application/xml' localhost:8080/api/articles |xml_pp
  @GetMapping(produces = APPLICATION_XML_VALUE)
  public ResponseEntity<Articles> listArticlesXML() {
    return ResponseEntity.ok().body(new Articles(articlesDao.findAll()));
  }
}
