package com.example.springboot.controller.api;

import com.example.springboot.domain.UserBean;
import com.example.springboot.response.ResponseBuilder;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示全局异常返回统一格式
 */
@RestController
@RequestMapping("/v1/exception")
public class ExceptionController {
	@Autowired
	private UserService userService;

	@RequestMapping("")
	public Object index() {
		UserBean userBean = userService.findByName("cdj");
		return ResponseBuilder.build(200, "ok", userBean);
	}

	@RequestMapping("/crash")
	public Object rush() {
		int a = 10 / 0;
		return "String";
	}

	@RequestMapping("/crash2")
	public Object rush2() {
		List<String> list = new ArrayList<>();
		list.add("item1");
		String last = list.get(2);
		return "String 2";
	}
}
