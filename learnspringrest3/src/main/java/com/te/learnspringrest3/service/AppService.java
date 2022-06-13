package com.te.learnspringrest3.service;

import com.te.learnspringrest3.entity.dto.EmployeeDto;

public interface AppService {

	public abstract EmployeeDto getEmployee(int employeeId);
	
	public abstract EmployeeDto saveEmployee(EmployeeDto employeeDto);
}
