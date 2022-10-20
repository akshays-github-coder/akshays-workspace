package com.java.iterator.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

/*List interface is the child interface of Collection interface. It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.

List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.

To instantiate the List interface, we must use :

List <data-type> list1= new ArrayList();  
List <data-type> list2 = new LinkedList();  
List <data-type> list3 = new Vector();  
List <data-type> list4 = new Stack();  
There are various methods in List interface that can be used to insert, delete, and access the elements from the list.*/

public class ListInterface {

	public static void main(String args[]){  

		/*ArrayList
		The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types. The ArrayList class maintains the insertion order and is non-synchronized. The elements stored in the ArrayList class can be randomly accessed. Consider the following example.*/

		ArrayList<String> list = new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();
		System.out.println("*****Array List*****");
		while(itr.hasNext()){    
			System.out.println(itr.next());  
		}  

		/*
		 * LinkedList LinkedList implements the Collection interface. It uses a doubly
		 * linked list internally to store the elements. It can store the duplicate
		 * elements. It maintains the insertion order and is not synchronized. In
		 * LinkedList, the manipulation is fast because no shifting is required.
		 * 
		 * Consider the following example.
		 */

		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		Iterator<String> itr1 = al.iterator();
		System.out.println("*****Linked List*****"); 
		while(itr1.hasNext()){  
			System.out.println(itr1.next());  
		}  

		/*Vector
		Vector uses a dynamic array to store the data elements. It is similar to ArrayList. However, It is synchronized and contains many methods that are not the part of Collection framework.

		Consider the following example.*/

		Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator<String> itr2=v.iterator();  
		System.out.println("*****Vector*****");
		while(itr2.hasNext()){   
			System.out.println(itr2.next());  
		}
		
/*
 * Stack The stack is the subclass of Vector. It implements the
 * last-in-first-out data structure, i.e., Stack. The stack contains all of the
 * methods of Vector class and also provides its methods like boolean push(),
 * boolean peek(), boolean push(object o), which defines its properties.
 * 
 * Consider the following example.
 */

		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> itr3 = stack.iterator();
		System.out.println("*****Stack*****"); 
		while(itr3.hasNext()){  
		System.out.println(itr3.next());  
		}  
	}  
}  



