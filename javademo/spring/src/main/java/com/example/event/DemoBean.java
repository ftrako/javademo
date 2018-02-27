package com.example.event;

import org.springframework.context.ApplicationEvent;

public class DemoBean extends ApplicationEvent {
	public String msg;

	public DemoBean(Object source) {
		super(source);
	}
}
