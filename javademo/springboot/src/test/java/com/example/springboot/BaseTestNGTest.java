package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
//@WebAppConfiguration
@SpringBootTest(classes = SpringbootApplication.class)
@AutoConfigureMockMvc
//@WebMvcTest
public class BaseTestNGTest extends AbstractTestNGSpringContextTests {
	@Autowired
	protected MockMvc mvc;

}
