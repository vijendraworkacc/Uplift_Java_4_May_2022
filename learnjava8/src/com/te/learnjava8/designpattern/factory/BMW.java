package com.te.learnjava8.designpattern.factory;

public class BMW implements Car {

	@Override
	public void printCarName() {
		System.out.println("Car name is BMW!");
	}

	@Override
	public void printCarMilage() {
		System.out.println("Car milage is 10kmpl!");
		
	}

	@Override
	public void printCarTopSpeed() {
		System.out.println("Car topspeed is 240kmph!");
		
	}

}
