package com.simplilearn.lockerpvtltd.Main;

import java.util.Scanner;

public class WelcomeScreen {
	private void selectChoice() {
		// Code for Welcome Screen
		System.out.println("**********WELCOME TO LOCKER APPLICATION**********\n"
				+ "----------Developer Name:- Parth Palkar----------");
		Scanner scanner = new Scanner(System.in); // Scanner class
		System.out.println("====================Main Menu====================\n"
		        + "1.Retrive files in ascending order\n"
				+ "2.Businees level operation on files:-\n" +
				"  i.Add files\n" + "  ii.Delete files\n" + "  iii.Search files\n"
				+ "  iv.Go to Main Menu\n" + 
				"3.Close application.\n");
		
		System.out.print("Enter your choice->");
		int choice = scanner.nextInt(); // Taking input from user

		// Switch statement
		switch (choice) {
		case 1:

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
