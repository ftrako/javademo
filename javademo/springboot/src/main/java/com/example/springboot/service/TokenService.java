package com.example.springboot.service;


import com.common.helper.TokenUtil;
import org.springframework.stereotype.Service;

@Service
public class TokenService {
	private static final String SECRET = "abKDD323c";

	public String createToken(String username) {
		return TokenUtil.createToken(username, 20, SECRET);
	}

	public boolean valid(String token) {
		return TokenUtil.valid(token, SECRET);
	}
}
