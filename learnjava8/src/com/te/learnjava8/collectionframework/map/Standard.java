package com.te.learnjava8.collectionframework.map;

public enum Standard {
	FIRST(1), SECOND(2), THIRD(3), FOURTH(4), FIFTH(5);

	private final Integer i;

	Standard(Integer i) {
		this.i = i;
	}

	public Integer getI() {
		return i;
	}
}
