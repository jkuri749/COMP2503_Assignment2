package model;

public interface StackInterface<T> {
	
	// calls push method
	public void push(T x);
	
	// calls pop method
	public T pop();
	
	// calls peek method
	public T peek();
	
	// calls isEmpty method
	public boolean isEmpty();
	
	// calls size method
	public int size();
}