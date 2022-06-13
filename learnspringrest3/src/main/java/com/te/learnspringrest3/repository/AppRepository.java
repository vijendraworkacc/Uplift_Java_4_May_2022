package com.te.learnspringrest3.repository;

import com.te.learnspringrest3.entity.Employee;

public interface AppRepository {
	
	public abstract Employee getEmployee(int employeeId);

	public abstract Employee saveEmployee(Employee employee);
}
