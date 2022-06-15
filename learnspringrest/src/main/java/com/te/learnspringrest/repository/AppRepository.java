package com.te.learnspringrest.repository;

import com.te.learnspringrest.entity.Employee;

public interface AppRepository {
	public abstract Employee getEmployee(int employeeId);

	public abstract Employee saveEmployee(Employee employee);

	public abstract boolean deleteEmployee(int employeeId);
}
