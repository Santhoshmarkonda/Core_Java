package com.loops;

public class Loops2 {
	
	public void printTable(int num) {
		for(int i = 1;i<=10;i++) {
			System.out.print(num*i+" ");
		}
	}
	
    public static void main(String[] args) {
    	Loops2 loop = new Loops2();
    	loop.printTable(7);
    }
}
