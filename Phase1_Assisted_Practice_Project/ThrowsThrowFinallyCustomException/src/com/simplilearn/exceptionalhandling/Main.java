package com.simplilearn.exceptionalhandling;

public class Main {

	public static void main(String[] args) {
		// throw new ArithmeticException(); // explicitly raising expression
		System.out.println("Welcome to Mphasis Bank");
		int account[] = {101,102,103,104,105};
		String names[] = {"John","Parth","King","Tom","Smith"};
		double balance[] = {50000.0,456200.0,548215.0,65542.0,6584.0};
		for (int i = 0; i < account.length; i++) {
			System.out.println(account[i] + " " + names[i] + " " + balance[i]);
			if(balance[i] < 10000) {
				try {
					throw new LowBalance();
				} catch(LowBalance e) {
					System.err.println(names[i] + " your balance is low please deposit");
				}
				
			}
		}

	}

}
