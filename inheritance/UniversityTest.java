package com.inheritance;

class Person {
    String name;
    int age;

    Person() {
        System.out.println("Person Constructor Called");
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person Constructor Called");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNumber;
    String course;

    Student() {
        this("Default", 0, 0, "None");
        System.out.println("Student Constructor Called");
    }

    Student(String name, int age, int rollNumber, String course) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.course = course;
        System.out.println("Student Constructor Called");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

class ResearchStudent extends Student {
    String researchArea;

    ResearchStudent(String name, int age, int rollNumber, String course, String researchArea) {
        super(name, age, rollNumber, course);
        this.researchArea = researchArea;
        System.out.println("ResearchStudent Constructor Called");
    }

    @Override
    void displayInfo() {
        System.out.println("\n--- Student Info ---");
        super.displayInfo();
        System.out.println("Research Area: " + researchArea);
    }
}

public class UniversityTest {
    public static void main(String[] args) {
        ResearchStudent rs = new ResearchStudent("Santhosh", 22, 101, "M.Tech", "Artificial Intelligence");
        rs.displayInfo();
    }
}
