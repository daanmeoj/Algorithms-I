package buildingAQueue;

import java.util.Arrays;

public class Queue {
	private int[] items;
	private int count,R,F;
	
	
	
	public Queue(int capacity) {
		// TODO Auto-generated constructor stub
		items=new int[capacity];
		F=0;
		R=0;
	}
	
	public void enqueue(int item) {
		if(count>items.length)
			throw new IllegalStateException();
		items[R]=item;
		count++;
		R=(R+1)%items.length;
		
	}
	
	public int dequeue() {
        if(F==items.length-1) {
        	throw new IllegalStateException();
        }
        int item=items[F];
        items[F]=0;
        F=(F+1)%items.length;
        count--;
        return item;
        
	}
	

	
	public boolean isEmpty() {
		return count==0;
	}
	
	public void print() {
	
		for(int i=F;i<R;i++) {
			System.out.println(items[i]);
		}

	}
	
	@Override
	public String toString() {
		int[] content=Arrays.copyOfRange(items, 0, count);
		System.out.println("F: "+F);
		System.out.println("R: "+R);
		return Arrays.toString(content);
	}
}
