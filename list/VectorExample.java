package com.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>(Arrays.asList(1, 5, 3, 4, 5, 7, 8));

        nums.add(3);
        nums.remove(4);
        nums.set(4, null);
        nums.insertElementAt(0, 0); // equivalent to add(0, val)

        System.out.println("Vector after modifications: " + nums);

        System.out.println("Element at index 0: " + nums.firstElement());
        System.out.println("Last element: " + nums.lastElement());

        nums.removeIf(e -> e == null);
        nums.sort(Integer::compareTo);
        System.out.println("Sorted ascending: " + nums);
        
        Collections.reverse(nums);
        System.out.println(nums);
        
        nums.clear();
        System.out.println("After clear: " + nums);
    }
}
