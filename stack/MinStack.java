package com.stack;

import java.util.Iterator;
import java.util.Stack;

public class MinStack {

	Stack<Integer> s = new Stack<>();
	Iterator<Integer> i = s.iterator();

	public void push(int x) {
		s.push(x);
	}

	public int pop() {
		return s.pop();
	}

	public int top() {
		return s.peek();
	}

	public int getMin() {
		if (s.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        int min = s.peek();

        // Traverse the stack to find min
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i) < min) {
                min = s.get(i);
            }
        }
		return min;
	}
}
