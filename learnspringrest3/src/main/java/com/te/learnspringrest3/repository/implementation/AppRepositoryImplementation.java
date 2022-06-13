package com.te.learnspringrest3.repository.implementation;

import org.springframework.stereotype.Repository;

import com.te.learnspringrest3.entity.Employee;
import com.te.learnspringrest3.repository.AppRepository;

@Repository
public class AppRepositoryImplementation implements AppRepository {

	@Override
	public Employee getEmployee(int employeeId) {
		return null;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return null;
	}

}
