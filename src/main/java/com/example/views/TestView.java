package com.example.views;

import com.example.views.event.NatucciEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("test")
public class TestView extends VerticalLayout {
    public TestView() {
        H1 greetings = new H1("Seja bem vindo!");
        add(greetings);

        var button = new Button("clique em mim");
        button.addClickListener(new NatucciEventListener());

        var nameField = new TextField("Qual o seu nome?");
        add(nameField);

        add(new Button("Gratitudes",
                event -> greetings.setText("Seja bem vindo, %s!"
                        .formatted(nameField.getValue()))));
    }
}
