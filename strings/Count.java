package com.strings;

public class Count{
    public static void countVowels(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        String newStr = str.toLowerCase();

        for (int i = 0; i < newStr.length(); i++) {
            char ch = newStr.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        String str = "Santhosh";
        countVowels(str);
    }
}
