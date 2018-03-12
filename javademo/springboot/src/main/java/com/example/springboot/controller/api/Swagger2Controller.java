package com.example.springboot.controller.api;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("ApiSwagger2Controller")
@RequestMapping("/v1/swagger2")
public class Swagger2Controller {
	@RequestMapping("")
	@ApiOperation(value = "测试接口2", notes = "备注说明2")
	public String index() {
		return "swagger2";
	}

	@RequestMapping("/api2")
	@ApiOperation(value = "测试接口2_2", notes = "备注说明2_2")
	public String api2() {
		return "api2";
	}
}
