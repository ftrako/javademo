package com.example.springmvc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
@WebAppConfiguration("src/main/resources") // 默认是src/main/webapp
public class TestConfig {
	protected MockMvc mockMvc = null;

	@Autowired
	protected WebApplicationContext context = null;

	@Autowired
	protected MockHttpSession mockHttpSession;

	@Autowired
	protected MockHttpServletRequest request;

	@Before
	public void init() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void test() { // 仅用于解决编译失败问题

	}
}
