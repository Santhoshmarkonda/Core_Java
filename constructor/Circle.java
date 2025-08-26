package com.constructor;

public class Circle {
	
	double radius;
	
	public Circle(int r) {
		radius = r;
	}
	
	public void getArea() {
		double area = 3.141 * radius * radius;
		System.out.println("Area of Circle: "+area);
	}
	
	public void getCircumference() {
		double circumference = 2*3.141*radius;
		System.out.println("Circumference of Circle: "+circumference);
	}
	
    public static void main(String[] args) {
		Circle circle = new Circle(7);
		circle.getArea();
		circle.getCircumference();
	}
}
