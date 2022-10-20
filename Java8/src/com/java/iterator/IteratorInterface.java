package com.java.iterator;

public class IteratorInterface {
	
	/*Iterator interface
	Iterator interface provides the facility of iterating the elements in a forward direction only.
	
	There are only three methods in the Iterator interface. They are:

	No.	Method						Description
	1	public boolean hasNext()	It returns true if the iterator has more elements otherwise it returns false.
	2	public Object next()		It returns the element and moves the cursor pointer to the next element.
	3	public void remove()		It removes the last elements returned by the iterator. It is less used 
	
The Iterable interface is the root interface for all the collection classes. The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface also implement the Iterable interface.

It contains only one abstract method. i.e.,
Iterator<T> iterator()  

It returns the iterator over the elements of type T. */

}
