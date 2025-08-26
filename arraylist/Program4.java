package com.arraylist;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Program4 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 20, 40));
		List<Integer> uniqueNumbers = new ArrayList<>();
		for (int num : nums) {
			if (!uniqueNumbers.contains(num)) {
				uniqueNumbers.add(num);
			}
		}
		System.out.println(uniqueNumbers);
	}

}
