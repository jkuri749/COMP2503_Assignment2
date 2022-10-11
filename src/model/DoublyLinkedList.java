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
	
	public boolean isEmpty(){
        return start ==null;
    }
	
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
	
	public int length() {
		int length = this.size;
		return length;
	}
}
