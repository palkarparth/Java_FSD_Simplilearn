package com.simplilearn.constructor;

public class Constructor {
	// default constructor
	Constructor() {
		System.out.println("You are in default constructor");
	}
	
	void display() {
		System.out.println("This is method display");
	}
	
	// Parameterised Constructor
	int length;
	int breadth;
	int area;
	
	public Constructor(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
		area = this.length*this.breadth;
		System.out.println("You are in Parameterised constructor");
	}
	
	void method() {
		System.out.println("Area of rectangle is->" + area);
	}

	public static void main(String[] args) {
		Constructor c = new Constructor();
		c.display();
		Constructor c1 = new Constructor(10,15);
		c1.method();

	}

}
