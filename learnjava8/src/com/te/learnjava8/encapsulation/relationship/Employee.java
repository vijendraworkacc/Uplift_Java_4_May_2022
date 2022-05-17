package com.te.learnjava8.encapsulation.relationship;

import java.time.LocalDate;

public class Employee {

	private String employeeId;
	private String employeeName;
	private int employeeAge;
	private long employeePhoneNumber;

	// Early instantiation!
	private Batch batch = new Batch("M001", LocalDate.MIN, LocalDate.MAX, null);

	public Employee() {
		super();
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		if (employeeAge <= 0) {
			System.out.println("Age entered is not correct!");
		} else {
			this.employeeAge = employeeAge;
		}
	}

	public long getEmployeePhoneNumber() {
		return employeePhoneNumber;
	}

	public void setEmployeePhoneNumber(long employeePhoneNumber) {
		this.employeePhoneNumber = employeePhoneNumber;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
				+ ", employeePhoneNumber=" + employeePhoneNumber + ", batch=" + batch + "]";
	}
}
