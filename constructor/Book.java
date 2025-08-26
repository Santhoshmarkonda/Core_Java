package com.constructor;

public class Book {
	String title;
	String author;
	
	public Book(String bTitle,String bAuthor) {
		title = bTitle;
		author = bAuthor;
	}
	
	public void display() {
		System.out.println("Book Title: " +title);
		System.out.println("Book Author: "+author);
	}
	
    public static void main(String[] args) {
		Book book1 = new Book("48 laws of power","Robert Brown");
		book1.display();
	}
}
