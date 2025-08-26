package com.foreachloop;

class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

public class ObjectLoop {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Amit"),
            new Student("Sneha"),
            new Student("Raj")
        };

        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}


