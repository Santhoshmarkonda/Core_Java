package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Program1 {
	
	public static void main(String[] args) {
		ArrayList <Integer> elements = new ArrayList<>(Arrays.asList(1,2,3,2,4));
		System.out.println(elements.reversed());		
	}

}
