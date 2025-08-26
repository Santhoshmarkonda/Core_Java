package com.arrays;

public class Array_5 {

	public static void palindromeOrNot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			if (arr[start] != arr[end]) {
				System.out.println("Not a palindrome");
				return;
			}
			start++;
			end--;
		}

		System.out.println("Palindrome");
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 1 };

		palindromeOrNot(arr);
	}

}
