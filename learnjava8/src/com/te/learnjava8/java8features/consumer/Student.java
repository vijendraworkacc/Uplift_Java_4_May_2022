package com.te.learnjava8.java8features.consumer;

public class Student {
	private Integer studentId;
	private String studentName;
	private Integer studentAge;

	public Student() {
		super();
	}

	public Student(Integer studentId, String studentName, Integer studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentAge == null) ? 0 : studentAge.hashCode());
		result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
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
		Student other = (Student) obj;
		if (studentAge == null) {
			if (other.studentAge != null)
				return false;
		} else if (!studentAge.equals(other.studentAge))
			return false;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}

}
