package com.yc.swagger;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 创建Swagger配置类时
 * 通过@Configuration注解,让Spring来加载该类配置
 * @EnableSwagger2:注解来启动Swagger2
 * 再通过@Bean注解的函数创建Docket的bean后
 * @author Administrator
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig{
	//创建多个函数并使用@Bean注解,这样就可以针对不同的Controller创建出各自的API文档
	//这里如果函数上面不配置@Bean,那么Swagger只是启动了，没有创建API信息
	/**
	 * 创建API文档,apiInfo()用来创建该Api的基本信息
	 * 
	 */
	public Docket createRestApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.yc.controller"))
				.build();
	}
	
	/**
	 * 创建API信息
	 * @return
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("项目信息相关内容")
				.description("以下接口是操作用户的相关信息")
				.version("1.0")
				.build();
	}
	
	
	
}
