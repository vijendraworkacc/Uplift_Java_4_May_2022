package com.te.mvclms.service;

import com.te.mvclms.entity.dto.EmployeeDto;
import com.te.mvclms.entity.dto.EmployeeUpdateDto;

public interface MvcLmsService {
	public abstract EmployeeDto register(EmployeeDto employeeDto);
	
	public abstract EmployeeDto getEmployeeDetails(int employeeId);

	public abstract EmployeeDto updateEmployeeDetails(int employeeId, EmployeeUpdateDto employeeDto);

	public abstract boolean deleteEmployee(int employeeId);

}
