package model;

import java.util.EmptyStackException;

/**
 * Linked stack class for shuffled cards
 * @author gurmangrewal
 *
 * @param <T>
 */
public class LinkedListStack<T> implements StackInterface <T>{
	
	@SuppressWarnings("hiding")
	private class StackNode<T> {
		private T value;
		private StackNode<T> next;
		private StackNode(T x, StackNode <T> n) {
			value = x; next = n;
		}
		
	}
	
	private StackNode<T> top;
	private int size;
	public LinkedListStack() {size = 0; top = null;}
	
	/**
	 * increases size of linked list and pushes value x to top of stack
	 */
	public void push(T x) {
		++size;
		top = new StackNode<T> (x, top);
	}
	
	/**
	 *  returns the top value and removes it from list, throws EmptyStackException if list is empty
	 */
	public T pop() {
		if (isEmpty()) throw new EmptyStackException();
		T x = top.value;
		top = top.next;
		size--;
		return x;
	}
	
	/**
	 * returns the top value, throws EmptyStackException if list is empty
	 */
	public T peek() {
		if (isEmpty()) throw new EmptyStackException();
		return top.value;
	}
	
	/**
	 * @return size equal to zero if stack is empty
	 */
	public boolean isEmpty() {
		return (size == 0);
	}
	
	/**
	 * @return size of stack
	 */
	public int size() {
		return size;
	}
}