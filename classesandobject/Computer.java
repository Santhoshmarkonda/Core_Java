package com.classesandobject;

public class Computer {
	
	static String os = "windows";
	String ram;

	public static void main(String[] args) {
        System.out.println("OS: "+Computer.os);
        
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        
        computer1.ram = "8GB";
        computer2.ram = "16GB";
        
        System.out.println("Computer 1 RAM: "+computer1.ram);
        System.out.println("Computer 2 RAM: "+computer2.ram);
        
	}

}
