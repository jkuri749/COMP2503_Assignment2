package model;


public class DoublyLinkedList <T> {
	
	private DNode<T> start; // reference to the first node of the list
	private DNode<T> end; // reference to the last node of the list
	private int size;
	
	public DoublyLinkedList(){
        start = null;
        end = null;
        size = 0;
    }
	
	public DNode<T> getStart() {
		return start;
	}
	public DNode<T> getEnd() {
		return end;
	}
	public boolean isEmpty(){
        return start ==null;
    }
	
	/**
	 * Adds an item to the head
	 * @param item
	 */
	public void add(T item) {  
        //Create a new node  
        DNode<T> newNode = new DNode<T>(item);  
   
        //if list is empty, head and tail points to newNode  
        if(isEmpty()) {  
            start = end = newNode;  
            //start's previous will be null  
            start.setPrev(null);  
            //end's next will be null  
            end.setNext(null);  
        }  
        else {  
            //add newNode to the end of list. end->next set to newNode  
            end.setNext(newNode);  
            //newNode->previous set to end  
            newNode.setPrev(end);  
            //newNode becomes end 
            end = newNode;  
            //end's next point to null  
            end.setNext(null);  
        }  
    }
	
	/**
	 * removes an item from the top
	 * @param item
	 * @return
	 */
	public T remove() {  
        //Create a new node  
        DNode<T> newNode; 
        T data = null;
   
        if(start != null) {
            if(start.getNext() == null) {
                data = start.getData();
                start = null;
            }
            else {
            	//pointer points to start
                newNode = start;
                
                //gets data in the node
                data = start.getData();
                
                //makes next the start
                start = start.getNext();
                
                //removes the start
                newNode.setNext(null);
            }
        }
        return data;
    }
	
	public int length() {
		int length = this.size;
		return length;
	}
	
	/**
	 * prints Nodes
	 */
    public void print() {  
    	
        //Node current will point to head  
        DNode<T> last = null; 
        if(start == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Cards of doubly linked list: "); 
        
        while(start != null) {  
            //Print each node and then go to next.  
            System.out.println(start.getData() + " ");  
            last = start;
            start = start.getNext();
        }  
    }  
}
