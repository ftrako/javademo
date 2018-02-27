package com.example.thread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		FunctionService functionService = context.getBean(FunctionService.class);
		for (int loop = 0; loop < 20; loop++) {
			functionService.asyncPrint(loop);
			functionService.syncPrint(loop);
		}
		context.close();
	}
}
