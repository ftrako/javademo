package com.example.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		FunctionService functionService = context.getBean(FunctionService.class);
		context.close();
	}
}
