package com.yc.order;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Order {
	
	@ResponseBody
	@RequestMapping("/order.action")
	public String getOrder(){
		return "welcome order springboot";
	}
}
