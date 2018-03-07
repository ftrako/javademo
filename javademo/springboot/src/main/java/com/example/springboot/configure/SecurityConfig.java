package com.example.springboot.configure;

import com.example.springboot.service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

/**
 * 认证授权配置
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserAuthService userAuthService;

	/**
	 * 用户认证
	 *
	 * @param auth
	 * @throws Exception
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		super.configure(auth);
		auth.userDetailsService(userAuthService);
	}

	/**
	 * 授权
	 *
	 * @param http
	 * @throws Exception
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		super.configure(http);

//		http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();


		// 授权
		// 示例，admin/路径下需要admin权限
		// ruser/路径下需要user或admin权限才能访问
		http.authorizeRequests()
				.antMatchers("/v1/security/admin/**").hasRole("ADMIN")
				.antMatchers("/v1/security/user/**").hasAnyRole("ADMIN", "USER").and().formLogin();
	}
}
