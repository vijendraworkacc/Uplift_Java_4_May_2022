package com.te.springcore.springcorea.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
// @ToString
@EqualsAndHashCode
@Component
public class Employee {
	@Value("Emp01")
	private String employeeName;
	@Value("1")
	private Integer employeeId;
	@Value("22")
	private int employeeAge;

	@Autowired
	private Address address;
}
