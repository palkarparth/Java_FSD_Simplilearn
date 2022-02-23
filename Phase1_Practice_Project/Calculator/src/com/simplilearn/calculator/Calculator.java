package com.simplilearn.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double a,b,result;
		System.out.println("----- CALCULATOR -----"+"\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		a = sc.nextDouble();
		System.out.println("Enter Secound Number");
		b = sc.nextDouble();
		
			System.out.println("----- Select the Operation -----"+"\n");
			System.out.println("Enter 1 to Add the two number");
			System.out.println("Enter 2 to Sub the two number");
			System.out.println("Enter 3 to Mul the two number");
			System.out.println("Enter 4 to Div the two number");
			System.out.println("Enter 5 to Exit from application");
			
			System.out.println("Enter your Choice");
			int Choice = sc.nextInt();
			
			
			switch(Choice){
			
			case 1:
				
				result = a+b;
				System.out.println("The Addition of Two number = "+result );
				break;
				
			case 2:
				
				result = a-b;
				System.out.println("The Subtraction of Two number = "+result );
				break;
			
			case 3:
				
				result = a*b;
				System.out.println("The Multiplication of Two number = "+result );
				break;
				
			case 4:
				
				result = a/b;
				System.out.println("The Division of Two number = "+result );
				break;
				
			case 5:
				System.out.println("Exit");
				break;
				
			default :
					System.out.println("Enter the wrong choice" );
				
			}	
		}
		
	}

