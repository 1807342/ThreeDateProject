package com.yc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FtlIndex {

	@RequestMapping("/ftlIndex.action")
	public String ftl(Map<String,String> map){
		map.put("name", "fyh");
		map.put("age", "21");
		map.put("sex", "男");
		
		//默认跳转后缀为 .ftl
		return "FTlIndex";
		
	}
}
