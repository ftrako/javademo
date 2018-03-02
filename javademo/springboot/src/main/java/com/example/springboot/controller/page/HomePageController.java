package com.example.springboot.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	@RequestMapping("/homepage")
	public String login() {
		return "homepage";
	}
}
