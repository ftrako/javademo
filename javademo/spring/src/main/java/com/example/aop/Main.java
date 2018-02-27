package com.example.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		DemoAnnotationService annotationService = context.getBean(DemoAnnotationService.class);
		DemoMethodService methodService = context.getBean(DemoMethodService.class);
		annotationService.add();
		methodService.add();
		context.close();
	}
}
