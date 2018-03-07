package com.example.springboot.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class AuthUserBean implements UserDetails {
	private String username;
	private String password;
	private Collection<GrantedAuthority> auths = new ArrayList<>();

	public AuthUserBean(String username, String password, Collection<GrantedAuthority> auths) {
		this.username = username;
		this.password = password;
		if (auths != null) {
			this.auths.addAll(auths);
		}
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return auths;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
