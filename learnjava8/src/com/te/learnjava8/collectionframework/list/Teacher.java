package com.te.learnjava8.collectionframework.list;

public class Teacher implements Comparable<Teacher> {
	private Integer teacherId;
	private String teacherName;
	private Integer teacherAge;

	public Teacher() {
		super();
	}

	public Teacher(Integer teacherId, String teacherName, Integer teacherAge) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherAge = teacherAge;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Integer getTeacherAge() {
		return teacherAge;
	}

	public void setTeacherAge(Integer teacherAge) {
		this.teacherAge = teacherAge;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherAge=" + teacherAge + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode() called!");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((teacherAge == null) ? 0 : teacherAge.hashCode());
		result = prime * result + ((teacherId == null) ? 0 : teacherId.hashCode());
		result = prime * result + ((teacherName == null) ? 0 : teacherName.hashCode());
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
		Teacher other = (Teacher) obj;
		if (teacherAge == null) {
			if (other.teacherAge != null)
				return false;
		} else if (!teacherAge.equals(other.teacherAge))
			return false;
		if (teacherId == null) {
			if (other.teacherId != null)
				return false;
		} else if (!teacherId.equals(other.teacherId))
			return false;
		if (teacherName == null) {
			if (other.teacherName != null)
				return false;
		} else if (!teacherName.equals(other.teacherName))
			return false;
		return true;
	}

	@Override
	public int compareTo(Teacher o) {
		return this.teacherAge - o.teacherAge;
	}

}
