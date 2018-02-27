package com.example.di_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		String text = useFunctionService.sayHello("my di annotation example");
		System.out.println(text);
		context.close();
	}
}
