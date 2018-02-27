package com.example.unittest;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestFunctionService extends BaseTestConfig {
	@Autowired
	private FunctionService functionService;

	@Test
	public void testFunction() {
		Assert.assertEquals(true, functionService.test());

	}
}
