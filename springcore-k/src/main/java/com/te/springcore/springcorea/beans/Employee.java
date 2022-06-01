package com.te.springcore.springcorea.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Employee {
	private String employeeName;
	private Integer employeeId;
	private int employeeAge;
	private List<String> employeeCollegue;
	private Set<String> employeeManager;
	private Map<String, Integer> employeeTechRating;

	private Address address;

	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
	}

}
