package com.example.springboot.dao;

import com.example.springboot.domain.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
	@Select("select * from jpa_user where username=#{username}")
	UserBean queryByName(String username);
}
