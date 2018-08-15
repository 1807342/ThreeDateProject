package com.yc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.service.UserService;

@Controller
public class ErrorException {
	private static final Logger logger = LoggerFactory.getLogger(ErrorException.class);
	
	@Autowired
	private UserService userService;
	
	/**
	 * 添加事务，必须要整个方法走完了才会插入数据
	 * @param username
	 * @param age
	 * @return
	 */
	@Transactional
	@ResponseBody
	@RequestMapping("/error.action")
	public String Error(String username,Integer age){
		userService.insertUser(username, age);
		logger.info("Spring集成日志");
		int j=1/age;
		return "success" + j;
	}
	
	
}
