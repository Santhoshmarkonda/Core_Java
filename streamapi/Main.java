package com.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // 1. Filter Even Numbers
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(nums.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()));

        // 2. Convert Strings to Upper case
        List<String> names = Arrays.asList("john", "alice", "bob");
        System.out.println(names.stream().map(String::toUpperCase).collect(Collectors.toList()));

        // 3. Find Names Starting with "A"
        List<String> names2 = Arrays.asList("Anita", "Bob", "Alex", "John");
        System.out.println(names2.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList()));

        // 4. Count Elements Greater Than 50
        List<Integer> nums2 = Arrays.asList(10, 60, 45, 90, 30);
        System.out.println(nums2.stream().filter(x -> x > 50).count());

        // 5. Sort a List in Descending Order
        List<Integer> nums3 = Arrays.asList(5, 2, 9, 1, 7);
        System.out.println(nums3.stream().sorted((a,b)-> b - a).collect(Collectors.toList()));

        // 6. Find the First Element Greater Than 100
        List<Integer> nums4 = Arrays.asList(10, 40, 150, 90);
        nums4.stream().filter(x -> x > 100).findFirst().ifPresent(System.out::println);

        // 7. Remove Duplicates (keep order)
        List<Integer> nums5 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        System.out.println(nums5.stream().distinct().collect(Collectors.toList()));

        // 8. Calculate the Sum of All Elements
        List<Integer> nums6 = Arrays.asList(1, 2, 3, 4, 5);
        nums6.stream().reduce(Integer::sum).ifPresent(System.out::println);

        // 9. Find the Maximum Value
        List<Integer> nums7 = Arrays.asList(7, 3, 9, 1, 5);
        nums7.stream().max(Integer::compareTo).ifPresent(System.out::println);

        // 10. Join Strings with a Comma
        List<String> words = Arrays.asList("Java", "Streams", "API");
        System.out.println(words.stream().collect(Collectors.joining(", ")));
    }
}
