package com.simplilearn.exceptionalhandling;

public class ExceptionalHandling {

	public static void main(String[] args) {
		System.out.println("Exception handling demo program starts here...");
		try {
			int arr[] = {10,20,30,40,50,60};
			String strArr = null;
			System.out.println(strArr.length());
		} catch(ArithmeticException e) {
			System.out.println("Denominator should not be zero while dividing number....");
			System.out.println("Error->" + e);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("User is trying to access index location outside the array boundary");
			System.out.println("Error->" + e);
		} catch(NullPointerException e) {
			System.out.println("User is trying to perform operations on null value");
			System.out.println("Error->" + e);
		} finally {
			System.out.println("This block always execute...");
		}
		System.out.println("Exception handling demo programs end here");
	}

}
