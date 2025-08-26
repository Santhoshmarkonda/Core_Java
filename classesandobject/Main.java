package com.classesandobject;

public class Main {
	
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.getClass());
		System.out.println(obj1.hashCode());
		System.out.println(obj1.toString());
		System.out.println(obj1.equals(obj1));
//		obj1.notify();
//		obj1.notifyAll();
//		obj1.wait();
//		obj1.wait(0);
//		obj1.wait(0, 0);
	}
	
}
