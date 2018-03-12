package com.example.springboot.controller.api;

import com.alibaba.fastjson.JSON;
import com.common.helper.Tool;
import com.example.springboot.dao.UserMapper;
import com.example.springboot.domain.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 演示mybatis的使用
 */
@RestController
@RequestMapping("/v1/mybatis")
public class MybatisController {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping("")
//	public UserBean getUser(@RequestParam("username") String username) {  // 表示username必须传
	public String getUser(String username) {
		if (Tool.isEmpty(username)) {
			return "invalid username param";
		}
		UserBean bean = userMapper.queryByName(username);
		String json = JSON.toJSONString(bean);
		return json;
	}

	@RequestMapping("/insert")
	public int insert(String username, String nickname) {
		return userMapper.insert(username, nickname);
	}

	@RequestMapping("/update")
	public int update(String username, String nickname) {
		return userMapper.update(username, nickname);
	}

	@RequestMapping("/testtran")
	@Transactional
	public String testTran(String username, String nickname) {
		update("cdj", nickname);
		insert(username, nickname); // 如过该执行失败，则update也会回滚
		return "ok";
	}
}
