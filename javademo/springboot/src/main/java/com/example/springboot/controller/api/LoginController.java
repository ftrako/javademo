package com.example.springboot.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("ApiLoginController")
@RequestMapping("/v1")
public class LoginController {
	@RequestMapping("/login")
	public String login(@RequestParam("username") String username) {
		return (username != null && username.length() > 0 ? "ok" : "fail");
	}
}
