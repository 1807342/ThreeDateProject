package com.yc.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.service.MemberService;

@Controller
@Slf4j
public class MemberControl {

	@Autowired
	private MemberService memberService;
	
	@Value("${name}")
	private String name;
	
	@Value("${http_url}")
	private String Evironment;
	
	@ResponseBody
	@RequestMapping("/sendMember.action")
	public String sendMemberTo(){
		log.info("1");
		String result = memberService.sendMemberIn();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("4");
		
		return result;
	}
	
	@ResponseBody
	@RequestMapping("/getName.action")
	public String getName(){
		return name;
	}
	
	
	@ResponseBody
	@RequestMapping("/getEvironment.action")
	public String getEvironment(){
		return Evironment;
	}
}
