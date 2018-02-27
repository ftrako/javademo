package com.example.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	@Conditional(WindowCondition.class)
	public IFunctionService windowsFunctionService() {
		return new WindowsFunctionService();
	}

	@Bean
	@Conditional(LinuxCondition.class)
	public IFunctionService linuxFunctionService() {
		return new LinuxFunctionService();
	}

	@Bean
	@Conditional(MacCondition.class)
	public IFunctionService macFunctionService() {
		return new MacFunctionService();
	}
}
