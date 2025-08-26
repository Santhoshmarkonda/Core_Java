package com.interfaces;

interface Vehicle {
	void start();
}

class Bike implements Vehicle {

	Bike() {
		System.out.println("Bike constructor is invoked");
	}

	@Override
	public void start() {
		System.out.println("bike is starting");
	}

}

class Car implements Vehicle {

	Car() {
		System.out.println("Car constructor is invoked");
	}

	@Override
	public void start() {
		System.out.println("Car is starting");
	}

}

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle v1 = new Bike();
		v1.start();
		Vehicle v2 = new Car();
		v2.start();
	}
}
