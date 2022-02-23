package com.simplilearn.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Collections {

	public static void main(String[] args) {
		// Creating ArrayList
		System.out.println("**********ArrayList**********");
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Banglore");
		arr.add("Pune");
		arr.add("Nagpur");
		arr.add("Chandrapur");
		System.out.println(arr);
		
		// Creating LinkedList
		System.out.println("**********LinkedList**********");
		LinkedList<String> names = new LinkedList<String>();
		names.add("Parth");
		names.add("Pradnya");
		names.add("Sargam");
		names.add("Arshad");
		
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Creating HashSet
		System.out.println("**********HashSet**********");
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(11);
		set.add(22);
		set.add(33);
		set.add(44);
		set.add(55);
		set.add(66);
		System.out.println(set);
		
		// Creating LinkedHashSet
		System.out.println("**********LinkedHashSet**********");
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(121);
		set2.add(131);
		set2.add(141);
		set2.add(151);
		System.out.println(set2);
		

	}

}
