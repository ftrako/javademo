package com.example.prepost;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class FunctionService {

	public FunctionService() {
		System.out.println("FunctionService()");
	}

	@PostConstruct
	public void init2() {
		System.out.println("FunctionService->init()");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("FunctionService->destroy()");
	}
}
