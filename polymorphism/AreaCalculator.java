package com.polymorphism;

public class AreaCalculator {
	
	public double calculateArea(double radius) {
		double areaOfCircle = Math.PI * radius * radius;
		return areaOfCircle;
	}
	
	public double calculateArea(double length,double breath) {
		double areaOfRectangle = length * breath;
		return areaOfRectangle;
	}
	
	public double calculateArea(float base,double height) {
		double areaOfTriangle = 0.5 * base * height;
		return areaOfTriangle;
	}

	public static void main(String[] args) {
		AreaCalculator area = new AreaCalculator();
		System.out.printf("Area of Circle: %.2f\n",area.calculateArea(5.7));
		System.out.printf("Area of Rectangle: %.2f\n",area.calculateArea(4.5,5.6));
		System.out.printf("Area of Triangle: %.2f\n",area.calculateArea(3.4f,6.4));
	}
}
