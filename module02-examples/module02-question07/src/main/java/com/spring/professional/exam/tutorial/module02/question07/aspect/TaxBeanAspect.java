package com.spring.professional.exam.tutorial.module02.question07.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TaxBeanAspect {
  @Before("this(com.spring.professional.exam.tutorial.module02.question07.beans.ITaxBean)")
  public void thisTaxBean1Example1() {
    System.out.println("Before - this(com.spring.professional.exam.tutorial.module02.question07.beans.ITaxBean)");
  }

  @Before("target(com.spring.professional.exam.tutorial.module02.question07.beans.ITaxBean)")
  public void targetTaxBean1Example1() {
    System.out.println("Before - target(com.spring.professional.exam.tutorial.module02.question07.beans.ITaxBean)");
  }

  @Before("this(com.spring.professional.exam.tutorial.module02.question07.beans.TaxBean1)")
  public void thisTaxBean1Example2() {
    System.out.println("Before - this(com.spring.professional.exam.tutorial.module02.question07.beans.TaxBean1)");
  }

  @Before("target(com.spring.professional.exam.tutorial.module02.question07.beans.TaxBean1)")
  public void targetTaxBean1Example2() {
    System.out.println("Before - target(com.spring.professional.exam.tutorial.module02.question07.beans.TaxBean1)");
  }

  @Before("this(com.spring.professional.exam.tutorial.module02.question07.beans.TaxBean2)")
  public void thisTaxBean2Example() {
    System.out.println("Before - this(com.spring.professional.exam.tutorial.module02.question07.beans.TaxBean2)");
  }

  @Before("target(com.spring.professional.exam.tutorial.module02.question07.beans.TaxBean2)")
  public void targetTaxBean2Example() {
    System.out.println("Before - target(com.spring.professional.exam.tutorial.module02.question07.beans.TaxBean2)");
  }
}
