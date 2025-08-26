package com.example;

import java.io.*;

class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private transient String branch; // transient: will not be serialized

	public Student(int id, String name, String branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Santhosh", "AI & DS");

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
			oos.writeObject(s1);
			System.out.println("Serialization successful...");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
			Student deserializedStudent = (Student) ois.readObject();
			System.out.println("Deserialization successful...");
			System.out.println(deserializedStudent);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
