package com.vaadin.application.form.deployments.web;

import com.vaadin.application.form.base.ui.JustLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends Div {

    public MainView() {
        add(new JustLayout());
    }
}
