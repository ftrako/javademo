package com.example.springboot.controller.api;

import com.example.springboot.dao.UserMapper;
import com.example.springboot.domain.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 演示缓存
 */
@RestController
@RequestMapping("/v1/cache")
public class CacheController {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping("")
	@Cacheable(value = "cachename", key = "#username")
//	public UserBean getUser(@RequestParam("username") String username) {  // 表示username必须传
	public UserBean getUser(String username) {
		if (username == null || username.length() <= 0) {
			return null;
		}
		return userMapper.queryByName(username);
	}

	@RequestMapping("/insert")
	@CachePut(value = "cachename", key = "#username")
	public UserBean insert(String username, String nickname) {
		userMapper.insert(username, nickname);
		UserBean bean = new UserBean();
		bean.username = username;
		bean.nickname = nickname;
		return bean;
	}

	@RequestMapping("/update")
	@CachePut(value = "cachename", key = "#username")
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
