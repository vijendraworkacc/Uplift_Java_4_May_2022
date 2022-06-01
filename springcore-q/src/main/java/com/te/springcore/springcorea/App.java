package com.te.springcore.springcorea;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcore.springcorea.beans.Employee;
import com.te.springcore.springcorea.config.MyConfig;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Employee bean1 = applicationContext.getBean("employee", Employee.class);
		Employee bean2 = applicationContext.getBean("employee", Employee.class);
		Employee bean3 = applicationContext.getBean("employee", Employee.class);
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean3);
	}
}
