package com.vaadin.application.form.deployments.web;

import com.vaadin.application.form.shell.ApplicationFormShellConfig;
import com.vaadin.shared.spring.support.router.RegisterRoutes;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

/**
 * Main entry point into the Compus Application Form web app.
 */
@SpringBootApplication
@Import({
        ApplicationFormShellConfig.class
})
public class ApplicationForm {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationForm.class).run(args);
    }
}
