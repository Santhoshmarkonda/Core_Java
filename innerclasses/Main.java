package com.innerclasses;

abstract class A {
	abstract void display();
}

public class Main {
	public static void main(String[] args) {
		A a = new A() {
			void display() {
				System.out.println("Anonymous inner class block executed...");
			}
		};

		a.display();
	}
}
