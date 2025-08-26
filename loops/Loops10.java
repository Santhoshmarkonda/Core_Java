package com.loops;

public class Loops10 {
    public int getCountOfNineDivisors(int n) {
    	
    	int count =0;
    	for(int i=1;i<=n;i++) {
    		if(i%9==0) {
    			System.out.print(i+" ");
    			count++;
    		}
    	}
    	return count;
    }
    
    public static void main(String[] args) {
		Loops10 loop = new Loops10();
		int result = loop.getCountOfNineDivisors(100);
		System.out.println("count: "+ result);
	}
}
