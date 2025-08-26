package com.inheritance;

//constructor chaining in java
//the this() must be used at the start of the method
//we can not use this() in method
//programmer should declare this(), the compiler will not


class S{
	
	String name;
	String rollno;
	String branch;
	
	public S() {
		this("Santhosh");
		System.out.println("Non-Parameterized Constructor invoked");
	}
	
	public S(String name) {
		this(name,"21B21A45A6");
		System.out.println(name);
		System.out.println("Single parameterized constructor invoked");
	}
	public S(String name, String rollno) {
		this(name,rollno,"AID");
		System.out.println(name);
		System.out.println(rollno);
		System.out.println("Double parameterized constructor invoked");
	}
	public S(String name, String rollno,String branch) {
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(branch);
		System.out.println("Triple parameterized constructor invoked");
	}
	
	public String toString() {
		return name+"\n"+rollno+"\n"+branch;
	}
}

public class Chaining {
    public static void main(String[] args) {
    	S s = new S("Lakshmi", "21B21A4531");
    	System.out.println();
    	System.out.print("Object s Details:\n"+s);
	}
}
