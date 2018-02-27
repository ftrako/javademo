package com.example.di_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	@Bean
	@Scope("prototype")
	public FunctionService functionService() {
		return new FunctionService();
	}

	@Bean
	public UseFunctionService useFunctionService() {
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;
	}
}
