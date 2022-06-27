package com.te.learnjava8.java8features.consumer;

import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class IncreaseEmployeeSalary {
	public static void main(String[] args) {
		HashSet<Employee> employees = new HashSet<>();
		employees.add(new Employee(1, "Name01", 2222.22));
		employees.add(new Employee(2, "Name02", 2000.22));
		employees.add(new Employee(3, "Name03", 2123.29));
		employees.add(new Employee(4, "Name04", 2222.212));
		employees.add(new Employee(5, "Name05", 1390.00));

		Consumer<Employee> consumer = e -> {
			e.setEmployeeSalary(e.getEmployeeSalary() * 1.25);
		};
		employees.stream().forEach(e -> e.setEmployeeSalary(e.getEmployeeSalary() * 1.25));

		List<Employee> collect = employees.stream().sorted().collect(Collectors.toList());

		employees.stream().forEach(e -> System.out.println(e));
		System.out.println();
		collect.stream().forEach(e -> System.out.println(e));

		List<Employee> collect2 = employees.stream().filter(e -> e.getEmployeeSalary() <= 2000)
				.collect(Collectors.toList());

		System.out.println();
		collect2.stream().forEach(e -> System.out.println(e));
	}
}
