package com.spring.professional.exam.tutorial.module05.question11.controller;

import com.spring.professional.exam.tutorial.module05.question11.ds.Person;
import com.spring.professional.exam.tutorial.module05.question11.utils.SleepUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.util.concurrent.ListenableFutureTask;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@Controller
public class Example12Future {

  private static final String LONG_OPERATION_FINISHED = "Pretended long operation finished, returning value...";
  private static final String LONG_OPERATION_RUNNING = "Pretending to run long operation for %d seconds in thread %s";
  private final Logger logger = LoggerFactory.getLogger(Example12Future.class);
  @Autowired
  private TaskExecutor taskExecutor;

  // curl http://localhost:8080/example12A
  @GetMapping("/example12A")
  @ResponseBody
  public ListenableFuture<Person> example12A() {
    ListenableFutureTask<Person> listenableFutureTask = new ListenableFutureTask<>(() -> {
      logger.info(String.format(LONG_OPERATION_RUNNING,
                                SleepUtil.SLEEP_TIME_SECONDS, Thread.currentThread().getName()));
      SleepUtil.sleep();
      logger.info(LONG_OPERATION_FINISHED);
      return new Person("John", "Doe");
    });

    listenableFutureTask.addCallback(new ListenableFutureCallback<>() {
      @Override
      public void onSuccess(Person person) {
        logger.info(String.format("Task created person = [%s]", person));
      }

      @Override
      public void onFailure(Throwable ex) {
        logger.info(String.format("Exception thrown by task = [%s]", ex.getMessage()));
      }
    });
    taskExecutor.execute(listenableFutureTask);
    return listenableFutureTask;
  }

  // curl http://localhost:8080/example12B
  @GetMapping("/example12B")
  @ResponseBody
  public CompletableFuture<Integer> example12B() {
    CompletableFuture<Person> completableFuture = CompletableFuture.supplyAsync(() -> {
      logger.info(String.format(LONG_OPERATION_RUNNING,
                                SleepUtil.SLEEP_TIME_SECONDS, Thread.currentThread().getName()));
      SleepUtil.sleep();
      logger.info(LONG_OPERATION_FINISHED);
      return new Person("John", "Doe");
    });

    return completableFuture
            .thenApply(person -> String.format("%s %s", person.getFirstName(), person.getLastName()))
            .thenApply(String::length);
  }

  // curl http://localhost:8080/example12C
  @GetMapping("/example12C")
  @ResponseBody
  public CompletionStage<String> example12C() {
    CompletionStage<Person> completionStage = CompletableFuture.supplyAsync(() -> {
      logger.info(String.format(LONG_OPERATION_RUNNING,
                                SleepUtil.SLEEP_TIME_SECONDS, Thread.currentThread().getName()));
      SleepUtil.sleep();
      logger.info(LONG_OPERATION_FINISHED);
      return new Person("John", "Doe");
    });

    return completionStage
            .thenApply(person -> String.format("%s %s", person.getFirstName(), person.getLastName()))
            .thenApply(String::toUpperCase);
  }
}
