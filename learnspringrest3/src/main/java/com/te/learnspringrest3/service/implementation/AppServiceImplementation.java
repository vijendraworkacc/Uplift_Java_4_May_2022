package com.te.learnspringrest3.service.implementation;

import org.springframework.stereotype.Service;

import com.te.learnspringrest3.entity.dto.EmployeeDto;
import com.te.learnspringrest3.service.AppService;

@Service
public class AppServiceImplementation implements AppService {

	@Override
	public EmployeeDto getEmployee(int employeeId) {
		return null;
	}

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		return null;
	}

}
