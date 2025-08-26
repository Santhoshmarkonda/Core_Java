package com.constructor;

public class Box {
	
	int length;
	
	public Box(int length) {
		this.length = length;
	}
	
	//we can give Written Class return type (Non-Primitive written type)
	
	public Box setLength(int length) {
		this.length = length;
		return this;
	}
	
	public void display() {
		System.out.println("the length of box is: "+this.length);
	}
	
	public static void main(String[] args) {
		Box b1 = new Box(7);
		b1.setLength(17).display();
	}

}
