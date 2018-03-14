package com.example.springboot.controller.api;

import com.example.springboot.BaseTestNGTest;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.testng.annotations.Test;

public class IndexControllerTest extends BaseTestNGTest {
	@Test
	public void test() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders.get("/v1"))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

}
