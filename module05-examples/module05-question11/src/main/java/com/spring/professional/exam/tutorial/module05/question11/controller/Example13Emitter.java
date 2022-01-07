package com.spring.professional.exam.tutorial.module05.question11.controller;

import com.spring.professional.exam.tutorial.module05.question11.ds.Person;
import com.spring.professional.exam.tutorial.module05.question11.utils.SleepUtil;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.util.concurrent.CompletableFuture;

@Controller
public class Example13Emitter {

  @Autowired
  private TaskExecutor taskExecutor;

  // curl -D - http://localhost:8080/example13A
  @GetMapping("/example13A")
  @ResponseBody
  public ResponseBodyEmitter example13A() {
    ResponseBodyEmitter emitter = new ResponseBodyEmitter();

    CompletableFuture<Void> completableFuture = CompletableFuture
            .runAsync(() -> send(emitter, new Person("John", "Doe"), MediaType.APPLICATION_JSON))
            .thenRunAsync(() -> send(emitter, new Person("William", "Anderson"), MediaType.APPLICATION_JSON))
            .thenRun(emitter::complete);

    taskExecutor.execute(completableFuture::join);

    return emitter;
  }

  // curl -D - http://localhost:8080/example13B
  @GetMapping("/example13B")
  @ResponseBody
  public SseEmitter example13B() {
    SseEmitter emitter = new SseEmitter();

    CompletableFuture<Void> completableFuture = CompletableFuture
            .runAsync(() -> {
              SleepUtil.sleep();
              send(emitter, new Person("William", "Anderson"), MediaType.APPLICATION_JSON);
            })
            .thenRunAsync(() -> {
              SleepUtil.sleep();
              send(emitter, new Person("John", "Doe"), MediaType.APPLICATION_JSON);
            })
            .thenRun(emitter::complete);

    taskExecutor.execute(completableFuture::join);

    return emitter;
  }

  @SneakyThrows
  private void send(ResponseBodyEmitter emitter, Object object, MediaType mediaType) {
    emitter.send(object, mediaType);
  }
}
