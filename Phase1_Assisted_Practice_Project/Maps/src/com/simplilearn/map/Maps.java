package com.simplilearn.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// HashMap
		System.out.println("**********HashMap**********");
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("1", "Hello");
		hm.put("2", "Welcome");
		hm.put("3", "To");
		hm.put("4", "Java FSD Program");
		System.out.println("The elements of HashMap are->");
		for (Map.Entry<String, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		// TreeMap
		System.out.println("**********TreeMap**********");
		TreeMap<String,Integer> tm = new TreeMap<>();
		tm.put("Student_1", 56);
		tm.put("Student_2", 96);
		tm.put("Student_3", 72);
		tm.put("Student_4", 89);
		tm.put("Student_5", 77);
		tm.put("Student_6", 45);
		System.out.println("The elements of TreeMap are->");
		for(String key: tm.keySet()){
				System.out.println(key  +" : "+ tm.get(key));
		}
		
		// HashTable
		System.out.println("**********HashTable**********");
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		      
		      ht.put(4,"John");  
		      ht.put(5,"Salman");  
		      ht.put(6,"SRK");  
		      ht.put(7,"Rock");  

		      System.out.println("The elements of HashTable are->");  
		      for(Map.Entry n:ht.entrySet()){    
		       System.out.println(n.getKey()+" "+n.getValue());    
		      }   

	}

}
