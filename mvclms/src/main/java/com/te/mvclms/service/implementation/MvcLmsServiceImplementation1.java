package com.te.mvclms.service.implementation;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.te.mvclms.entity.Employee;
import com.te.mvclms.entity.dto.EmployeeDto;
import com.te.mvclms.entity.dto.EmployeeUpdateDto;
import com.te.mvclms.repository.MvcLmsRepository;
import com.te.mvclms.service.MvcLmsService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MvcLmsServiceImplementation1 implements MvcLmsService {

	private final MvcLmsRepository mvcLmsRepository;

	@Override
	public EmployeeDto register(EmployeeDto employeeDto) {

		Employee employee = new Employee();

		/* To convert from EmployeeDto to Employee */
		BeanUtils.copyProperties(employeeDto, employee);

		/* Using repository to save data */
		Employee register = mvcLmsRepository.register(employee);

		/* To convert from Employee to EmployeeDto */
		BeanUtils.copyProperties(register, employeeDto);

		return employeeDto;
	}

	@Override
	public EmployeeDto getEmployeeDetails(int employeeId) {

		/* Using repository to get employee data */
		Employee employee = mvcLmsRepository.findByEmployeeId(employeeId);

		EmployeeDto employeeDto = new EmployeeDto();

		/* To convert from Employee to EmployeeDto */
		BeanUtils.copyProperties(employee, employeeDto);

		return employeeDto;
	}

	@Override
	public EmployeeDto updateEmployeeDetails(int employeeId, EmployeeUpdateDto employeeUpdateDto) {

		/* Using repository to get employee data */
		Employee employee = mvcLmsRepository.findByEmployeeId(employeeId);

		/* Updating employee object received from database! */
		BeanUtils.copyProperties(employeeUpdateDto, employee);

		/* Using repository to save data */
		Employee updatedEmployee = mvcLmsRepository.register(employee);

		/* To convert from Employee to EmployeeDto */
		EmployeeDto employeeDto = new EmployeeDto();
		BeanUtils.copyProperties(updatedEmployee, employeeDto);

		return employeeDto;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		return mvcLmsRepository.delete(employeeId);
	}

}
