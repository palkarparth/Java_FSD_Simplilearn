package com.simplilearn.lockerpvtltd.Main;

import java.io.File;
import java.util.Scanner;

public class BusinessLevelOperation {
	private void businessLevelOperation() {
		String fileDirectory = "D:\\LockerFiles";
		File files = new File(fileDirectory);
		System.out.println("1.Add Files\n" + "2.Delete Files\n" + "3.Search Files\n" + "4.Main Menu\n");
		System.out.print("Enter your choice->");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			AddFiles addFiles = new AddFiles();
			addFiles.display();
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;

		default:
			break;
		}
	}

	public void display() {
		businessLevelOperation();
	}

}
