package com.spring.professional.exam.tutorial.module02.question01.with.aop.actions;

import com.spring.professional.exam.tutorial.module02.question01.with.aop.bls.ComplexReportFormatter;
import com.spring.professional.exam.tutorial.module02.question01.with.aop.bls.ComplexReportProvider;
import com.spring.professional.exam.tutorial.module02.question01.with.aop.bls.ComplexReportRepository;
import com.spring.professional.exam.tutorial.module02.question01.with.aop.ds.FormattedReport;
import com.spring.professional.exam.tutorial.module02.question01.with.aop.ds.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComplexReportAction {

  @Autowired
  private ComplexReportProvider complexReportProvider;
  @Autowired
  private ComplexReportFormatter complexReportFormatter;
  @Autowired
  private ComplexReportRepository complexReportRepository;

  /**
   * Each method execution like getReport(), formatReport(Report), save(FormattedReport)
   * is called PointCut where we can insert a cross-cutting-concern i.e. code that can be
   * executed before/after the PointCut is actually executed
   */
  public void perform() throws InterruptedException {
    Report report = complexReportProvider.getReport();
    FormattedReport formattedReport = complexReportFormatter.formatReport(report);
    complexReportRepository.save(formattedReport);

    report = complexReportProvider.getReport();
  }
}
