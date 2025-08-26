package com.iostreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file = new File("newFile.txt");

		try {

			if (file.createNewFile()) {
				System.out.println(file.getName() + " is Created");
			} else
				System.out.println(file.getName() + " is already Exists");

			FileWriter fw = new FileWriter(file);
			fw.write("My name is M.Santhosh Kumar");
			fw.close();

			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
