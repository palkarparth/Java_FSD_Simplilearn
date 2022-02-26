package com.simplilearn.strings;

public class StringBufferBuilder {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Java");
		StringBuffer sb2 = new StringBuffer("Language");
		sb2.reverse();
		System.out.println(sb2);
		sb1.append(sb2); // adding sb2 value in sb1
		System.out.println(sb1);
		
		String s1 = new String("Parth");
		StringBuilder sbd = new StringBuilder(s1); // string to stringBuilder
		String str2 = sb2.toString(); // StringBuffer to String
	}

}
