package com.example.springmvc.api;


import com.example.springmvc.UserBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class ApiController {
	@RequestMapping(value = "")//, produces = "application/json;charset=UTF-8")
	public UserBean hello() {
		return query(null);
	}

	@RequestMapping(value = "/hello")
	public String sayHello() {
		int a = 10 / 0;
		return "sayhello2";
	}

	@RequestMapping(value = {"/{id}"})
	public UserBean query(@PathVariable String id) {
//		System.out.println("id=" + id);
		UserBean bean = new UserBean();
		bean.id = id;
		bean.name = "姓名";
		return bean;
	}
	@RequestMapping("/fortest")
	public String fortest() {
		return "ok";
	}
}
