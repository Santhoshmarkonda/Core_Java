package com.arrays;

public class Array_6 {

	public static void secondLargest(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		if(arr.length < 2) {
			System.out.println("Array must contain 2 Elements");
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}

		if (secondMax == Integer.MIN_VALUE) {
			System.out.println("No second largest element found.");
		} else {
			System.out.println("Second largest: " + secondMax);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 10, 50, 20, 40 };

		secondLargest(arr);
	}
}
