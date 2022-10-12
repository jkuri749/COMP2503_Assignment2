package model;

public class StackNode<T> {
	
	private T data;
	private StackNode<T> next;
	
	public StackNode() {
		data = null;
	}
	
	/**
	 * @param data
	 */
	public StackNode(T data) {
		this.data = data;
	}
	
	/**
	 * getter for data
	 * @return the data
	 */
	public T getData() {
		return data;
	}
	
	/**
	 * setter for data value
	 * @param the value 
	 */
	public void setData(T value) {
		data = value;
	}
	
	/**
	 * setter for next StackNode
	 * @param other
	 */
	public void setNext(StackNode<T> other) {
		next = other;
	}
	
	/**
	 * getter for next StackNode
	 * @return next
	 */
	public StackNode<T> getNext(){
		return next;	
	}
}