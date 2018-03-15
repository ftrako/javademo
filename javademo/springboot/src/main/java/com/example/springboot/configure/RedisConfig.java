package com.example.springboot.configure;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport{
	// 定制缓存配置
	@Bean
	public CacheManager cacheManager(RedisTemplate redisTemplate) {
		RedisCacheManager cacheManager= new RedisCacheManager(redisTemplate);
		cacheManager.setDefaultExpiration(10); // 默认过期时间，单位秒
		Map<String,Long> expiresMap=new HashMap<>();
		expiresMap.put("user",5L);  // 指定容器过期时间
		cacheManager.setExpires(expiresMap);
		return cacheManager;
	}
}
