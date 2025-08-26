package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {
		ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,2,4));
		nums.removeIf(a -> a == 2);
		System.out.println(nums);
	}
}
