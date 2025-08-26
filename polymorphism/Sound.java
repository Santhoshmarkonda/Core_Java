package com.polymorphism;

class Animal{
	void makeSound() {
		System.out.println("some sound....");
	}
}

class Dog extends Animal{
	
	void makeSound() {
		System.out.println("Bark");
	}
}

class Cat extends Animal{
	
	void makeSound() {
		System.out.println("Meow");
	}
}

class Cow extends Animal{
	
	void makeSound() {
		System.out.println("Moo");
	}
}

public class Sound {
     public static void main(String[] args) {
		Animal a;
		
		a = new Dog();
		a.makeSound();
		
		a = new Cat();
		a.makeSound();
		
		a= new Cow();
		a.makeSound();
		
//		Animal[] animals = { new Dog(), new Cat(), new Cow() };
//
//        for (Animal a : animals) {
//            a.makeSound(); // Dynamic dispatch at runtime
//        }
	}
}
