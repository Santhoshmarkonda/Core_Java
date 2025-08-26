package com.arrays;

public class Array_2 {

	public static int getMax(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int getMin(int[] arr) {

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 45, 2, 19, 67 };

		System.out.println("Max = " + getMax(arr) + ", Min = " + getMin(arr));
	}

}
