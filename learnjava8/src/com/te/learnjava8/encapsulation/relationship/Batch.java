package com.te.learnjava8.encapsulation.relationship;

import java.time.LocalDate;

public class Batch {
	private String batchId;
	private LocalDate batchStartDate;
	private LocalDate batchEndDate;

	// Late instantiation!
	private Mentor mentor;

	public Batch() {
		super();
	}

	public Batch(String batchId, LocalDate batchStartDate, LocalDate batchEndDate, Mentor mentor) {
		super();
		this.batchId = batchId;
		this.batchStartDate = batchStartDate;
		this.batchEndDate = batchEndDate;
		this.mentor = mentor;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public LocalDate getBatchStartDate() {
		return batchStartDate;
	}

	public void setBatchStartDate(LocalDate batchStartDate) {
		this.batchStartDate = batchStartDate;
	}

	public LocalDate getBatchEndDate() {
		return batchEndDate;
	}

	public void setBatchEndDate(LocalDate batchEndDate) {
		this.batchEndDate = batchEndDate;
	}

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}

	// Helper method!
	public void createMentorObject() {
		mentor = new Mentor("M01", "Mentor01");
	}

	// Helper method!
	public static Mentor createMentorObject2() {
		return new Mentor("M02", "Mentor02");
	}

	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchStartDate=" + batchStartDate + ", batchEndDate=" + batchEndDate
				+ ", mentor=" + mentor + "]";
	}

}
