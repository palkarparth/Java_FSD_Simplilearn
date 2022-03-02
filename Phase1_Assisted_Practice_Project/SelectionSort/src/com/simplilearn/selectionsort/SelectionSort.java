package com.simplilearn.selectionsort;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 41, 36, 21, 4, 19, 01, 68, 28, 11, 99, 54 };
		int length = arr.length;
		selectionSort(arr);
		System.out.println("The sorted elements are:");
		for (int element : arr) {
			System.out.println(element);
		}
	}

	public static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {

					index = j;
				}
			}
			int smallNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallNumber;
		}
	}
}
