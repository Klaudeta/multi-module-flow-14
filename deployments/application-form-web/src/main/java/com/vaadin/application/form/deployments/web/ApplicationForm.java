package com.vaadin.application.form.deployments.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

/**
 * Main entry point into the Compus Application Form web app.
 */
@SpringBootApplication
public class ApplicationForm {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationForm.class).run(args);
    }
}
