package com.classesandobject;

public class Department {
    static String departmentName = "HR";
    String employeeName;
    
    public static void main(String[] args) {
    	Department dep1 = new Department();
    	Department dep2 = new Department();
    	
    	dep1.employeeName = "John";
    	dep2.employeeName = "Alice";
    	
    	System.out.println("Department: "+departmentName);
    	System.out.println("Employee 1: "+dep1.employeeName);
    	System.out.println("Employee 2: "+dep2.employeeName);
    	
    	Department.departmentName = "Marketing";
    	
    	System.out.println("---------------------");
    	
    	System.out.println("Department: "+departmentName);
    	System.out.println("Employee 1: "+dep1.employeeName);
    	System.out.println("Employee 2: "+dep2.employeeName);
    }
}
