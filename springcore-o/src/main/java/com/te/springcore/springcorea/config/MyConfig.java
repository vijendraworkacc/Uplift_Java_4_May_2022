package com.te.springcore.springcorea.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.te.springcore.springcorea.beans.Address;
import com.te.springcore.springcorea.beans.Employee;

@Configuration
@ComponentScan(basePackages = "com.te.springcore.springcorea")
public class MyConfig {

	@Bean("employee")
	public Employee getEmployeeObj() {
		Employee employee = new Employee();
		employee.setEmployeeName("Name01");
		employee.setEmployeeId(1);
		employee.setEmployeeAge(22);
		return employee;
	}

	@Bean("address")
	public Address getAddressObj() {
		Address address = new Address();
		address.setAddressLine1("Line 1");
		address.setAddressLine2("Line 2");
		return address;
	}
}
