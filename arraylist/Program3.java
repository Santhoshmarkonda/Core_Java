package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Program3 {
	
	public static void main(String[] args) {
		ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,2,4));
		
		if (nums.size() < 2) {
            System.out.println("List must contain at least two elements.");
            return;
        }
		
		int secMax = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int num : nums) {
			if(num>max) {
				secMax = max;
				max = num;
			}else if(num >= secMax && num < max) {
				secMax = num;
			}
		}
		
		if (secMax == Integer.MIN_VALUE) {
            System.out.println("Second largest not found — all elements may be equal.");
        } else {
            System.out.println("Second Largest Element: " + secMax);
        }
	}

}
