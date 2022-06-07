package com.te.hibernatewithjpa.a;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("mysql-pu");
	}
}
