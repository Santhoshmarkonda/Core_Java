package com.innerclasses;

interface Demo{
	abstract void display(String str);
}

public class AnonymousClass {
    public static void main(String[] args) {
		Demo d = new Demo() {
			@Override
			public void display(String str) {
				System.out.println(str);
			}	
		};
    	d.display("Santhosh kumar");
	}
}
