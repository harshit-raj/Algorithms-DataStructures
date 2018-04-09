/**
 * 
 */
package edu.algo.ds;

import java.util.Iterator;

/**
 * @author harsh
 *
 */
public class HStackLinkedList<T> implements HStack<T>, Iterable<T> {
	
	private Node first = null;
	
	private class Node
	{
		T item;
		Node next;
	}
	

	/* (non-Javadoc)
	 * @see edu.algo.graphs.HStack#push(java.lang.String)
	 */
	public void push(T item) {
		Node temp = first;
		first = new Node();
		first.item = item;
		first.next = temp;

	}

	/* (non-Javadoc)
	 * @see edu.algo.graphs.HStack#pop()
	 */
	public T pop() {
		T item = first.item;
		first = first .next;
		return item;
	}

	/* (non-Javadoc)
	 * @see edu.algo.graphs.HStack#isEmpty()
	 */
	public boolean isEmpty() {
		return first == null;
	}

	/* (non-Javadoc)
	 * @see edu.algo.graphs.HStack#size()
	 */
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private class StackIterator implements Iterator<T>{
		
		private Node current = first;

		public boolean hasNext() {
			
			return current != null;
		}

		public T next() {
			T t = current.item;
			current = current.next;
			return t;
		}
		}


	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
