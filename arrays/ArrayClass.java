package com.arrays;

public class ArrayClass {

	public static void findSecondLargest(int[] arr) {
		if (arr.length < 2) {
			System.out.println("Array must contain at least two elements.");
			return;
		}

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > max) {
				secondMax = max;
				max = num;
			} else if (num > secondMax && num != max) {
				secondMax = num;
			}
		}

		if (secondMax == Integer.MIN_VALUE) {
			System.out.println("No second largest element found.");
		} else {
			System.out.println("Second largest element is: " + secondMax);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 12, 45, 67, 23, 89, 45 };

		findSecondLargest(arr);
	}
}
