package com.loops;

public class Loops6 {
	
	public void getTable(int num) {
		for(int i=10;i>=1;i--) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}
    
	public static void main(String[] args) {
		Loops6 loop = new Loops6();
		loop.getTable(6);
	}
}
