package com.te.learnjava8.encapsulation.abstraction.interfaces.defaultkeyword;

public interface TogetherInterface extends Left, Right {

	@Override
	default void m3() {
		Left.super.m3();
	}
	
}
