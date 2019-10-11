package com.vaadin.application.form.base.ui;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;

@CssImport(value = "./styles/app.css")
public class JustLayout extends Div {

    public JustLayout() {
        add(new Label("Just layout"));
        addClassName("just-layout");
    }
}
