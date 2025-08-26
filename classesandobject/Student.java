package com.classesandobject;

public class Student{

	static String collegeName = "Jntuh"; // single copy 

        String name;
        String address;
        long phno;
        
        public static void main(String [] args){
		Student student1 = new Student(); 
 		
                Student student2 = new Student();
		
		student1.name = "Rakesh";
		student1.address = "Abids";
                student1.phno = 123456;

		student2.name = "Jyothi";
		student2.address = "Jntuh";
		student2.phno = 123456789;
		
		System.out.println("College Name : " + collegeName);
		
		System.out.println("-------Student 1 Data--------");
		System.out.println("Student 1 Name : " + student1.name);
                System.out.println("Student 1 Address : " + student1.address);
                System.out.println("Student 1 Phone : " + student1.phno); 
		
		collegeName = "JNTUK";
		System.out.println(); 

		System.out.println("-------Student 2 Data--------");
		System.out.println("Student 2 Name : " + student2.name);
                System.out.println("Student 2 Address : " + student2.address);
                System.out.println("Student 2 Phone : " + student2.phno);       
                
        }
	
}




