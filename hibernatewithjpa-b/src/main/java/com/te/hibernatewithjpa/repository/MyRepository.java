package com.te.hibernatewithjpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.sun.xml.internal.ws.api.model.MEP;
import com.te.hibernatewithjpa.entity.Employee;

public class MyRepository {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();

	public void saveEmployee(Employee employee) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}

	public Employee getEmployeeByFind(int id) {
		return entityManager.find(Employee.class, id);
	}

	public Employee getEmployeeByReference(int id) {
		return entityManager.getReference(Employee.class, id);
	}

	public Employee updateEmployee(int id, Employee employee) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee foundEmployee = entityManager.find(Employee.class, id);
		if (foundEmployee != null) {
			foundEmployee.setEmployeeName(employee.getEmployeeName());
			foundEmployee.setEmployeeAge(employee.getEmployeeAge());

			entityTransaction.begin();
			entityManager.persist(foundEmployee);
			entityTransaction.commit();
		}
		return foundEmployee;
	}

	public boolean deleteEmployee(int id) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee foundEmployee = entityManager.find(Employee.class, id);
		if (foundEmployee != null) {
			entityTransaction.begin();
			entityManager.remove(foundEmployee);
			entityTransaction.commit();
			return true;
		}
		return false;
	}
}
