package com.yc.service;

import lombok.extern.slf4j.Slf4j;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@Slf4j
public class MemberService {
	@Async  //异步，使用Aop运行的时候单独创一个线程用来执行
	public String sendMemberIn(){
		/*log.info("2");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		log.info("3");
		
		return "resultMember";*/
		
		//相当于加一个线程单独运行
		new Thread(new Runnable(){

			@Override
			public void run() {
				log.info("2");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}		
				log.info("3");
			}
			
		}).start();
		return "resultMember";
	}
}
