package com.example.springboot.controller.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("ApiIndexController")
@RequestMapping("/v1")
public class IndexController {
	@Value("${server.port}")
	private String port;

	@RequestMapping("")
	public String index() {
		return "hello, my springboot, port:" + port;
	}
}
