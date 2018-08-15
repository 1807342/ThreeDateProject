package com.yc.errorException;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局捕获异常
 * 
 * 应用场景:将全局捕获异常加入到日志中,时刻监视项目的变化
 * @author Administrator
 *
 */
@ControllerAdvice(basePackages="com.yc.controller")
public class ErrorCatchException {
	
	/**
	 * 返回的json数据(方法一)
	 * 使用ModeAndView返回一个页面报异常(方法二)
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(RuntimeException.class)
	public Map<String,Object> runExce(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("errorCode", 500);
		map.put("errorMsg", "系统错误");
		return map;
	}
	
}
