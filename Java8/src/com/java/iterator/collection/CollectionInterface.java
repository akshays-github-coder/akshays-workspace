package com.java.iterator.collection;

/*Collections in Java

The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).*/

public class CollectionInterface {
	
	/*Methods of Collection interface
	
	No.	Method	Description
	1	public boolean add(E e)	It is used to insert an element in this collection.
	2	public boolean addAll(Collection<? extends E> c)	It is used to insert the specified collection elements in the invoking collection.
	3	public boolean remove(Object element)	It is used to delete an element from the collection.
	4	public boolean removeAll(Collection<?> c)	It is used to delete all the elements of the specified collection from the invoking collection.
	5	default boolean removeIf(Predicate<? super E> filter)	It is used to delete all the elements of the collection that satisfy the specified predicate.
	6	public boolean retainAll(Collection<?> c)	It is used to delete all the elements of invoking collection except the specified collection.
	7	public int size()	It returns the total number of elements in the collection.
	8	public void clear()	It removes the total number of elements from the collection.
	9	public boolean contains(Object element)	It is used to search an element.
	10	public boolean containsAll(Collection<?> c)	It is used to search the specified collection in the collection.
	11	public Iterator iterator()	It returns an iterator.
	12	public Object[] toArray()	It converts collection into array.
	13	public <T> T[] toArray(T[] a)	It converts collection into array. Here, the runtime type of the returned array is that of the specified array.
	14	public boolean isEmpty()	It checks if collection is empty.
	15	default Stream<E> parallelStream()	It returns a possibly parallel Stream with the collection as its source.
	16	default Stream<E> stream()	It returns a sequential Stream with the collection as its source.
	17	default Spliterator<E> spliterator()	It generates a Spliterator over the specified elements in the collection.
	18	public boolean equals(Object element)	It matches two collections.
	19	public int hashCode()	It returns the hash code number of the collection. */

	

}
