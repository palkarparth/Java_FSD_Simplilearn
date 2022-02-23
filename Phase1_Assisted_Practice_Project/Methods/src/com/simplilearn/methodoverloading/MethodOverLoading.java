package com.simplilearn.methodoverloading;

public class MethodOverLoading {
	
    void area(int a , int b){
		
		int area = a*b;
		System.out.println("Area of Rectangle is : "+ area);
	}
	
	void area(int a){
		
		int area = a*a;
		System.out.println("Area of Square is : "+area);
	}
	
	void area (long a){
		
		long area = (long) (3.14*a);
		System.out.println("Area of Circle is : "+area);
	}

	public static void main(String[] args) {
		MethodOverLoading mol = new MethodOverLoading();

		mol.area(4, 6);
		mol.area(2);
		mol.area(5);

	}

}
