package com.java.iterator.collection.list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

/*Queue Interface
Queue interface maintains the first-in-first-out order. It can be defined as an ordered list that is used to hold the elements which are about to be processed. There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.

Queue interface can be instantiated as:

Queue<String> q1 = new PriorityQueue();  
Queue<String> q2 = new ArrayDeque();  
There are various classes that implement the Queue interface, some of them are given below.*/

public class QueueInterface {

	public static void main(String args[]){ 
		
		/*PriorityQueue
The PriorityQueue class implements the Queue interface. It holds the elements or objects which are to be processed by their priorities. PriorityQueue doesn't allow null values to be stored in the queue.

	Consider the following example.*/

		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit Sharma");  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		System.out.println("*****PriorityQueue*****");
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}
		
		/*Deque Interface
		Deque interface extends the Queue interface. In Deque, we can remove and add the elements from both the side. Deque stands for a double-ended queue which enables us to perform the operations at both the ends.

		Deque can be instantiated as:
		Deque d = new ArrayDeque();  
		
		ArrayDeque
		ArrayDeque class implements the Deque interface. It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.

		ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.

		Consider the following example. */
		
		//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		System.out.println("*****ArrayDeque*****");
		//Traversing elements  
		for (String str : deque) {  
		System.out.println(str);  
		}  

	}
}