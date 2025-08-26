package com.lamdaexpressions;

@FunctionalInterface
interface A {
	void display();
}

public class Main {
	public static void main(String[] args) {
		
		A a = () -> System.out.println("Lamda Expressions");
		a.display();
		
	}
}
