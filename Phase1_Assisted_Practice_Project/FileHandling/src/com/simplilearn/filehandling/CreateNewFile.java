package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateNewFile {

	public static void main(String[] args) {
		File file = new File("src/test.txt");

		try {
			System.out.println("Is new file created " + file.createNewFile());
			FileWriter writer = new FileWriter(file, true);
			writer.write(
					"In Java, with the help of File Class, we can work with files. This File Class is inside the java.io package. The File class can be used by creating an object of the class and then specifying the name of the file.\r\n"
							+ "\r\n" + "Why File Handling is Required?\r\n" + "\r\n"
							+ "File Handling is an integral part of any programming language as file handling enables us to store the output of any particular program in a file and allows us to perform certain operations on it.\r\n"
							+ "In simple words, file handling means reading and writing data to a file.");
			writer.flush();
			
			FileInputStream reader = new FileInputStream(file);
			int num = 0;
			while((num = reader.read()) != -1) {
				System.out.print((char)num);
			}
			
			boolean isFileDeleted = file.delete();
			Files.deleteIfExists(Paths.get("src/test.txt"));
			System.out.println("\n" + isFileDeleted);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
