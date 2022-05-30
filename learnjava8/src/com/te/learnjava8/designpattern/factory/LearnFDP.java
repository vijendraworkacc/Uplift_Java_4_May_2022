package com.te.learnjava8.designpattern.factory;

import java.util.Scanner;

public class LearnFDP {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter car name: ");
		String carType = scanner.next();
		CarFactory carFactory = new CarFactory();
		Car carOb = carFactory.carObjectFactoryMethod(carType);
		carOb.printCarName();
		carOb.printCarMilage();
		carOb.printCarTopSpeed();
	}
}
