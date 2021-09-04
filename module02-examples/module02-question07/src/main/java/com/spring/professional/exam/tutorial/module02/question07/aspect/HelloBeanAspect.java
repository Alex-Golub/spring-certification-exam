package com.spring.professional.exam.tutorial.module02.question07.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelloBeanAspect {
//  @Before("@args(com.spring.professional.exam.tutorial.module02.question07.annotation.CustomValidation)")
//  public void argsAnnotationExample() {
//    System.out.println("Before - @args(com.spring.professional.exam.tutorial.module02.question07.annotation.CustomValidation)");
//  }

//  @Before("@annotation(com.spring.professional.exam.tutorial.module02.question07.annotation.CustomTransaction)")
//  public void annotationExample() {
//    System.out.println("Before - @annotation(com.spring.professional.exam.tutorial.module02.question07.annotation.CustomTransaction)");
//  }

//  @Before("bean(hello_child_bean)")
//  public void beanExample1() {
//    System.out.println("Before - bean(hello_child_bean)");
//  }
//
//  @Before("bean(hello_*_bean)")
//  public void beanExample2() {
//    System.out.println("Before - bean(hello_*_bean)");
//  }

//  /* [visibility] ![return type] [all sub-packages].[class].[partial method name]([args with 2nd wildcard]) */
//  @Before("execution(public !int com..HelloBean.say*(String, *))")
//  public void executionExample() {
//    System.out.println("Before - execution(public !int com..HelloBean.say*(String, *))");
//  }
//
//  /* [return type] [all sub-packages].[class name].[full method name]([zero or more params]) [exception] */
//  @After("execution(void com..HelloChildBean.validateName(..) throws java.io.IOException)")
//  public void executionWithExceptionExample() {
//    System.out.println("After - execution(void com..HelloChildBean.validateName(..) throws java.io.IOException)");
//  }

//  @Before("within(com..HelloChildBean)")
//  public void withinExample1() {
//    System.out.println("Before - within(com..HelloChildBean)");
//  }
//
//  @Before("within(com..*)")
//  public void withinExample2() {
//    System.out.println("Before - within(com..*)");
//  }
//
//  @Before("within(com..Hello*Bean)")
//  public void withinExample3() {
//    System.out.println("Before - within(com..Hello*Bean)");
//  }

//  @Before("args(..)")
//  public void argsExample1() {
//    System.out.println("Before - args(..)");
//  }
//
//  @Before("args(String, int)")
//  public void argsExample2() {
//    System.out.println("Before - args(String, int)");
//  }
//
//  @Before("args(String, *)")
//  public void argsExample3() {
//    System.out.println("Before - args(String, *)");
//  }
//
//  @Before("args(java.lang.String)")
//  public void argsExample4() {
//    System.out.println("Before - args(java.lang.String)");
//  }
}
