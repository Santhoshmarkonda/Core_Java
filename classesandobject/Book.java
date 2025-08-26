package com.classesandobject;

public class Book {
     String title;
     String author;
     double price;
     
     Book(){
    	 title = "Unknown";
    	 author = "Anonymous";
    	 price = 100.0;
     }
     
     Book(String t, String a, double p){
    	 title = t;
    	 author = a;
    	 price = p;
     }
     
     Book(Book b){
    	 title = b.title;
    	 author = b.author;
    	 price = b.price;
     }
     
     void showDetails() {
    	 System.out.println("Title: "+title);
    	 System.out.println("Author: "+author);
    	 System.out.println("Price: "+price);
     }
     
     public static void main(String[] args) {
		 Book book1 = new Book();
		 Book book2 = new Book("The Java Handbook","Santhosh Kumar",499.99);
		 Book book3 = new Book(book2);
		
		 System.out.println("Book 1:");
		 book1.showDetails();
		 System.out.println();
		 System.out.println("Book 2:");
		 book2.showDetails();
		 System.out.println();
		 System.out.println("Book 3:");
		 book3.showDetails();
	}
}
