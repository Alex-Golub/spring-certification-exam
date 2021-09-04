package com.spring.professional.exam.tutorial.module02.question04;

import com.spring.professional.exam.tutorial.module02.question04.ds.Employee;
import org.springframework.stereotype.Component;

@Component
public class SamePackageEmployeeRepository {
  public void saveEmployee(Employee employee) {
  }

  protected void deleteEmployee(long id) {
  }

  void deleteEmployeeByEmail(String email) {
  }

  /**
   * private methods can't be proxied because Spring when extends this class must override
   * all the methods to inject aspects and if method is not visible thus can't be injected
   * with aspects
   */
  private void deleteEmployeeByPhone(String phone) {
    System.out.println("deleteEmployeeByPhone method called");
  }
}
