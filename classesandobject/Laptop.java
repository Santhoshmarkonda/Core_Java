package com.classesandobject;

public class Laptop {
	String brand;
	int ram;
	double price;

	Laptop() {
		brand = "unknown";
		ram = 4;
		price = 25000.0;
	}

	Laptop(String b, int r, double p) {
		brand = b;
		ram = r;
		price = p;
	}

	Laptop(Laptop l) {
		brand = l.brand;
		ram = l.ram;
		price = l.price;
	}

	void displaySpecs() {
		System.out.println("Brand: " + brand);
		System.out.println("RAM: " + ram + " GB");
		System.out.println("Price: " + price);
	}

	public static void main(String[] args) {
		System.out.println("Laptop 1:");
		Laptop laptop1 = new Laptop();
		System.out.println("Laptop 2:");
		Laptop laptop2 = new Laptop("Dell", 16, 65000.0);
		System.out.println("Laptop 3:");
		Laptop laptop3 = new Laptop(laptop2);
		
		laptop1.displaySpecs();
		System.out.println();		
		laptop2.displaySpecs();
		System.out.println();		
		laptop3.displaySpecs();
	}

}
