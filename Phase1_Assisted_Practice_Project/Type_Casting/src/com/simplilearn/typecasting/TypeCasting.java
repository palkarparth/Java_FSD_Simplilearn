package com.simplilearn.typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		System.out.println("Implicit Type Casting");
		char a = 'A';
		System.out.println(a);
		int b = a;
		System.out.println(b);
		float f = a;
		System.out.println(f);
		long c= a;
		System.out.println(c);
		double d = a;
		System.out.println(d);
		
		System.out.println("Explict Type Casting");
		double x=45.5;
		int e =(int)x;
		System.out.println(x);
		System.out.println(e);

		double ddd = 49734934734973.487873834784368;
		float ff = (float)ddd;
		int iii = (int)ff;
		System.out.println(ff);
		System.out.println(iii);

	}

}
