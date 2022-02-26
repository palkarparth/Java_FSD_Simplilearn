package com.simplilearn.exceptionalhandling;

public class UncheckedExceptionDemo {
	public static void main(String[] args) {
		int num = 100;
		int result = 0;

		System.out.println("Open File");
		System.out.println("Read File");
		System.out.println("Process Data");

		try {
			result = UncheckedExceptionDemo.div(50, 0); // main - caller
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.err.println("Sorry You can't div num by zeroRead file");
		}

		System.out.println(result);
		System.out.println("Close File");
	}

	public static int div(int num1, int num2) throws ArithmeticException { // callee
		return num1 / num2;
	}

}
