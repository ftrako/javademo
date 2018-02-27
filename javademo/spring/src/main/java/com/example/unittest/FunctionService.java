package com.example.unittest;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
	public boolean test() {
		boolean ret = true;
		System.out.println("unit test " + ret);
		return ret;
	}
}
