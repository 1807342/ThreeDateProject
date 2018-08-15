package com.yc.service;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.mapper.UserMapper;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public int insertUser(String username,Integer age){
		Integer result = userMapper.insert(username, age);
		
		log.info("#################user{}############",result);
		return result;
	}
	
}
