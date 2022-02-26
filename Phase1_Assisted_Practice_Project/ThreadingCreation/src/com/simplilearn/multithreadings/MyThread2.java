package com.simplilearn.multithreadings;

public class MyThread2 extends Thread {

	public static void main(String[] args) { // main-thread
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Main-Thread");
//		}
		MyThread2 mt1 = new MyThread2();
		mt1.setName("Child1");
		mt1.setPriority(5);
	//  System.out.println(mt1);
		
		MyThread2 mt2 = new MyThread2();
		mt2.setName("Child2");
		mt2.setPriority(5);
		mt1.start();
		mt2.start();
	}
	
	@Override
	public void run() { // child thread
		
		System.out.println("Run() from current class");
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()); // currently executing thread object
		}
	}

}
