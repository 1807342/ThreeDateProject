package com.yc.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/*@Getter
@Setter*/
/**
 * @Data = @Getter+@Setter
 * @author Administrator
 *
 */
@Data
//日志注解
@Slf4j
public class User {

	private Integer id;
	private String username;
	private Integer age;
	
	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		User user = new User();
		user.setAge(11);
		user.setUsername("fyh");
		
		System.out.println(user);
		
	}

}
