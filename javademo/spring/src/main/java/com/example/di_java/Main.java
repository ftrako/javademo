package com.example.di_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		String text = useFunctionService.sayHello("my di java example");
		System.out.println(text);

		FunctionService functionService1 = context.getBean(FunctionService.class);
		FunctionService functionService2 = useFunctionService.getFunctionService();
		if (functionService1 == functionService2) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

		context.close();
	}
}
