package com.classesandobject;

public class Demo {
	public static int a;
        public int b;

	public void displayDetails(){
		System.out.println(a);
		System.out.println(b);
        }
	
	public static void main(String [] args){
		Demo obj1 = new Demo();
		Demo obj2 = new Demo();
		System.out.println(a);
		System.out.println(obj1.b);
		
		a = 30;
		obj1.b = 45;
		
		System.out.println(a);	
		System.out.println(obj2.b);
		
		obj2.b = a + Demo.a;
		Demo.a = obj2.b;
		
		System.out.println(a);
		System.out.println(obj1.b);
		obj1.displayDetails();
		obj2.displayDetails();
	}
}