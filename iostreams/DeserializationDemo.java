package com.iostreams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializationDemo {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("Student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student std = (Student) ois.readObject();
			fis.close();
			ois.close();
			System.out.println("Student object is Deserialized: " + std);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
