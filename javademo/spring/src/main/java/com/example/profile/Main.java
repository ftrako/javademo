package com.example.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("release");
		context.register(Config.class);
		context.refresh();

		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println("type=" + demoBean.name);
		context.close();
	}
}
