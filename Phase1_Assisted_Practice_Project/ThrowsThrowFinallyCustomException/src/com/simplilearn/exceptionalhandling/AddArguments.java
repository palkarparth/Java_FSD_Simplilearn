package com.simplilearn.exceptionalhandling;

public class AddArguments {

	public static void main(String[] args) {
		int sum = 1;
		int num1 = 5;
		int num2 = 0;
		int result = num1 / num2;
		try {
			for (int i = 0; i < args.length; i++) {
				sum += Integer.parseInt(args[i]);
			}
			System.out.println("Sum = " + sum);
		} catch (NumberFormatException e) {
			System.err.println("One of the command line" + " arguments is not an interger");
		} finally {
			// nested try catch
			try {
				result = UncheckedExceptionDemo.div(50, 0); // main - caller
			} catch (ArithmeticException e) {
				// e.printStackTrace();
				System.err.println("Sorry You can't div num by zeroRead file");
			}
			// code which mandatory to execute irrespective of exp
			System.out.println("Finally Block executed");
		}

	}

}
