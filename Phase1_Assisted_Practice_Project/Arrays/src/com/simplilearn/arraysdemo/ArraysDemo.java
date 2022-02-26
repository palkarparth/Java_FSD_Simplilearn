package com.simplilearn.arraysdemo;

public class ArraysDemo {

	public static void main(String[] args) {
        // syn1
		int arr1[] = {101,102,103,104,105};
		System.out.println(arr1.length);
		System.out.println(arr1);
		for (int i = 0; i < arr1.length; i++) { // normal loop
			System.out.println(arr1[i]);
		}
		System.out.println("******************************");
		// syn2
		int arr2[] = new int[10];
		System.out.println(arr2.length);
		System.out.println(arr2);
		arr2[0] = 111;
		arr2[1] = 222;
		arr2[2] = 333;
		arr2[3] = 444;
		arr2[4] = 555;
		arr2[5] = 666;
		arr2[6] = 777;
		arr2[7] = 888;
		arr2[8] = 999;
		arr2[9] = 1000;
		
//		for (int i = 0; i < arr2.length; i++) { // normal loop
//			System.out.println(arr2[i]);
//		}
		
		for (int i : arr2) {
			System.out.println(i);
		}
	}

}
