package com.shsxt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.bean.UserService;

public class Apptest {
	
	public static void main(String[] args) {
		
		ApplicationContext atContext = new ClassPathXmlApplicationContext("spring-context.xml");
		UserService bean = atContext.getBean(UserService.class);
		bean.print();
		
	}
}
