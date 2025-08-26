package com.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class Program7 {
	
	public static void main(String[] args) {
		LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(10,20,30,40));
		if (nums.size() >= 2) {
		    int last = nums.pollLast();
		    int first = nums.pollFirst();
		    nums.addFirst(last);
		    nums.add(first);
		}
		
		System.out.println(nums);
	}

}
