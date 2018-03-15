package com.example.springboot.dao;

import com.example.springboot.domain.UserBean;
import org.apache.ibatis.annotations.*;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
@CacheConfig(cacheNames = "user")
public interface RedisUserMapper {
	@Select("select * from jpa_user where username=#{username}")
	@CachePut(key="#p0")
	UserBean queryByName(String username);

	@Insert("insert into jpa_user values(#{username},#{nickname})")
	@Cacheable(key="#p0",sync = true)
	int insert(@Param("username") String username, @Param("nickname") String nickname);

	@CachePut(key="#p0")
	@Update("update jpa_user set nickname=#{nickname} where username=#{username}")
	int update(@Param("username") String username, @Param("nickname") String nickname);
}
