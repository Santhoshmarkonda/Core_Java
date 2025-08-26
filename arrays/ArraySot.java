package com.arrays;

//Bubble Sort
import java.util.Arrays;

public class ArraySot {
	
	public static void main(String[] args) {
		int[] a = {20,12,1,12,12,45,67,34};
		
		for(int i =0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

}
