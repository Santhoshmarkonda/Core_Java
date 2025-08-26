package com.classesandobject;

public class Car {
	
	static String companyName = "Honda";
	String carModel = "Civic";

	public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        
        car1.carModel = "Civic";
        car2.carModel = "Accord";
        
        System.out.println("Company: "+Car.companyName);
        System.out.println("Car 1 Model: "+car1.carModel);
        System.out.println("Car 2 Model: "+car2.carModel);
        
	}

}
