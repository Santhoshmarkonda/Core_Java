package com.arrays;

public class Array_1 {

	public static void getSum(int[] arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.println("Sum = " + sum);
	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40 };

		getSum(arr);

	}

}
