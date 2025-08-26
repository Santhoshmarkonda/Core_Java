package com.loops;

public class Loops3 {
	
	public int getEvenCount(int n) {
		int count = 0;
		
		for(int i=1;i<=n;i++) {
			if(i%2==0)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Loops3 loop = new Loops3();
		int result = loop.getEvenCount(50);
		System.out.println(result);
	}

}
