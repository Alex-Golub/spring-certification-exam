package com.spring.professional.exam.tutorial.module03.question03.template.design.pattern.report;

import java.nio.file.Path;

/**
 * AbstractReport give the outline of how report should behave
 * each report will tell how it is doing the following:
 * appendHeader, appendText and appendFooter
 */
abstract class AbstractReport {
    public void generateReport(Path file, String text) {
        openFile(file);

        appendHeader();
        appendText(text);
        appendFooter();

        closeFile();
    }

    private void openFile(Path file) {
        System.out.println("Opening File " + file.toFile().getName());
    }


    abstract void appendHeader();
    abstract void appendText(String text);
    abstract void appendFooter();

    private void closeFile() {
        System.out.println("Closing File");
    }
}
