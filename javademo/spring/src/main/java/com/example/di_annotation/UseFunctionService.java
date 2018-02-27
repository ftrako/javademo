package com.example.di_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
	@Autowired
	private FunctionService functionService;

	public String sayHello(String word) {
		return functionService.sayHello(word);
	}
}
