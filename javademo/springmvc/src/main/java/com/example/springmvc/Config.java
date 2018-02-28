package com.example.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan("com.example.springmvc")
public class Config extends WebMvcConfigurerAdapter {
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/classes/views/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}

	@Bean
	public Interceptor interceptor() {
		return new Interceptor();
	}

	// 支持文件上传
	@Bean
	public MultipartResolver multipartResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setMaxUploadSize(1000000000);
		return resolver;
	}

	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
		super.configurePathMatch(configurer);
		configurer.setUseSuffixPatternMatch(false); // 不忽略.后面到内容
	}

	// 静态资源
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		super.addResourceHandlers(registry);
		registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
	}

	// 拦截器
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		super.addInterceptors(registry);
		registry.addInterceptor(interceptor());
	}

	// 简单页面跳转
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		super.addViewControllers(registry);

		String[][] pathMapping = {{"/", "/index"},
				{"/index", "/index"},
				{"/upload", "/upload"}};

		for (String[] item : pathMapping) {
			String key = item[0];
			String value = item[1];
			registry.addViewController(key).setViewName(value);
		}
	}
}
