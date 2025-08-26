package com.example;

public class Numbers {
    
    public static void printNumbers(int n) {
        if (n >= 2 && n <= 10) {
            System.out.println(n);
            printNumbers(n - 1);
        }
    }

    public static void main(String[] args) {
        printNumbers(10);
    }
}
