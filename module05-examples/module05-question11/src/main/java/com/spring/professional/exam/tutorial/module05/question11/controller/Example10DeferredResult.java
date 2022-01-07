package com.spring.professional.exam.tutorial.module05.question11.controller;

import com.spring.professional.exam.tutorial.module05.question11.ds.Person;
import com.spring.professional.exam.tutorial.module05.question11.utils.SleepUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

@Controller
public class Example10DeferredResult {

  private final Logger logger = LoggerFactory.getLogger(Example10DeferredResult.class);
  @Autowired
  private TaskExecutor taskExecutor;

  // curl http://localhost:8080/example10A
  @GetMapping("/example10A")
  @ResponseBody
  public DeferredResult<Person> example10A() {
    DeferredResult<Person> deferredResult = new DeferredResult<>();

    taskExecutor.execute(() -> {
      logger.info(String.format("Sleeping for %d seconds before giving back results...",
                                SleepUtil.SLEEP_TIME_SECONDS));
      SleepUtil.sleep();
      logger.info("Finished sleeping, giving back results...");
      deferredResult.setResult(new Person("John", "Doe"));
    });

    return deferredResult;
  }
}
