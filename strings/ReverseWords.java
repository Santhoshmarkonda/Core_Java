package com.strings;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "how are you";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        System.out.println("Reversed words in the string:");

        for (String word : words) {
            char[] chars = word.toCharArray();
            // Reverse the character array manually
            for (int i = chars.length - 1; i >= 0; i--) {
                System.out.print(chars[i]);
            }
            System.out.print(" ");
        }
    }
}
