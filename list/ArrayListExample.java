package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 5, 3, 4, 5, 7, 8));

        nums.add(3);
        nums.remove(4);
        nums.set(4, null);
        nums.add(0, 1);

        System.out.println("List after modifications: " + nums);

        System.out.println("Element at index 0: " + nums.get(0));
        System.out.println("Contains 6: " + nums.contains(6));
        System.out.println("Index of 8: " + nums.indexOf(8));
        System.out.println("Last index of 5: " + nums.lastIndexOf(5));
        System.out.println("Size of list: " + nums.size());

        Object[] array = nums.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        System.out.println("Sublist (index 2 to 5): " + nums.subList(2, 5));

        Collections.reverse(nums);
        System.out.println("Reversed list: " + nums);

        nums.removeIf(e -> e == null);
        nums.sort(Integer::compareTo);
        System.out.println("Sorted list in ascending order: " + nums);

        nums.clear();
        System.out.println("Final list after clear(): " + nums);
    }
}
