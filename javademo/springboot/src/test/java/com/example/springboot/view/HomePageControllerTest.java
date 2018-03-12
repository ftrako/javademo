package com.example.springboot.view;

import com.example.springboot.BaseTest;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

/**
 * 测试html页面
 * 要求：测试之前服务器已启动
 */
public class HomePageControllerTest extends BaseTest {
	@Test
	public void testPage() {
		ResponseEntity<String> resp = restTemplate.getForEntity("http://192.168.191.4:8080/homepage", String.class);
		System.out.println("status=" + resp.getStatusCode());
		System.out.println("body=" + resp.getBody());
	}
}
