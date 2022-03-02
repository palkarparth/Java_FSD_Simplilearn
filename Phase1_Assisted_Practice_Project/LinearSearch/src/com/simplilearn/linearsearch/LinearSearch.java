package com.simplilearn.linearsearch;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = { 100, 200, 300, 400, 500, 600, 700 };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element to be search->");
		int element = sc.nextInt();
		int result = linearSearch(arr, element);
		if (result == -1) {
			System.out.println("Element not found.");
		} else {
			System.out.println("Element found at index->" + result);
		}
	}

	public static int linearSearch(int arr[], int element) {
		int len = arr.length;
		int index = -1;
		for (int i = 0; i < len; i++) {
			if (arr[i] == element) { // if element found in given array
				index = i; // index value will update
				break;
			}
		}

		return index; // if element not found return -1
	}

}
