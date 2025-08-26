package com.constructor;

public class Laptop {
    String brand;
    int ramSize;
    
    public Laptop(String b, int r) {
    	brand = b;
    	ramSize = r;
    }
    
    public void showSpec() {
    	System.out.println("Laptop Brand: "+brand);
    	System.out.println("Laptop Ram: "+ramSize+" GB");
    }
    
    public static void main(String[] args) {
		Laptop lap1 = new Laptop("HP",8);
		lap1.showSpec();
		System.out.println();
		Laptop lap2 = new Laptop("Lenovo", 9);
		lap2.showSpec();
	}
}
