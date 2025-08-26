package com.iostreams;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}

public class SerializationDemo {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Santhosh");

		try {
			FileOutputStream fos = new FileOutputStream("Student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(s1);
			fos.close();
			oos.close();

			System.out.println("Student object has Serialized");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
