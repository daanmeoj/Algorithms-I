import java.util.Arrays;

public class min {

	private int [] items;
	private int [] minItems;
	private int count;
	private int min;
	
	public min() {
		items=new int[10];
		minItems=new int[10];
		min=100000;
	}
	
	public void push(int item) {
		if(items.length==count)
			throw new StackOverflowError();
	
		items[count]=item;
		if(item<min) {
			minItems[count++]=min=item;
		}
		else {
			minItems[count++]=min;
		}
	}
	
	public int min() {
		return minItems[count-1];
	}
	
	public int pop() {
		if(isEmpty())
			throw new IllegalStateException();
		return items[--count];
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
	@Override
	public String toString() {
		int[] content=Arrays.copyOfRange(minItems, 0, count);
		return Arrays.toString(content);
	}

}
