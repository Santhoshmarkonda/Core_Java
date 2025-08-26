package com.constructor;

public class Rectangle {
	
	int length;
	int breath;
	
	public Rectangle() {
		length = 0;
		breath = 0;
	}
	
	public Rectangle(int l,int b) {
		length = l;
		breath = b;
	}
	
	public void area() {
		System.out.println("Area of Rectangle: "+length*breath);
	}
	
	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle();	
		rectangle1.area();
		System.out.println();
		Rectangle rectangle2 = new Rectangle(4,5);
		rectangle2.area();
		
		
	}

}
