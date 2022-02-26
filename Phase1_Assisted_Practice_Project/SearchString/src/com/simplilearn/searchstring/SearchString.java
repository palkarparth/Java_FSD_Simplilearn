package com.simplilearn.searchstring;

import java.util.Arrays;
import java.util.List;

public class SearchString {

	public static void main(String[] args) {
		String words[] = new String[] { "C++", "Java", "C", "Python" };

		List<String> wordsList = Arrays.asList(words);
		String search = "Java";
		if (wordsList.contains(search)) {
			System.out.println("The word '" + search + "' present in string array");
		} else {
			System.out.println("The word '" + search + "' is not present in string array");
		}

	}

}
