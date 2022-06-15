package com.te.learnspringrest.service;

import com.te.learnspringrest.entity.dto.EmployeeDto;

public interface AppService {
	public abstract EmployeeDto getEmployee(int employeeId);

	public abstract EmployeeDto saveEmployee(EmployeeDto employeeDto);

	public abstract EmployeeDto updateEmployee(int employeeId, EmployeeDto employeeDto);

	public abstract boolean deleteEmployee(int employeeId);
}
