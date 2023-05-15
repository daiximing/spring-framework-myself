package com.ddup;

import com.ddup.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Dai Ximing
 * @create 2023-05-09 16:59
 */
public class TestDemo {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) applicationContext.getBean("user");
		System.out.println("user = " + user);
		System.out.println("aaa");
	}
}
