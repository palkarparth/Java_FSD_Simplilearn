package com.simplilearn.binarysearch;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 9, 15, 18, 40, 69 };
		int len = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter key element to be search->");
		int key = sc.nextInt();
		binarySearch(arr, 0, len, key);

	}

	public static int binarySearch(int arr[], int start, int end, int key) { // Binary Search Program
		int midValue = (start + end) / 2;
		while (start <= end) {

			if (arr[midValue] < key) {
				start = midValue + 1;
			} else if (arr[midValue] == key) {
				System.out.println("Element is found at index :" + midValue);
				break;
			} else {

				end = midValue - 1;
			}
			midValue = (start + end) / 2;
		}
		if (start > end) {

			System.out.println("Element is not found");
		}
		return midValue;
	}
}
