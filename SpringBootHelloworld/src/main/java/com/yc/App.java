package com.yc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 封装 配置相关的注解与配置代码
 * 装配方法1：@EnableAutoConfiguration: 自动装配 
 * 				默认扫包范围:当前类里面
 * 装配方法2:@EnableAutoConfiguration
 *		   @ComponentScan("com.yc")
 *		扫描指定包下的所有类
 * 装配方法3:@SpringBootApplication
 * 		扫描当前包和同级子包
 * 		  缺点:对性能的优化并不好
 *
 */
/*@EnableAutoConfiguration
@ComponentScan("com.yc")*/
/*@EnableAutoConfiguration
@ComponentScan(basePackages={"com.yc.controller","com.yc.order"})*/
@EnableAsync //支持异步
@SpringBootApplication
//Mapper调用注解
@MapperScan(basePackages={ "com.yc.mapper" })
public class App {
	/**
	 * 整个程序的入口,启动SpringBoot内置的Tomcat默认服务器,使用tomcat加载SpringMVC  注解启动类
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
