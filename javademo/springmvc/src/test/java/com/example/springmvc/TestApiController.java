package com.example.springmvc;

import org.junit.Test;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class TestApiController extends TestConfig {
	@Test
	public void testApiController() throws Exception {
		mockMvc.perform(get("/v1/api/fortest"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("ok"));
	}
}
