package com.yc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * JSP整合SpringBoot
 * @author Administrator
 *
 */
@Controller
public class JspController {

	@RequestMapping("/jspIdex.action")
	public String indexJsp(){
		return "index";
	}
}
