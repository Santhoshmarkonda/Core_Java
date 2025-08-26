package com.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Problem5 {

    public static void main(String[] args) {
        Queue<Integer> nums = new ArrayDeque<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(2);
        nums.add(1);

        List<Integer> list = new ArrayList<>(nums);
        boolean isPalindrome = true;

        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals(list.get(list.size() - 1 - i))) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
