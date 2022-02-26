package com.simplilearn.arraysdemo;

public class MultipleArray {

	public static void main(String[] args) {
		// follow B-Tree
		int[][] arr = {
				      {2,4},
				      {12,14},
				      {45,56}
				      };
		System.out.println(arr); // hash code of 2-D array 
		System.out.println(arr[0]); // hash code of 1-D array
		System.out.println(arr[1][1]); // actual value
		
		int[][] arr2 = new int[3][];
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		arr2[2] = new int[4];
 
	}

}
