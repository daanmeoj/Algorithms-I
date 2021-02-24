import java.util.NoSuchElementException;

public class LinkedList {
	private Node first;
	private Node last;
	private int size;
	
	private class Node {
		private int value;
		private Node next;
		Node(int value){
			this.value=value;
		}
	}
	
	  public static LinkedList createWithLoop() {
		    LinkedList list = new LinkedList();
		    list.addLast(10);
		    list.addLast(20);
		    list.addLast(30);

		    // Get a reference to 30
		    Node node = list.last;

		    list.addLast(40);
		    list.addLast(50);

		    // Create the loop
		    list.last.next = node;

		    return list;
		  }
	  
	public void addLast(int item) {
		Node node=new Node(item);
		if(isEmpty()) 
			first=last=node;
		else {
			last.next=node;
			last=node;
		}
		size++;
		
	}
	
	public void removeFirst() {
		if(isEmpty())throw new NoSuchElementException();
		if(first==last) {
			first=last=null;
		}
		else {
			Node second=first.next;
			first.next=null;
			first=second;
		}
		size--;
	}
	
	public void addFirst(int item) {
		Node node=new Node(item);
		if(isEmpty()) 
			first=last=node;
		else {
			node.next=first;
			first=node;
		}
		size++;

	}
	
	public int indexOF(int item) {
		Node current=first;
		int index=0;
		while(current!=null) {
			if(current.value==item)
				return index;
			current=current.next;
			index++;
		}
		return -1;
	}
	
	public boolean contains(int item) {
	 return indexOF(item)!=-1;
	}
	
	private boolean isEmpty() {
		return first==null;
	}

	public Node getPrevious(Node node) {
		Node current=first;
		while(current!=null) {
			if(current.next==node)return current;
			current=current.next;
		}
		return null;
	}
	
	public void removeLast() {
		if(isEmpty())throw new NoSuchElementException();
		
		if(first==last) {
			first=last=null;
		}
		else {
			Node previous=getPrevious(last);
			last=previous;
			previous.next=null;
		}
		size--;
	}
	
	public int size() {
		return size;
	}
	
	public int[] toArray() {
		int[] array=new int[size];
		Node current=first;
		for(int i=0;i<size;i++) {
			array[i]=current.value;
			current=current.next;
		}
		return array;
	}
	
	public Node getLast() {
		Node current=first;
		while(current.next!=null) {
			current=current.next;
		}
		return current;
	}
	
	public void reverse() {
		if(isEmpty()) return;
		Node previous;
		Node newLast=last;
		Node temp;
		while(first.next!=null) {
			previous=getPrevious(last);
			last.next=previous;
			previous.next=null;
			last=previous;
		}
		temp=first;
		first=newLast;
		last=temp;
	}
	
	public void reverseByMosh() {
		if(isEmpty()) return;
		Node previous=first;
		Node current=first.next;
		while(current!=null) {
			Node next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		
		last=first;
		last.next=null;
		first=previous;
		
	}
	
	public int getKthFromTheEnd(int kth) {
		if(isEmpty())
			throw new IllegalStateException();
		Node target,finishing;
		target=first;
		finishing=first;
		int distance=kth-1;
		for(int i=0;i<distance;i++) {
			finishing=finishing.next;
			if(finishing==null)
				throw new IllegalArgumentException();
		}

		while(finishing.next!=null) {
		target=target.next;
		finishing=finishing.next;
		}
		
		return target.value;
	}
	
	public void printMiddle() {
	    if (isEmpty())
	        throw new IllegalStateException();
		Node finishing,middle,previous;
		finishing=middle=previous=first;
		while(finishing!=null && finishing.next!=null) {
			previous=middle;
			middle=middle.next;
			finishing=finishing.next.next;
		}
		if(finishing!=null){
			System.out.println(middle.value);
		}
		else {
			System.out.println(previous.value);
			System.out.println(middle.value);
		}
	}
	
	public boolean hasLoop() {
		Node slow,fast;
		slow=fast=first;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow)
				return true;
		}
		
		return false;
	}

}
