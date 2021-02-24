import java.util.Arrays;

public class Array {
	private int[] items;
	private int count;
	
		public Array(int length) {
			items=new int[length];
		}
		
		public void print() {
			for(int i=0;i<count;i++) {
				System.out.println(items[i]);
			}
		}
		
		public void insert(int item) {
			if(items.length==count) {
			int [] tempArray=new int[count*2];
			for(int i=0;i<count;i++) {
				tempArray[i]=items[i];
			}
			items=tempArray;
			}
			items[count++]=item;
			
		}
		
		
		public void insertAt(int item, int index) {
			if(index<0 || index>=count)throw new IllegalArgumentException();
			
			int size;
			
			if(items.length+1==count) {
				size=count*2;
				}
			else {
				size=items.length;
			}
			
			
			int [] tempArray=new int[size];
			
			for(int i=0;i<index;i++) {
				tempArray[i]=items[i];
			}
			
			tempArray[index]=item;
			
			for(int i=index+1;i<size;i++) {
				tempArray[i]=items[i-1];
			}
			
			items=tempArray;
			count++;
			
			
		}
		
		public int elementAt(int index) {
			return items[index];
		}
		
		public int size() {
			return count;
		}
		
		public void removeAt(int index) {
			if(index<0 || index>=count)throw new IllegalArgumentException();
			
			for(int i=index;i<count;i++) {
				items[i]=items[i+1];
			}
			
			count--;
		}
		
		public int indexOf(int item) {
			for(int i=0;i<count;i++) {
				if(items[i]==item) {
					return i;
				}
			}
			return -1;
			
		}
		
		public int max() {
			int max=-1;
			for(int i=0;i<count;i++) {
				if(items[i]>max)
					max=items[i];
			}
			return max;
		}
		
		public int[] reverse() {
			int[] reverse=new int[count];
			int counter=count-1;
			for(int i=0;i<count;i++) {
			  reverse[i]=items[counter];
			  counter--;
			}
			
			return reverse;
		}
		
		public Array intersect(Array other) {
			Array inter=new Array(3);
			for(int i=0;i<count;i++) {
				for(int j=0;j<other.size();j++) {
					if(items[i]==other.elementAt(j)) {
						if(inter.indexOf(items[i])==-1) {
							inter.insert(items[i]);
						}
					}
				}
			}
			return inter;
		}
		
		
}
