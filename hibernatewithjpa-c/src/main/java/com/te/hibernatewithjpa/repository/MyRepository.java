package com.te.hibernatewithjpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatewithjpa.a.entity.Batch;
import com.te.hibernatewithjpa.a.entity.Employee;
import com.te.hibernatewithjpa.a.entity.SecoundryInfo;
import com.te.hibernatewithjpa.a.entity.Technology;

public class MyRepository {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public Employee saveEmployee(Employee employee) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
	}

	public Technology saveTechnology(Technology technology) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(technology);
		entityTransaction.commit();
		return technology;
	}

	public Batch saveBatch(Batch batch) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(batch);
		entityTransaction.commit();
		return batch;
	}

	public void addTechnologyToEmployee(int employeeId, int technologyId) {
		// 1. Find Technology!
		// 2. Find Employee!
		// 3. Set them with each other!
		// 4. Persist Employee!
		Technology technology = entityManager.find(Technology.class, technologyId);
		Employee employee = entityManager.find(Employee.class, employeeId);
		employee.getTechnologies().add(technology);
		technology.getEmployees().add(employee);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}

	public void addBatchToEmployee(int employeeId, int batchId) {
		Batch batch = entityManager.find(Batch.class, batchId);
		Employee employee = entityManager.find(Employee.class, employeeId);
		employee.setBatch(batch);
		batch.getEmployees().add(employee);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
	
	public void deleteEmployee(int employeeId) {
		Employee employee = entityManager.find(Employee.class, employeeId);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		employee.setBatch(null);
		employee.setSecoundryInfo(null);
		employee.setTechnologies(null);
		entityManager.persist(employee);
		entityManager.flush();
		entityManager.clear();
		entityTransaction.commit();
		
		Employee employee1 = entityManager.find(Employee.class, employeeId);
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(employee1);
		entityTransaction.commit();
	}

	public void deleteSecoundryInfo(String employeePanNumber) {
		SecoundryInfo info = entityManager.find(SecoundryInfo.class, employeePanNumber);
		System.out.println(info.getEmployeePanNumber());
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		info.setEmployee(null);
		entityManager.persist(info);
		entityManager.flush();
		entityManager.clear();
		entityTransaction.commit();
		
		info = entityManager.find(SecoundryInfo.class, employeePanNumber);
		EntityTransaction entityTransaction2 = entityManager.getTransaction();
		entityTransaction2.begin();
		entityManager.remove(info);
		entityTransaction2.commit();
	}
	
	public void deleteTechnology(int technologyId) {
		Technology technology = entityManager.find(Technology.class, technologyId);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		technology.setEmployees(null);
		entityManager.persist(technology);
		entityManager.flush();
		entityManager.clear();
		entityTransaction.commit();
		
		EntityTransaction entityTransaction2 = entityManager.getTransaction();
		entityTransaction2.begin();
		entityManager.remove(technology);
		entityTransaction2.commit();
	}
	
	public void deleteBatch(int batchId) {
		Batch batch = entityManager.find(Batch.class, batchId);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		batch.setEmployees(null);
		entityManager.persist(batch);
		entityManager.flush();
		entityManager.clear();
		entityTransaction.commit();
		
		EntityTransaction entityTransaction2 = entityManager.getTransaction();
		entityTransaction2.begin();
		entityManager.remove(batch);
		entityTransaction2.commit();
	}
}
