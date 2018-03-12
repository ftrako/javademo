package com.example.springboot.controller.api;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("ApiSwagger1Controller")
@RequestMapping("/v1/swagger1")
public class Swagger1Controller {
	@RequestMapping("")
	@ApiOperation(value = "测试接口1", notes = "备注说明1")
	public String index() {
		return "swagger1";
	}

	@RequestMapping("/api1")
	@ApiOperation(value = "测试接口1_2", notes = "备注说明1_2")
	public String api1() {
		return "api1";
	}
}
