package com.simplilearn.methodcallbyvalue;

public class MethodCallByValue {
	
	int value = 250;
	
	int operation(int value) {
		value = (value * 10) / 100;
		return (value);
	}
	
	public static void main(String[] args) {
		MethodCallByValue obj = new MethodCallByValue();
		System.out.println("Before operation value of data is->" + obj.value);
		int val = obj.operation(190);
		System.out.println("After operation value of data is->" + val);
	}

}
