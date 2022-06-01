package com.te.springcore.springcorea;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.springcorea.beans.Employee;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-config.xml");
		applicationContext.registerShutdownHook();
		Employee bean1 = applicationContext.getBean("emp01", Employee.class);
		System.out.println(bean1);
		// applicationContext.close();
	}
}
