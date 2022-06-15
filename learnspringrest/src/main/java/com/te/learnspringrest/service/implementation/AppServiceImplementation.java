package com.te.learnspringrest.service.implementation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.learnspringrest.entity.Employee;
import com.te.learnspringrest.entity.dto.EmployeeDto;
import com.te.learnspringrest.repository.AppRepository;
import com.te.learnspringrest.service.AppService;

@Service
public class AppServiceImplementation implements AppService {

	@Autowired
	private AppRepository appRepository;

	@Override
	public EmployeeDto getEmployee(int employeeId) {
		EmployeeDto employeeDto = new EmployeeDto();
		BeanUtils.copyProperties(appRepository.getEmployee(employeeId), employeeDto);
		return employeeDto;
	}

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		Employee employee = new Employee();
		BeanUtils.copyProperties(employeeDto, employee);
		employee = appRepository.saveEmployee(employee);
		BeanUtils.copyProperties(employee, employeeDto);
		return employeeDto;
	}

	@Override
	public EmployeeDto updateEmployee(int employeeId, EmployeeDto employeeDto) {
		Employee employee = appRepository.getEmployee(employeeId);
		BeanUtils.copyProperties(employeeDto, employee);
		employee = appRepository.saveEmployee(employee);
		BeanUtils.copyProperties(employee, employeeDto);
		return employeeDto;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		return appRepository.deleteEmployee(employeeId);
	}

}
