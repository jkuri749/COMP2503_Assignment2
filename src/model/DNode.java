package model;

public class DNode <T> {
	private T data;
    private DNode<T> next = null;
    private DNode<T> prev = null;   // previous link in list
    
    public DNode(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public DNode<T> getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(DNode<T> next) {
		this.next = next;
	}

	/**
	 * @return the previous
	 */
	public DNode<T> getPrev() {
		return prev;
	}

	/**
	 * @param previous the previous to set
	 */
	public void setPrev(DNode<T> previous) {
		this.prev = previous;
	} 
    
}
