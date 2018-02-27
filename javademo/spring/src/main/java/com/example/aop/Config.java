package com.example.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {
	@Bean
	public DemoAnnotationService demoAnnotationService() {
		return new DemoAnnotationService();
	}

	@Bean
	DemoMethodService demoMethodService() {
		return new DemoMethodService();
	}

	@Bean
	LogAspect logAspect() {
		return new LogAspect();
	}
}
