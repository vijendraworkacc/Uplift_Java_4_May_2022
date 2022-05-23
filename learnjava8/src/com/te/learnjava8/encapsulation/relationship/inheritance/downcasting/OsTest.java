package com.te.learnjava8.encapsulation.relationship.inheritance.downcasting;

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

		// Downcasting!
//		ColorOs colorOs2 = (ColorOs) colorOs;
//		colorOs2.gui();

		((ColorOs) colorOs).gui();
	}
}
