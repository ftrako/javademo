package com.example.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		IFunctionService functionService = context.getBean(IFunctionService.class);
		System.out.println(functionService.listCmd());
		context.close();
	}
}
