package com.loops;

public class Loops1 {
	
	public void getDivisiblesOfThreeAndFive() {
		for(int i =1;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+" ");
			}
		}
	}
    
	public static void main(String[] args) {
		Loops1 loop = new Loops1();
		loop.getDivisiblesOfThreeAndFive();
	}
}
