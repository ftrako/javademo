package com.example.springboot.controller.api;

import com.example.springboot.dao.RedisUserMapper;
import com.example.springboot.domain.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 演示缓存
 */
@RestController
@RequestMapping("/v1/redis")
public class RedisController {

	@Autowired
	private RedisUserMapper userMapper;

	@RequestMapping("")
	public UserBean getUser(String username) {
		if (username == null || username.length() <= 0) {
			return null;
		}
		return userMapper.queryByName(username);
	}

	@RequestMapping("/insert")
	public UserBean insert(String username, String nickname) {
		userMapper.insert(username, nickname);
		UserBean bean = new UserBean();
		bean.username = username;
		bean.nickname = nickname;
		return bean;
	}

	@RequestMapping("/update")
	public UserBean update(String username, String nickname) {
		userMapper.update(username, nickname);
		UserBean bean = new UserBean();
		bean.username = username;
		bean.nickname = nickname;
		return bean;
	}

	@RequestMapping("/testtran")
	@Transactional
	public String testTran(String username, String nickname) {
		update("cdj", nickname);
		insert(username, nickname); // 如过该执行失败，则update也会回滚
		return "ok";
	}
}
