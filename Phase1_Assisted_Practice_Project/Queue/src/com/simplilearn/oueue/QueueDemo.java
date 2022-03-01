package com.simplilearn.oueue;

import java.util.*;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> locationsQueue = new LinkedList<>();
		locationsQueue.add("Pune");
		locationsQueue.add("Nagpur");
		locationsQueue.add("Delhi");
		locationsQueue.add("Chandrapur");
		locationsQueue.add("Mumbai");
		System.out.println("Size of Queue : " + locationsQueue.size());
		System.out.println("Queue is : " + locationsQueue);
		System.out.println("Head of Queue : " + locationsQueue.peek()); // displaying head of queue
		locationsQueue.remove();
		System.out.println("After removing Head of Queue : " + locationsQueue);
		System.out.println("Size of Queue : " + locationsQueue.size());
	}

}
