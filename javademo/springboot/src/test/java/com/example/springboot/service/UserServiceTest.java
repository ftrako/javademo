package com.example.springboot.service;

import com.example.springboot.BaseTestNGTest;
import com.example.springboot.domain.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;


public class UserServiceTest extends BaseTestNGTest {
	@Autowired
	private UserService userService;

	@Test
	public void findByName() {
		UserBean userBean = userService.findByName("cdj");
		Assert.assertEquals(userBean.username, "cdj", "not null");
	}
}
