package com.te.learnjava8.designpattern.factory;

public class CarFactory {
	public Car carObjectFactoryMethod(String carType) {
		if (carType.equalsIgnoreCase("BMW")) {
			return new BMW();
		} else if (carType.equalsIgnoreCase("Ferrari")) {
			return new Ferrari();
		} else {
			return new Audi();
		}
	}
}
