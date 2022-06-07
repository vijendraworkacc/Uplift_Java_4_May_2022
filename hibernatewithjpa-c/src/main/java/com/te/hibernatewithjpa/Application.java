package com.te.hibernatewithjpa;

import com.te.hibernatewithjpa.a.entity.Employee;
import com.te.hibernatewithjpa.a.entity.SecoundryInfo;
import com.te.hibernatewithjpa.repository.MyRepository;

public class Application {
	public static void main(String[] args) {
		
		MyRepository myRepository = new MyRepository();
		
		SecoundryInfo secoundryInfo = new SecoundryInfo();
		secoundryInfo.setEmployeeAadharNumber("1234567");
		secoundryInfo.setEmployeePanNumber("123456");
		secoundryInfo.setEmployeeFN("qwerty");
		secoundryInfo.setEmployeeMN("qwerty");
		
		Employee employee  = new Employee();
		employee.setEmployeeAge(22);
		employee.setEmployeeName("Name01");
		employee.setEmployeePn(12345L);
		
		employee.setSecoundryInfo(secoundryInfo);
		secoundryInfo.setEmployee(employee);
	
		myRepository.save(employee);
		
	}
}
