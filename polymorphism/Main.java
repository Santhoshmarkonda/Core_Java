package com.polymorphism;

abstract class A {

	static void display() {
		System.out.println("sooooo");
	}

	static void show() {
		System.out.println("hoooo");
	}

	void run() {
		System.out.println("hhaaaaa");
	}
}

public class Main {

	public static void main(String[] args) {
		A.display();
		A.show();
	}

}
