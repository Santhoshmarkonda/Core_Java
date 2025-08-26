package com.inheritance;

class GrandParent{
	public GrandParent() {
		System.out.println("the grand parents");
	}
}

class Parent extends GrandParent{
	public Parent() {
		System.out.println("the parents");
	}
}
class Child extends Parent{
	public Child() {
		this("santhosh");
		System.out.println("child class constructor is invoked");
	}
	public Child(String name) {
		System.out.println(name +" is a child generation");
	}
}

public class Task {
    public static void main(String[] args) {
		new Child();
		System.out.println();
		new Parent();
		System.out.println();
		new GrandParent();
	}
}
