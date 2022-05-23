package com.te.learnjava8.encapsulation.relationship;

public class RelationshipTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmployeeId("TY0191");
		employee.setEmployeeAge(22);
		employee.setEmployeeName("Name01");
		employee.setEmployeePhoneNumber(12345678L);

		// employee.getBatch().createMentorObject();

		// employee.getBatch().setMentor(Batch.createMentorObject2());

		Batch batch = employee.getBatch();
		batch.setMentor(Batch.createMentorObject2());

		System.out.println(employee);
		System.out.println();
		System.out.println(employee.toString());
	}
}
