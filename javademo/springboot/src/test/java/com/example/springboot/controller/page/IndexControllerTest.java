package com.example.springboot.controller.page;

import com.example.springboot.BaseTestNGTest;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.testng.annotations.Test;


public class IndexControllerTest extends BaseTestNGTest {
	@Test
	public void testValid() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders.get(""))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
}
