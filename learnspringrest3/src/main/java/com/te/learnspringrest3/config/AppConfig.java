package com.te.learnspringrest3.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public EntityManager getEM() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");
		return entityManagerFactory.createEntityManager();
	}
	
}
