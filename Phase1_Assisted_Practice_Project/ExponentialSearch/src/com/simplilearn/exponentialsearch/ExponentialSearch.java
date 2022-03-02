package com.simplilearn.exponentialsearch;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 9, 12, 15, 20, 36 };
		int length = arr.length;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter you key->");

			int key = sc.nextInt();
			int outcome = exponentialSearch(arr, length, key);

			if (outcome < 0) {
				System.out.println("Element is not present in the array");
			} else {
				System.out.println("Element is  present in the array at index :" + outcome);
			}
		}
	}

	private static int exponentialSearch(int[] arr, int length, int value) {
		if (arr[0] == value) {
			return 0;
		}
		int i = 1;
		while (i < length && arr[i] <= value) {

			i = i * 2;
			break;
		}
		return Arrays.binarySearch(arr, i / 2, Math.min(i, length), value); // predefined methods
	}
}
