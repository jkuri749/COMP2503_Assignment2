package model;

public class DoublyLinkedList {
	
	private DNode<?> start; // reference to the first node of the list
	private DNode<?> end; // reference to the last node of the list
	//you can keep track of the current node if you want
	private DNode<?> current;// reference to the current node in the list
	private int size;
	
	
	/**
	 * @return the start
	 */
	public DNode<?> getStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	public void setStart(DNode<?> start) {
		this.start = start;
	}
	/**
	 * @return the end
	 */
	public DNode<?> getEnd() {
		return end;
	}
	/**
	 * @param end the end to set
	 */
	public void setEnd(DNode<?> end) {
		this.end = end;
	}
	/**
	 * @return the current
	 */
	public DNode<?> getCurrent() {
		return current;
	}
	/**
	 * @param current the current to set
	 */
	public void setCurrent(DNode<?> current) {
		this.current = current;
	}
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
}
