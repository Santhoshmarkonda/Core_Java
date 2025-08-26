package com.loops;

public class Loops7 {
	
	public void getNotDivisiblesOfFour() {
		for(int i=1;i<=100;i++) {
			if(i%4!=0) {
				System.out.print(i+" ");
			}
		}
	}
    public static void main(String[] args) {
	    Loops7 obj = new Loops7();
	    obj.getNotDivisiblesOfFour();
    }
}
