package com.loops;

public class Loops9 {
    public void getDivisiblesOfFourAndSix(int n) {
    	for(int i=1;i<=n;i++) {
    		if(i%4==0 || i%6==0) {
    			System.out.print(i+" ");
    		}
    	}
    }
    
    public static void main(String[] args) {
		Loops9 loop = new Loops9();
		loop.getDivisiblesOfFourAndSix(50);
	}
}
