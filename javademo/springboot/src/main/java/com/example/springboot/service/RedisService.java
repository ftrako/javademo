package com.example.springboot.service;

import com.example.springboot.dao.RedisUserMapper;
import com.example.springboot.domain.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedisService {
	@Autowired
	private RedisUserMapper userMapper;

	public UserBean findByName(String username) {
		return userMapper.queryByName(username);
	}

	public int update(String name, String nickname) {
		return userMapper.update(name, nickname);
	}
}
