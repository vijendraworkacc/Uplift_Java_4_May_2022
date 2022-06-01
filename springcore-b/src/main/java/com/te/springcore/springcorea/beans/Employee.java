package com.te.springcore.springcorea.beans;

public class Employee {
	private String employeeName;
	private Integer employeeId;
	private int employeeAge;

	public Employee() {
		System.out.println("Employee() called!");
	}

	public Employee(String employeeName, Integer employeeId, int employeeAge) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeAge = employeeAge;
		System.out.println("Employee(String employeeName, Integer employeeId, int employeeAge) called!");
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		System.out.println("setEmployeeName(String employeeName) called!");
		this.employeeName = employeeName;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		System.out.println("setEmployeeId(Integer employeeId) called!");
		this.employeeId = employeeId;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		System.out.println("setEmployeeAge(int employeeAge) called!");
		this.employeeAge = employeeAge;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeAge=" + employeeAge
				+ "]";
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode() called!");
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeAge;
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeAge != other.employeeAge)
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		return true;
	}

}
