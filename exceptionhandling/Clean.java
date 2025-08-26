package com.exceptionhandling;

public class Clean {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		try {
			System.out.println(arr[6]);
			try {
				System.out.println(5 / 0);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Cleanup Done");
		}

	}

}
