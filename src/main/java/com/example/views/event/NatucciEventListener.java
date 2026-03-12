package com.example.views.event;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

public class NatucciEventListener implements ComponentEventListener<ClickEvent<Button>>{
	@Override
	public void onComponentEvent(ClickEvent<Button> event) {
        System.out.println("event listener poha!");
	}
}
