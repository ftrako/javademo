package com.example.springboot.service;

import com.common.helper.Tool;
import com.example.springboot.SpringbootApplication;
import com.example.springboot.domain.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;


@SpringBootTest(classes = SpringbootApplication.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public class UserServiceTest extends AbstractTransactionalTestNGSpringContextTests {
	@Autowired
	private UserService userService;

	@Test
	public void findByName() {
		UserBean userBean = userService.findByName("cdj");
		assert (userBean != null);
		assert (!Tool.isEmpty(userBean.username));
	}
}
