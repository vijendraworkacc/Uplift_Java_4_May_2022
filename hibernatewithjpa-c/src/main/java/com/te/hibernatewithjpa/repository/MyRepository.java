package com.te.hibernatewithjpa.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatewithjpa.a.entity.Employee;
import com.te.hibernatewithjpa.a.entity.Technology;

public class MyRepository {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public Employee save(Employee employee) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
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
}
