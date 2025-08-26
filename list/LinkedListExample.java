package com.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(1, 5, 3, 4, 5, 7, 8));

        nums.add(3);
        nums.remove(4);
        nums.set(4, null);
        nums.addFirst(0);
        nums.addLast(10);

        System.out.println("LinkedList after modifications: " + nums);

        System.out.println("First element: " + nums.getFirst());
        System.out.println("Last element: " + nums.getLast());
        System.out.println("Removed first: " + nums.removeFirst());
        System.out.println("Removed last: " + nums.removeLast());

        nums.removeIf(e -> e == null);
        nums.sort(Integer::compareTo);
        System.out.println("Sorted ascending: " + nums);

        Collections.reverse(nums);
        System.out.println(nums);
        
        nums.clear();
        System.out.println("After clear: " + nums);
    }
}
