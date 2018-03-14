package com.example.springboot.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 演示error页面定制
 */
@Controller
public class ErrorController {
	@RequestMapping("/400")
	public String badRequest() {
		return "error/error400";
	}

	@RequestMapping("/404")
	public String notFound() {
		return "error/error404";
	}

	@RequestMapping("/500")
	public String serverError() {
		return "error/error500";
	}
}
