package com.yc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexSpringBoot {
	
	@ResponseBody
	@RequestMapping("/index.action")
	public String index(){
		return "welcome index SpringBoot";
	}
}
