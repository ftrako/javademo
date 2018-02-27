package com.example.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

//		FunctionService functionService = context.getBean(FunctionService.class);
//		functionService.printCurrentTime();
//		context.close();
	}
}
