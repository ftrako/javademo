package com.example.springboot.controller.api;

import com.example.springboot.dao.UserMapper;
import com.example.springboot.domain.UserBean;
import com.example.springboot.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 演示Token认证
 */
@RestController
@RequestMapping("/v1/token")
public class TokenController {

	@Autowired
	private TokenService tokenService;

	@RequestMapping("")
	public String getToken(String username) {
		if (username == null || username.length() <= 0) {
			return null;
		}

		String token = tokenService.createToken(username);
		tokenService.valid(token);
		return token;
	}

	@RequestMapping("/valid")
	public boolean valid(String token) {
		return tokenService.valid(token);
	}
}
