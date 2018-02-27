package com.example.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {
	@Bean
	@Profile("debug")
	public DemoBean debugBean() {
		DemoBean bean = new DemoBean();
		bean.name = "debug";
		return bean;
	}

	@Bean
	@Profile("release")
	public DemoBean releaseBean() {
		DemoBean bean = new DemoBean();
		bean.name = "release";
		return bean;
	}
}
