package com.example;

public class FactorialNumbers {

    public static void factorial(int num){
        System.out.print(num+" ");
        if(num < 100)
            factorial(num+1);
    }
    public static void main(String[] args){
         factorial(1);
    }
}
