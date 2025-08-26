package com.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();
        nums.addAll(Arrays.asList(1, 5, 3, 4, 5, 7, 8));

        nums.push(3);
        nums.remove(4);
        nums.set(4, null);
        nums.push(0); // push is stack-specific

        System.out.println("Stack after modifications: " + nums);

        System.out.println("Top of stack (peek): " + nums.peek());
        System.out.println("Popped element: " + nums.pop());

        nums.removeIf(e -> e == null);
        nums.sort(Integer::compareTo);
        System.out.println("Sorted ascending: " + nums);

        Collections.reverse(nums);
        System.out.println(nums);
        
        nums.clear();
        System.out.println("After clear: " + nums);
    }
}
