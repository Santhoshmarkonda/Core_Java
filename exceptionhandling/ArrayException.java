package com.exceptionhandling;

public class ArrayException {

	public static int getValue(int[] array, int index) {
		return array[index];
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		try {
			System.out.println(getValue(arr, 5));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} 
	}

}
