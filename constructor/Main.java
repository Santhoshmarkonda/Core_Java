package com.constructor;

class Student{
    String name;
    int age;
    
    // Non-Parameterized constructor
    Student(){
    	System.out.println("Non Parameterized Constructor");
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student original) {
        this.name = original.name;
        this.age = original.age;
    }
    
    // if programmer have'nt mentioned any constructor java will provide a default constructor

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Santhosh", 21);  // Original object
        Student s3 = new Student("Lakshmi",21);
        Student s2 = new Student(s3);              // Copy object

        s1.display();  // Original
        s2.display();  // Copied
    }
}
