package com.arrays;

public class Array_3 {

	public static void countEvenOdd(int[] arr) {
		int evenCount = 0;
		int oddCount = 0;

		for (int num : arr) {
			if (num % 2 == 0)
				evenCount++;
			else
				oddCount++;
		}

		System.out.println("Even: " + evenCount + ", Odd: " + oddCount);

	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 11, 14 };

		countEvenOdd(arr);
	}
}
