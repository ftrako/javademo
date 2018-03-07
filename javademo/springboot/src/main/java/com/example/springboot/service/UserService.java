package com.example.springboot.service;

import com.example.springboot.dao.UserMapper;
import com.example.springboot.domain.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public UserBean findByName(String username) {
		return userMapper.queryByName(username);
	}
}
