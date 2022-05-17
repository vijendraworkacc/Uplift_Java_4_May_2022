package com.te.learnjava8.encapsulation.relationship;

public class Mentor {
	private String mentorId;
	private String mentorName;

	public Mentor() {
		super();
	}

	public Mentor(String mentorId, String mentorName) {
		super();
		this.mentorId = mentorId;
		this.mentorName = mentorName;
	}

	public String getMentorId() {
		return mentorId;
	}

	public void setMentorId(String mentorId) {
		this.mentorId = mentorId;
	}

	public String getMentorName() {
		return mentorName;
	}

	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}

	@Override
	public String toString() {
		return "Mentor [mentorId=" + mentorId + ", mentorName=" + mentorName + "]";
	}

}
