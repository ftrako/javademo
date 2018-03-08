package com.example.springboot;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class ApiLoginControllerTest extends SpringbootApplicationTests{
	@Test
	public void test() throws Exception{
		String url = "/v1/login?username=cdj";
		MvcResult ret = mockMvc.perform(MockMvcRequestBuilders.get(url).accept(MediaType.APPLICATION_JSON)).andReturn();
		Assert.assertEquals( "ok", ret.getResponse().getContentAsString());
	}

}
