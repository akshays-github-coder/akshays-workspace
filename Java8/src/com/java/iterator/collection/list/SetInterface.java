package com.java.iterator.collection.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*Set Interface
Set Interface in Java is present in java.util package. It extends the Collection interface. It represents the unordered set of elements which doesn't allow us to store the duplicate items. We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.

Set can be instantiated as:

Set<data-type> s1 = new HashSet<data-type>();  
Set<data-type> s2 = new LinkedHashSet<data-type>();  
Set<data-type> s3 = new TreeSet<data-type>(); */ 

public class SetInterface {

	public static void main(String args[]){  

		/*HashSet
HashSet class implements Set Interface. It represents the collection that uses a hash table for storage. Hashing is used to store the elements in the HashSet. It contains unique items.

	Consider the following example. */

		//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		System.out.println("*****HashSet*****");
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  

		/*LinkedHashSet
		LinkedHashSet class represents the LinkedList implementation of Set Interface. It extends the HashSet class and implements Set interface. Like HashSet, It also contains unique elements. It maintains the insertion order and permits null elements.

		Consider the following example. */
		
		LinkedHashSet<String> set1=new LinkedHashSet<String>();  
		set1.add("Ravi");  
		set1.add("Vijay");  
		set1.add("Ravi");  
		set1.add("Ajay");  
		Iterator<String> itr1=set1.iterator();
		System.out.println("*****LinkedHashSet*****");
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		}  
		
		/*SortedSet Interface
		SortedSet is the alternate of Set interface that provides a total ordering on its elements. The elements of the SortedSet are arranged in the increasing (ascending) order. The SortedSet provides the additional methods that inhibit the natural ordering of the elements.

		The SortedSet can be instantiated as:

		SortedSet<data-type> set = new TreeSet();  
		TreeSet
		Java TreeSet class implements the Set interface that uses a tree for storage. Like HashSet, TreeSet also contains unique elements. However, the access and retrieval time of TreeSet is quite fast. The elements in TreeSet stored in ascending order.

		Consider the following example: */
		
		//Creating and adding elements  
		TreeSet<String> set11=new TreeSet<String>();  
		set11.add("Ravi");  
		set11.add("Vijay");  
		set11.add("Ravi");  
		set11.add("Ajay");  
		//traversing elements  
		Iterator<String> itr11=set11.iterator();  
		while(itr11.hasNext()){  
		System.out.println(itr11.next());  
		}  
	}
}
