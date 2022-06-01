package com.te.springcore.springcorea;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.springcorea.beans.Employee;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-config.xml");
		Employee bean1 = applicationContext.getBean("emp01", Employee.class);
		System.out.println(bean1);
	}
}
