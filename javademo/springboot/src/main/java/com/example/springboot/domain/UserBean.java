package com.example.springboot.domain;

import java.io.Serializable;

public class UserBean implements Serializable {
	public String username;
	public String password;
	public String nickname;
	public String role;  // admin表示管理员，user表示普通用户
}
