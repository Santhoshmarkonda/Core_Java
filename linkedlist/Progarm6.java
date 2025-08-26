package com.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class Progarm6 {
	public static void main(String[] args) {
		LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(10,20,30,40));
		if (!nums.isEmpty()) {
		    int last = nums.pollLast();
		    nums.push(last);
		}
		System.out.println(nums);
	}
}
