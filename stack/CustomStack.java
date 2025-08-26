package com.stack;

public class CustomStack {
    public static void main(String[] args) {
		MinStack s = new MinStack();
		s.push(5);
		s.push(2);
		s.push(4);
		s.push(1);
		System.out.println(s.getMin());
		s.pop();
		System.out.println(s.getMin());
	}
}
