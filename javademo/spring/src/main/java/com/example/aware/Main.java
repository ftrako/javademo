package com.example.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		FunctionService functionService = context.getBean(FunctionService.class);
		functionService.printTextFile("classpath:com/example/aware/test.txt");
		context.close();
	}
}
