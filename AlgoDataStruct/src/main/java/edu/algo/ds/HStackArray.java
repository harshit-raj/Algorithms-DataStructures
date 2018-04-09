package edu.algo.ds;

import java.util.Iterator;

public class HStackArray<T> implements HStack<T>, Iterable<T>{
	
	private T[] s;
	private int N = 0;
	
	

	public HStackArray() {
		s = (T[]) new Object[100];
	}

	public void push(T item) {
		s[N++] = item;

	}

	public T pop() {
		
		return s[--N];
	}

	public boolean isEmpty() {
		
		return N == 0;
	}

	public int size() {
		
		return N;
	}

	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
