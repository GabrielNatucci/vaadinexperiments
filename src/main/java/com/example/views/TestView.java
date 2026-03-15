package com.example.views;

import com.example.views.event.NatucciEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("test")
public class TestView extends VerticalLayout {
    public TestView() {
        Header header = new Header();
        header.getStyle().set("display", "flex");
        header.getStyle().set("align-items", "center");
        header.getStyle().set("justify-content", "space-between");
        header.getStyle().set("width", "100%");
        header.getStyle().set("padding", "20px");
        header.getStyle().set("background", "linear-gradient(90deg, #ff8a00, #e52e71)");
        header.getStyle().set("color", "white");
        header.getStyle().set("border-radius", "10px");
        header.getStyle().set("box-shadow", "0 4px 15px rgba(0,0,0,0.2)");

        H2 title = new H2("✨ Universo Radiante ✨");
        title.getStyle().set("margin", "0");
        title.getStyle().set("font-family", "cursive, sans-serif");
        title.getStyle().set("text-shadow", "2px 2px 4px rgba(0,0,0,0.3)");

        Span subtitle = new Span("Beleza, Harmonia e Inspiração Infinita");
        subtitle.getStyle().set("font-style", "italic");
        subtitle.getStyle().set("font-size", "1.2em");
        subtitle.getStyle().set("font-weight", "300");

        VerticalLayout titleLayout = new VerticalLayout(title, subtitle);
        titleLayout.setSpacing(false);
        titleLayout.setPadding(false);
        titleLayout.getStyle().set("width", "auto");

        Span rightText = new Span("🌟 Sonhe, Acredite, Realize 🌟");
        rightText.getStyle().set("font-weight", "bold");
        rightText.getStyle().set("font-size", "1.3em");
        rightText.getStyle().set("margin-right", "20px");

        header.add(titleLayout, rightText);
        add(header);

        H1 greetings = new H1("Seja bem vindo!");
        add(greetings);

        var button = new Button("clique em mim");
        button.addClickListener(new NatucciEventListener());

        var nameField = new TextField("Qual o seu nome?");
        add(nameField);

        add(new Button("Gratitudes",
                event -> greetings.setText("Seja bem vindo, %s!"
                        .formatted(nameField.getValue()))));

        add(new Button("Gratitudes",
                event -> greetings.setText("Seja bem vindo, %s!"
                        .formatted(nameField.getValue()))));

        add(new Button("Gratitudes",
                event -> greetings.setText("Seja bem vindo, %s!"
                        .formatted(nameField.getValue()))));

        add(new Button("Gratitudes",
                event -> greetings.setText("Seja bem vindo, %s!"
                        .formatted(nameField.getValue()))));
    }
}
