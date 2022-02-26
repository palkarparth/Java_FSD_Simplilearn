package com.simplilearn.myexception;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new MyException("This is my error message");
		} catch (MyException e) {
			System.out.println("Catch Block");
			System.out.println(e);
		}

	}

}
