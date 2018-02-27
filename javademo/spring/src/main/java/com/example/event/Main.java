package com.example.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		DemoPublisher publisher = context.getBean(DemoPublisher.class);
		publisher.publish("通知：今天下午3点开会");
		context.close();
	}
}
