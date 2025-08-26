package com.constructor;

public class Point {
	
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void print() {
		System.out.println("the x value: "+this.x);
		System.out.println("the y value: "+this.y);
		System.out.println("the current object reference: "+this);
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(3, 9);
		p1.print();
	}

}
