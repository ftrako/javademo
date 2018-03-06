package com.example.springboot.dao;

import com.example.springboot.domain.UserBean;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
	@Select("select * from jpa_user where username=#{username}")
	UserBean queryByName(String username);

	@Insert("insert into jpa_user values(#{username},#{nickname})")
	int insert(@Param("username") String username, @Param("nickname") String nickname);

	@Update("update jpa_user set nickname=#{nickname} where username=#{username}")
	int update(@Param("username") String username, @Param("nickname") String nickname);
}
