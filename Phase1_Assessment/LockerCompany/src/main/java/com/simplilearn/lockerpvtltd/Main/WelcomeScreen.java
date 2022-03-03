package com.simplilearn.lockerpvtltd.Main;

import java.util.Scanner;

public class WelcomeScreen {
	private void selectChoice() {
		// Code for Welcome Screen

		Scanner scanner = new Scanner(System.in); // Scanner class
		System.out.println("====================Main Menu====================\n" + "1.Retrive files\n"
				+ "2.Businees level operation on files:-\n" + "  i.Add files\n" + "  ii.Delete files\n"
				+ "  iii.Search files\n" + "  iv.Go to Main Menu\n" + "3.Close application.\n");

		System.out.print("Enter your choice->");
		int choice = scanner.nextInt(); // Taking input from user

		// Switch statement
		switch (choice) {
		case 1:
			RetrieveFile retrieveFiles = new RetrieveFile();
			retrieveFiles.display(); // displaying retrieve files class
			System.out.println("\n");
			display(); // displaying welcome screen
			break;

		case 2:

			break;
		case 3:

			break;

		default:
			break;
		}
	}

	public void display() {
		selectChoice();
	}
}
