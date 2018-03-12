package com.example.springboot.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("ApiEnvironmentController")
@RequestMapping("/v1/enviroment")
public class EnvironmentController {
	@Autowired
	private Environment env;

	@RequestMapping("")
	public String index() {
		return env.toString();
	}
}
