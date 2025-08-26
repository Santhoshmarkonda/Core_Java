package com.encapsulation;

public class Student {

	private String name;
	private int rollNumber;
	private int marks;
	private char grade;

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setMarks(int marks) {
		if (marks >= 90 && marks <= 100) {
			this.marks = marks;
			this.grade = 'A';
		} else if (marks >= 80 && marks < 90) {
			this.marks = marks;
			this.grade = 'B';
		} else if (marks >= 70 && marks < 80) {
			this.marks = marks;
			this.grade = 'C';
		} else if (marks >= 60 && marks < 70) {
			this.marks = marks;
			this.grade = 'D';
		} else if (marks >= 0 && marks < 60) {
			this.marks = marks;
			this.grade = 'F';
		} else
			System.out.println("Invalid marks");
	}

	public String getName() {
		return name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public int getMarks() {
		return marks;
	}

	public char getGrade() {
		return grade;
	}
	
	void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Marks: " + marks);
		System.out.println("Grade: " + grade);

	}

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("Santhosh");
		student1.setRollNumber(101);
		student1.setMarks(87);
		System.out.println("--- Student Details ---");
		student1.displayDetails();
	}

}
