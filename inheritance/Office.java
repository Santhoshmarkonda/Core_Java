package com.inheritance;

class Employee{
	String name;
	int empId;
	String department;
	
	Employee(){
		this("Santhosh",101,"R&D");
		System.out.println("Employee constructor called");
	}
	
	Employee(String name,int empId, String department){
		this.name = name;
		this.empId = empId;
		this.department = department;
	}
	
	void showDetails(){
		System.out.println("Name: "+name);
		System.out.println("ID: "+empId);
		System.out.println("Department: "+department);
	}
}

class Manager extends Employee{
	
	int teamSize;
	String project;
	
	Manager(){
		super();
		this.teamSize = 8;
		this.project = "Mars Rover AI";
		System.out.println("Manager constructor called");
	}
	
	@Override
	void showDetails() {
		super.showDetails();
		System.out.println("Team Size: "+teamSize);
		System.out.println("Project: "+project);
	}
}

class SeniorManager extends Manager{
	String level;
	
	SeniorManager(){
		super();
		this.level = "Senior";
		System.out.println("Senior Manager constructor called");
	}
	
	@Override
	void showDetails() {
		super.showDetails();
		System.out.println("Level: "+level);
	}
}

public class Office {
	
	public static void main(String[] args) {
		SeniorManager s = new SeniorManager();
		System.out.println();
		System.out.println("--- Employee Details ---");
		s.showDetails();
	}

}
