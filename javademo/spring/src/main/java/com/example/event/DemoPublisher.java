package com.example.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
	@Autowired
	private ApplicationContext context = null;

	public void publish(String msg) {
		DemoBean bean = new DemoBean(this);
		bean.msg = msg;
		context.publishEvent(bean);
	}
}
