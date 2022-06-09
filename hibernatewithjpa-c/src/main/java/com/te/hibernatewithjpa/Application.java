package com.te.hibernatewithjpa;

import com.te.hibernatewithjpa.a.entity.Batch;
import com.te.hibernatewithjpa.a.entity.Employee;
import com.te.hibernatewithjpa.a.entity.SecoundryInfo;
import com.te.hibernatewithjpa.a.entity.Technology;
import com.te.hibernatewithjpa.repository.MyRepository;

public class Application {
	public static void main(String[] args) {

		MyRepository myRepository = new MyRepository();

		SecoundryInfo secoundryInfo = new SecoundryInfo();
		secoundryInfo.setEmployeeAadharNumber("1234567");
		secoundryInfo.setEmployeePanNumber("123456");
		secoundryInfo.setEmployeeFN("qwerty");
		secoundryInfo.setEmployeeMN("qwerty");

		Employee employee = new Employee();
		employee.setEmployeeAge(22);
		employee.setEmployeeName("Name01");
		employee.setEmployeePn(12345L);

		employee.setSecoundryInfo(secoundryInfo);
		secoundryInfo.setEmployee(employee);

		myRepository.saveEmployee(employee);

		Technology technology = new Technology();
		technology.setTechnologyName("JAVA");
		myRepository.saveTechnology(technology);

		Technology technology2 = new Technology();
		technology2.setTechnologyName("REACT");
		myRepository.saveTechnology(technology2);

		myRepository.addTechnologyToEmployee(1, 1);
		myRepository.addTechnologyToEmployee(1, 2);

		Batch batch = new Batch();
		batch.setBatchName("B01");
		myRepository.saveBatch(batch);

		myRepository.addBatchToEmployee(1, 1);

		// myRepository.deleteSecoundryInfo("123456");
		myRepository.deleteEmployee(1);
		// myRepository.deleteBatch(1);
		// myRepository.deleteTechnology(1);

	}
}
