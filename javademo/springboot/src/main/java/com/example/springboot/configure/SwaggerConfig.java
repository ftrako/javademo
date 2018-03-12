package com.example.springboot.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket grp1() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("grp1")
				.genericModelSubstitutes(DeferredResult.class)
				.useDefaultResponseMessages(false)
				.forCodeGeneration(true)
				.pathMapping("/")
				.select()
				.paths(or(regex("/v1/swagger1[a-zA-Z0-9_/]*")))//过滤的接口
				.build()
				.apiInfo(apiInfo());
	}

	@Bean
	public Docket grp2() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("grp2")
				.genericModelSubstitutes(DeferredResult.class)
				.useDefaultResponseMessages(false)
				.forCodeGeneration(true)
				.pathMapping("/")
				.select()
				.paths(or(regex("/v1/swagger2[a-zA-Z0-9_/]*")))//过滤的接口
				.build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo("接口文档", // 大标题
				"仅供测试", // 小标题
				"0.1", // 版本
				"",
				"chendajian", // 作者
				"none", // 连接显示的文字
				"none"); // 网站
	}
}
