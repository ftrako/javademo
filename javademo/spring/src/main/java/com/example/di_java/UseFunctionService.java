package com.example.di_java;

public class UseFunctionService {
	private FunctionService functionService;

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}

	public FunctionService getFunctionService() {
		return this.functionService;
	}

	public String sayHello(String word) {
		return functionService.sayHello(word);
	}
}
