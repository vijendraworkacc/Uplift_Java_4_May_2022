package com.te.springmvc.service.implementation;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.te.springmvc.entity.Employee;
import com.te.springmvc.model.EmployeeModel;
import com.te.springmvc.repository.ProjectRepository;
import com.te.springmvc.service.ProjectService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProjectServiceImplementation implements ProjectService {

	private final ProjectRepository projectRepository;

	@Override
	public EmployeeModel register(EmployeeModel employeeModel) {
		Employee employee = new Employee();
		BeanUtils.copyProperties(employeeModel, employee);
		BeanUtils.copyProperties(projectRepository.register(employee), employeeModel);
		return employeeModel;
	}

}
