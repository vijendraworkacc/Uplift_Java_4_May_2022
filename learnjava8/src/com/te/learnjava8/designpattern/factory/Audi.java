package com.te.learnjava8.designpattern.factory;

public class Audi implements Car {

	@Override
	public void printCarName() {
		System.out.println("Car name is Audi!");
	}

	@Override
	public void printCarMilage() {
		System.out.println("Car milage is 12kmpl!");
		
	}

	@Override
	public void printCarTopSpeed() {
		System.out.println("Car topspeed is 180kmph!");
		
	}

}
