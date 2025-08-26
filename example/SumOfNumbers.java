package com.example;

public class SumOfNumbers {
	
	public static int sum(int num) {
		if (num <= 0) 
			return 0;
		return num + sum(num - 1);
	}

	public static void main(String[] args) {
		int result = sum(10);
		System.out.println(result);
	}
}
