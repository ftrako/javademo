package com.example.springboot.service;

import com.example.springboot.domain.AuthUserBean;
import com.example.springboot.domain.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserAuthService implements UserDetailsService {
	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		UserBean userBean = userService.findByName(s);
		if (userBean == null) {
			throw new UsernameNotFoundException("用户不存在");
		}

		// 确认角色
		List<GrantedAuthority> authorityList = new ArrayList<>();
		if (userBean.role != null) {
			authorityList.add(new SimpleGrantedAuthority(userBean.role.toUpperCase()));
		}
		return new AuthUserBean(userBean.username, userBean.password, authorityList);
	}
}
