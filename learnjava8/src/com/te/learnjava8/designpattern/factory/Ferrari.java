package com.te.learnjava8.designpattern.factory;

public class Ferrari implements Car {

	@Override
	public void printCarName() {
		System.out.println("Car name is Ferrari!");
	}

	@Override
	public void printCarMilage() {
		System.out.println("Car milage is 5kmpl!");
		
	}

	@Override
	public void printCarTopSpeed() {
		System.out.println("Car topspeed is 300kmph!");
		
	}

}
