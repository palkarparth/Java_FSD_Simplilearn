package com.simplilearn.myexception;

public class MyException extends Exception {
	String str1;
	public MyException(String str2) {
		str1 = str2;
	}
	@Override
	public String toString() {
		return "MyException [str1=" + str1 + "]";
	}
	
	

}
