package com.simplilearn.diamondproblem;

public class TestTemp implements First, Second {
	
	public void show() {
		First.super.show();
		Second.super.show();
	}

	public static void main(String[] args) {
		TestTemp test = new TestTemp();
		test.show();

	}
}
