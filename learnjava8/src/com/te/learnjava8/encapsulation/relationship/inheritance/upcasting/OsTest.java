package com.te.learnjava8.encapsulation.relationship.inheritance.upcasting;

public class OsTest {
	public static void main(String[] args) {
		AndroidOs colorOs = new ColorOs();
		colorOs.runOs();
		colorOs.increasePerformence();
		colorOs.batteryPerformence();
		/*
		 * The below line will give CTE, because AndroidOs has no knowledge about the
		 * gui() method present in the ColorOs class!
		 * 
		 */
		// colorOs.gui();
	}
}
