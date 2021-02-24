package buildingAQueue;

import java.util.Stack;

public class QueueUsingStack {
	private Stack<Integer> inbox;
	Stack<Integer> outbox;
	
	public QueueUsingStack() {
		// TODO Auto-generated constructor stub
		inbox=new Stack<>();
		outbox=new Stack<>();
		
	}
	
	public void enqueue(int item) {
		inbox.push(item);
	}
	
	public int dequeue() {
		
		moveInboxtoOutbox();	
		return outbox.pop();
		
	}
	
	public int peek() {
		moveInboxtoOutbox();	
			
		return outbox.peek();
		
	}
	
	public boolean isEmpty() {
		return inbox.isEmpty() && outbox.isEmpty();
	}
	
	public void moveInboxtoOutbox() {
		if(isEmpty())
			throw new IllegalStateException();
		if(outbox.isEmpty()) 
			while(!inbox.isEmpty()) 
				outbox.push(inbox.pop());
	}

}
