package com.constructor;

public class Car {
	
	String carName;
	String carModel;
	int yearOfManufacture;
	
	public Car() {
		System.out.println("Default Constructor invoked");
	}
	
	public Car(String cName,String cModel, int yom) {
		System.out.println("Parameterized constructor invoked");
		carName = cName;
		carModel = cModel;
		yearOfManufacture = yom;
	}
	
	public void getData() {
		System.out.println("Car Name: "+carName);
		System.out.println("Car Model: "+carModel);
		System.out.println("Year Of Manufacture: "+yearOfManufacture);
	}
    public static void main(String[] args) {
		Car car1 = new Car();
		car1.getData();
		System.out.println();
		Car car2 = new Car("honda","Xuv",2024);
		car2.getData();
	}
}
