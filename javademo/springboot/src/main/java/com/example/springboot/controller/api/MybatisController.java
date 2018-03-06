package com.example.springboot.controller.api;

import com.alibaba.fastjson.JSON;
import com.example.springboot.dao.UserMapper;
import com.example.springboot.domain.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MybatisController {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/mybatis")
//	public UserBean getUser(@RequestParam("username") String username) {  // 表示username必须传
	public String getUser(String username) {
		if (username == null || username.length() <= 0) {
			return "invalid username param";
		}
		UserBean bean = userMapper.queryByName(username);
		String json = JSON.toJSONString(bean);
		return json;
	}
}
