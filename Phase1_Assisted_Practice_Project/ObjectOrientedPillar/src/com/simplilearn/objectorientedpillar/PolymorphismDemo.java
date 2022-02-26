package com.simplilearn.objectorientedpillar;

public class PolymorphismDemo {
	public int Sub(int x, int y) {
		return (x - y);
	}

	public int Sub(int x, int y, int z) {
		return (x - y - z);
	}

	public double Sub(double x, double y) {
		return (x - y);
	}

	public static void main(String[] args) {
		PolymorphismDemo s = new PolymorphismDemo(); 
        System.out.println(s.Sub(100, 20)); 
        System.out.println(s.Sub(100, 20, 30)); 
        System.out.println(s.Sub(200.5, 20.5)); 

	}

}
