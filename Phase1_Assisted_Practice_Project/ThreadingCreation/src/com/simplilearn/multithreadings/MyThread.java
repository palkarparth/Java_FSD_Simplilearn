package com.simplilearn.multithreadings;

public class MyThread implements Runnable{
	
	static int y; // class-level variable
	int z; // instance variable ----> object-level variable

	public static void main(String[] args) { // main-thread
		int x; // local variable or thread-level variable
		System.out.println("Main() executed by main-thread");
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
	}

	@Override
	public void run() {
		System.out.println("Run() invoke");
	}

}
