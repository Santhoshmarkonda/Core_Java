package com.scannerclass;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		String lastName = sc.nextLine();
		double salary = sc.nextDouble();
		int age = sc.nextInt();
		String gender = sc.next();

		
		
		System.out.println("Name: "+name);
		System.out.println("First Name: "+lastName);
		System.out.println("Salary: "+ salary);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		
		sc.close();
	}

}
