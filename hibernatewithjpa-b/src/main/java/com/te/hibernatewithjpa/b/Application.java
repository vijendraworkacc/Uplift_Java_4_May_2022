package com.te.hibernatewithjpa.b;

import com.te.hibernatewithjpa.entity.Employee;
import com.te.hibernatewithjpa.repository.MyRepository;

public class Application {
	public static void main(String[] args) {
		MyRepository myRepository = new MyRepository();

		// 1. SAVE Employee!
		Employee employee = new Employee();
		employee.setEmployeeName("Name03");
		employee.setEmployeeAge(22);
		// myRepository.saveEmployee(employee);

		// 2. READ Employee!
		Employee employeeByFind = myRepository.getEmployeeByFind(1);
		System.out.println("Using find() method:  " + employeeByFind);
		System.out.println("------------------------------------------");
		Employee employeeByReference = myRepository.getEmployeeByReference(1);
		System.out.println("Using getReference() method:  " + employeeByReference);

		// 3. UPDATE Employee!
		Employee employee2 = new Employee();
		employee2.setEmployeeName("New Name");
		employee2.setEmployeeAge(33);

		Employee updatedEmployee = myRepository.updateEmployee(1, employee2);
		System.out.println("Updated employee: " + updatedEmployee);

		// 4. DELETE Employee!
		boolean deleteEmployee = myRepository.deleteEmployee(1);
		System.out.println("Is deleted? " + deleteEmployee);
	}
}
