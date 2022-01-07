package com.spring.professional.exam.tutorial.module05.question10.ds;

import java.io.Serializable;

public class MutableCountHolder implements Serializable {
  private int count;

  public int get() {
    return count;
  }

  public int increment() {
    return ++count;
  }
}
