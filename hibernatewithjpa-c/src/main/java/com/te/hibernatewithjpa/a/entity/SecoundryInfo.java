package com.te.hibernatewithjpa.a.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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
@Entity
public class SecoundryInfo {
	@Id
	private String employeePanNumber;
	private String employeeFN;
	private String employeeMN;
	@Column(unique = true)
	private String employeeAadharNumber;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "secoundryInfo")
	private Employee employee;
}
