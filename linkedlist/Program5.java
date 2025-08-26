package com.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class Program5 {
	
	public static void main(String[] args) {
		LinkedList <Integer> nums = new LinkedList<>(Arrays.asList(1,2,3,2,4));
		int middleIndex = nums.size() / 2;
		nums.add(middleIndex, 5);
		System.out.println(nums);
	}

}
