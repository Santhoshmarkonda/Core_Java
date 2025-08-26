package com.innerclasses;

public class Student {
	
	String name;
	int rollNumber;
	
	Student(String name,int rollNumber){
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	void displayDetails() {
		System.out.println("Student Name: "+name);
		System.out.println("Student RollNumber: "+rollNumber);
	}
	
	class Marks{
		int subject1,subject2,subject3;
		
		Marks(int subject1,int subject2,int subject3){
			this.subject1 = subject1;
			this.subject2 = subject2;
			this.subject3 = subject3;
		}
		
		void calculateGrade() {
			double average = (subject1+subject2+subject3)/3;
			if(average>= 90) {
				System.out.println("Grade A");
			}else if(average>= 75 && average <=89) {
				System.out.println("Grade B");
			}else if(average>= 60 && average <=74) {
				System.out.println("Grade C");
			}else {
				System.out.println("Grade D");
			}
		}
	}
	
	public static void main(String[] args) {
		Student student1 = new Student("Arjun",21);
		Student.Marks marks = student1.new Marks(45,56,78);
		
		student1.displayDetails();
		marks.calculateGrade();
	}

}
