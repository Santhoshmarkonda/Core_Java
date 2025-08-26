package com.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> original = new Stack<>();
        original.push(10);
        original.push(20);
        original.push(30);
        original.push(40);

        Stack<Integer> reversed = new Stack<>();

        while (!original.isEmpty()) {
            reversed.push(original.pop());
        }

        System.out.println(reversed); // Output: [40, 30, 20, 10]
    }
}
