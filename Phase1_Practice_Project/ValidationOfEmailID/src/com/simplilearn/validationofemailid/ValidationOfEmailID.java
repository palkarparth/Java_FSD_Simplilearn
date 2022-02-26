package com.simplilearn.validationofemailid;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfEmailID {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email Id->");
		String emailId = sc.nextLine();
		Pattern pattern = Pattern.compile(
				"^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$");
		if (pattern.matcher(emailId).matches()) {
			System.out.println(emailId + " is valid email Id");
		} else {
			System.out.println(emailId + " is not valid email Id.\n Please try again");
		}

	}

}
