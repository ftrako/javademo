package com.example.springmvc;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * 异常捕捉统一处理
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {
	@ExceptionHandler(value = Exception.class)
	public ModelAndView exception(Exception exception, WebRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		FastJsonJsonView view = new FastJsonJsonView();
		Map<String, Object> attr = new HashMap<String, Object>();
		attr.put("code", "100001");
		attr.put("msg", exception.getMessage());
		view.setAttributesMap(attr);
		modelAndView.setView(view);
		System.out.println("catch new exception..............");
		return modelAndView;
	}
}
