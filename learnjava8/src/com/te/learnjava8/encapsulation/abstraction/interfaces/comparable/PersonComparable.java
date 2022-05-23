package com.te.learnjava8.encapsulation.abstraction.interfaces.comparable;

public class PersonComparable extends Person implements Comparable<Person> {

	public PersonComparable(Integer personId, String personName, Integer personAge) {
		super(personId, personName, personAge);
	}

	@Override
	public int compareTo(Person o) {
		return this.getPersonAge() - o.getPersonAge();
	}

}
