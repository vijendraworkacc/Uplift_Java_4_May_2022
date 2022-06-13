package com.te.jacksonapi.beans;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
// @JsonIgnoreProperties(value = { "employeeAge", "employeeId" })
@JsonPropertyOrder(value = { "address", "employeeId", "employeeAge", "employeeName" })
public class Employee {
	// @JsonProperty(value = "employee_id")
	private int employeeId;
	private String employeeName;
	// @JsonIgnore
	private int employeeAge;

	private Address address;
}
