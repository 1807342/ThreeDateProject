package com.yc.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.yc.entity.User;
import com.yc.service.UserService;

@Api(value="/test",tags="测试接口模块")
@Controller
public class FirstSpringBoot {
	
	@Autowired
	private UserService userService;

	@ApiOperation(value="展示首页信息",notes="展示首页信息")
	@GetMapping("/show")
	public Object showInfo(){
		return "helloworld";
	}
	
	@ApiOperation(value="添加用户信息",notes="添加用户信息")
	@ApiImplicitParam(name="user",value="User",required=true,dataType="User")
	@GetMapping("/addUser.action")
	public Object addUser(User user){
		String username ="zz";
		Integer age =11;
		userService.insertUser(username, age);
		return "success";
	}
	
	
	/*@ResponseBody
	@RequestMapping("/firstSpringBoot.action")
	public String toSpringBoot(){
		return "My First SpringBoot Cs";
	}
	*/
	
	
	
}
