package com.simplilearn.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[a-z]");
		Matcher matcher = pattern.matcher("Regular Expressions");
		while(matcher.find()) {
			System.out.println(matcher.start() + " " + matcher.group());
		}

	}

}
