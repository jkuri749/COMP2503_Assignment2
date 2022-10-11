package model;

public class DNode <T> {
	private T data;
    private DNode<?> next = null;
    private DNode<?> previous = null;   // previous link in list
    
    public DNode(T data) {
        this.setData(data);
        this.setNext(null);
        this.setPrevious(null);
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
	public DNode<?> getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(DNode<?> next) {
		this.next = next;
	}

	/**
	 * @return the previous
	 */
	public DNode<?> getPrevious() {
		return previous;
	}

	/**
	 * @param previous the previous to set
	 */
	public void setPrevious(DNode<?> previous) {
		this.previous = previous;
	} 
    
}
