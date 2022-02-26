package com.simplilearn.strings;

public class StringDemo {

	public static void main(String[] args) {
		// Heap Memory
		String str1 = new String("Java");
		String str4 = new String("Java");
		// String Constant Pool
		String str2 = "Python";
		String str3 = "Python";
		
		System.out.println(str1.toString()); // print value
		System.out.println(str1.equals(str4)); // compare values
		System.out.println(str1 == str4); // compare hash_code
		
		System.out.println(str2.equals(str3)); // have same value
		System.out.println(str2 == str3); // have same hash_code
		
		str1 = str1.concat("Language");
		System.out.println(str1);
		
		str1 = str1.concat("Course");
		System.out.println(str1);

	}

}
