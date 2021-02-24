
public class twoStacks {
	
	private int [] items;
	private int top1,top2;
	private int peek1,peek2;
	private int count1,count2;
	
	public void print() {
		for(int i=0;i<items.length;i++) {
			System.out.println(items[i]);
		}
	}
	
	public twoStacks() {
		items=new int[10];
		top1=0;
		top2=1;
		count1=count2=0;
	}
	
	public void push1(int item) {
		if(count1>5) {
			throw new StackOverflowError();
		}
			
		items[top1]=item;
		count1++;
		if(top1<8)
			top1+=2;
	}
	
	public void push2(int item) {
		if(count2>5) {
			throw new StackOverflowError();
		}
			
		items[top2]=item;
		count2++;
		if(top2<9)
			top2+=2;
	}
	
	public int pop1() {
		if(isEmpty1())
			throw new IllegalStateException();
		int aux=top1;
		if(top1>0)
			top1-=2;
		items[aux]=0;
		count1--;
		return items[aux];
	}
	
	public int pop2() {
		if(isEmpty2())
			throw new IllegalStateException();
		int aux=top2;
		if(top2>1)
			top2-=2;
		items[aux]=0;
		count2--;
		return items[aux];
	}
	
	public boolean isEmpty1() {
		return count1==0;
	}
	
	public boolean isEmpty2() {
		return count2==0;
	}
	
	public boolean isFull1() {
		System.out.println("top1: "+top1);
		return count1==5;
	}
	
	public boolean isFull2() {
		System.out.println("top2: "+top2);
		return count2==5;
	}
	
	public int size1() {
		return count1;
	}
	
	public int size2() {
		return count2;
	}

}
