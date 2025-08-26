package com.encapsulation;

class Manufacturer {

	private String brandName;
	private String country;

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBrandName() {
		return brandName;
	}

	public String getCountry() {
		return country;
	}

	public void showManufacturerDetails() {
		System.out.println("Manufacturer Brandname: " + brandName);
		System.out.println("Manufactured Country: " + country);
	}

}

class Laptop {
	private String model;
	private double price;

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public void showLaptopDetails() {
		System.out.println("Laptop Model: " + model);
		System.out.println("Laptop Price: " + price);
	}
}

public class ElectronicsApp {

	public static void main(String[] args) {
		Laptop lap = new Laptop();
		lap.setModel("pavilion 14");
		lap.setPrice(55000.65);

		Manufacturer m1 = new Manufacturer();
		m1.setBrandName("HP");
		m1.setCountry("India");

		lap.showLaptopDetails();
		System.out.println();
		m1.showManufacturerDetails();
	}

}
