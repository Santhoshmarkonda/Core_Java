package com.constructor;

public class Product {
	
	int id;
	double price;
	
	public Product(int id, double price) {
		this.id = id;
		this.price = price;
	}
	
	public boolean isSame(Product p) {
		return this.id == p.id;
	}
	
	public static void main(String[] args) {
		Product p1 = new Product(1, 1500.345);
		Product p2 = new Product(2, 345.890);
		System.out.println(p1.isSame(p2));
	}

}
