package com.loops;

public class Loops8 {
	
	public void getCubes(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print(i+"^3"+" = "+(i*i*i)+", ");
		}
	}
    
	public static void main(String[] args) {
		Loops8 loop = new Loops8();
		loop.getCubes(10);
	}
}
