package com.java.concepts;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class JavaMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(100, "Akshay");
		map.put(101, "Amar");
		map.put(102, "Anna");
		
		//Elements can traverse in any order
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue() + " " + entry.hashCode());
		}
		
		System.out.println("\ncomparingByKey()");
		 //Returns a Set view of the mappings contained in this map 
		map.entrySet()
		
		//Returns a sequential Stream with this collection as its source  
		.stream()
		
		//Sorted according to the provided Comparator
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		
		//Performs an action for each element of this stream 
		.forEach(System.out::println);
		
		System.out.println("\ncomparingByValue()");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		System.out.println("\ncomparingByValue() in Descending Order");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1, "Mango");
		hashMap.put(2, "Apple");
		hashMap.put(3, "Banana");
		hashMap.put(4, "Grapes");
		hashMap.put(4, "Pineapple"); //trying duplicate key
		//You cannot store duplicate keys in HashMap. However, if you try to store duplicate key with another value, it will replace the value.
		
		System.out.println("\nIterating Hashmap..."); 
		
		for (Map.Entry entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}
		
		hashMap.putIfAbsent(6, "Litchi");
		
		System.out.println("\nAfter invoking putIfAbsent method");
		for (Map.Entry entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}
		
		System.out.println("\nAfter invoking putIfAbsent method using stream API");
		hashMap.entrySet().stream().forEach(System.out::println);
		
		System.out.println("\nAfter invoking putIfAbsent method with limit");
		hashMap.entrySet().stream().limit(2).forEach(System.out::println);
		
	}
}
