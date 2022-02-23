package com.simplilearn.methodemo;

public class MethodDemo {
	
	public int method(int a,int b) {
		int add = a + b;
		return add;
	}

	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();
		System.out.println("Addition of number->" + md.method(56, 69));
	}

}
