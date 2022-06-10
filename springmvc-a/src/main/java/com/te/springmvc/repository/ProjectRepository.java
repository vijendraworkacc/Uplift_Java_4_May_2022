package com.te.springmvc.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.springmvc.entity.Employee;

@Repository
public class ProjectRepository {
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();

	public Employee register(Employee employee) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
	}
}
