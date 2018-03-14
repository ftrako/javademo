//package com.example.springboot.service;
//
//import com.example.springboot.SpringbootApplication;
//import com.example.springboot.domain.UserBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//@SpringBootTest(classes = SpringbootApplication.class)
//public class TestServiceTest extends AbstractTestNGSpringContextTests {
//	@Autowired
//	private TestService testService;
//	@Autowired
//	private UserService userService;
//
//	@Test
//	public void test() {
//		TestService testService = new TestService();
//		String text = testService.what();
//		System.out.println("test->" + text);
//		Assert.assertEquals(true, true);
//	}
//
//	@Test
//	public void testSpring() {
//		System.out.println("testSpring->" + testService.what());
//	}
//
//	@Test
//	public void testUser() {
//		UserBean userBean = userService.findByName("cdj");
//		Assert.assertEquals(userBean.username, "cdj", "not null");
//	}
//}
