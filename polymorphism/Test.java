package com.polymorphism;

import java.util.Arrays;

//method overloading

public class Test {

	public static void add(int a, int b) {
		System.out.println("primitive integer");
	}

	public static void add(float a, float b) {
		System.out.println("primitive float");
	}

	public static void add(double a, double b) {
		System.out.println("primitive double");
	}

	public static void add(Integer a, Integer b) {
		System.out.println("non-primitive integer");
	}

	public static void varShow(int a, int b, int c, int... d) {
		System.out.println(Arrays.toString(d));
	}

	public static void main(String[] args) {
		add(10, 10);
		varShow(1, 2, 3, 4, 5, 6, 7);
	}
}
