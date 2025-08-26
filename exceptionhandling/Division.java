package com.exceptionhandling;

public class Division {

	public static void divide(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("can't divide with zero");
		} else
			System.out.println(a / b);
	}

	public static void main(String[] args) {
		try {
			divide(10, 2);
			divide(10, 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("code executes");
		}
	}
}
