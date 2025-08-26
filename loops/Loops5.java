package com.loops;

public class Loops5 {
    public void getPlusThree(int n) {
    	for(int i=5;i<n;i=i+3) {
    		System.out.print(i+" ");
    	}
    }
    
    public static void main(String[] args) {
		Loops5 obj = new Loops5();
		obj.getPlusThree(50);
	}
}
