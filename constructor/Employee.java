package com.constructor;

public class Employee {
    String name;
    double salary;
     
    public Employee(String eName, double eSalary) {
    	name = eName;
    	if(eSalary<0) {
    		salary = 0;
    	}
    	else
    		salary = eSalary;
    }
    
    public void displayDetails() {
    	System.out.println("Employee Name: "+name);
    	System.out.println("Emloyee Salary: "+salary);
    }
    
    public static void main(String[] args) {
		Employee emp = new Employee("suresh", 50000);
		emp.displayDetails();
	}
}
