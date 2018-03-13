package com.example.springboot.handler;

import com.example.springboot.response.ResponseBuilder;
import com.example.springboot.response.ResponseData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ResponseData jsonErrHandler(HttpServletRequest req, Exception e) throws Exception {
		return ResponseBuilder.build(201, e.getMessage(), null);
	}
}
