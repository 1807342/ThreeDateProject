package com.yc.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import com.yc.entity.User;

/**
 * 整合的时候,mapper层有两种方式加载
 * 1,
 * 	  在java运行程序中@MapperScan(basePackages={"com.yc.*"})不用再Mapper中注解
 * 2,
 *   在mapper类中配置@Mapper,不需要在java运行程序中配置@MapperScan
 * @author Administrator
 *
 */
/*@Mapper*/
public interface UserMapper {

	//查询语句
	@Select("select * from user where username=#{username}")
	User findByName(@Param("username") String username);
	
	//添加
	@Insert("insert into user(username,age) values(#{username},#{age})")
	int insert(@Param("username")String username,@Param("age") Integer age);
}
