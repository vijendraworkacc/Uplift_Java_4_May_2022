package com.te.learnjava8.encapsulation.relationship.inheritance;

/* Generalization 
 * 		+ 
 * Specialization
 * */
public class OsTest {
	public static void main(String[] args) {
		MiuiOs miuiOs = new MiuiOs();
		miuiOs.runOs();
		miuiOs.increasePerformence();
		miuiOs.batteryPerformence();
		System.out.println();
		ColorOs colorOs = new ColorOs();
		colorOs.runOs();
		colorOs.increasePerformence();
		colorOs.batteryPerformence();
	}
}
