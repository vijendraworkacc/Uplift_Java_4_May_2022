package com.te.learnjava8.collectionframework.map;

public class SubjectMarks {
	private String subjectName;
	private Integer subjectMarks;

	public SubjectMarks() {
		super();
	}

	public SubjectMarks(String subjectName, Integer subjectMarks) {
		super();
		this.subjectName = subjectName;
		this.subjectMarks = subjectMarks;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Integer getSubjectMarks() {
		return subjectMarks;
	}

	public void setSubjectMarks(Integer subjectMarks) {
		this.subjectMarks = subjectMarks;
	}

	@Override
	public String toString() {
		return "SubjectMarks [subjectName=" + subjectName + ", subjectMarks=" + subjectMarks + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subjectMarks == null) ? 0 : subjectMarks.hashCode());
		result = prime * result + ((subjectName == null) ? 0 : subjectName.hashCode());
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
		SubjectMarks other = (SubjectMarks) obj;
		if (subjectMarks == null) {
			if (other.subjectMarks != null)
				return false;
		} else if (!subjectMarks.equals(other.subjectMarks))
			return false;
		if (subjectName == null) {
			if (other.subjectName != null)
				return false;
		} else if (!subjectName.equals(other.subjectName))
			return false;
		return true;
	}

}
