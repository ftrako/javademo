package com.example.unittest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestFunction2Service extends BaseTestConfig {
	@Autowired
	private Function2Service function2Service;

	@Test
	public void testFunctionService() {
		assert (function2Service.getResult() == 1);
	}
}
