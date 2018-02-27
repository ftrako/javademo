package com.example.aop;

public class DemoAnnotationService {
	@Action(name = "DemoAnnotationService->add()")
	public void add() {
		System.out.println("DemoAnnotationService->add()");
	}
}
