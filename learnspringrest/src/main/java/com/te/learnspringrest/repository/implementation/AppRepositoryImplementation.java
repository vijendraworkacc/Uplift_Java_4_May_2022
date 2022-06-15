package com.te.learnspringrest.repository.implementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.te.learnspringrest.entity.Employee;
import com.te.learnspringrest.repository.AppRepository;

@Repository
public class AppRepositoryImplementation implements AppRepository {

	@Autowired
	private EntityManager entityManager;

	@Override
	public Employee getEmployee(int employeeId) {
		return entityManager.find(Employee.class, employeeId);
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		Employee employee = entityManager.find(Employee.class, employeeId);
		if (employee != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
