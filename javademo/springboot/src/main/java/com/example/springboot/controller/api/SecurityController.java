package com.example.springboot.controller.api;

import com.example.springboot.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 演示认证和授权
 */
@RestController
@RequestMapping("/v1/security")
public class SecurityController {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping("")
	public String index() {
		return "security page";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "admin page";
	}

	@RequestMapping("/user")
	public String user() {
		return "user";
	}
}
