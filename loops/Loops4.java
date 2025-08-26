package com.loops;

public class Loops4 {
    
	public int getOddSum(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
		    if(i%2==1) {
		    	sum = sum + i;
		    }
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Loops4 obj = new Loops4();
		int result = obj.getOddSum(30);
		System.out.println(result);
	}
}
