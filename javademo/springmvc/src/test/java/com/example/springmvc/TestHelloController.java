package com.example.springmvc;

import org.junit.Test;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class TestHelloController extends TestConfig {
	@Test
	public void testApiController() throws Exception {
		mockMvc.perform(get("/helloindex"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.forwardedUrl("/WEB-INF/classes/views/index.jsp"));
	}
}
