package com.interfaces;

public class Main {
	
	@FunctionalInterface
	interface A {
		void display(int p, int q);
	}
	 
	public static void main(String[] args) {
		A a = (p,q) -> System.out.println(p*q);
		a.display(4,5);
	}

}