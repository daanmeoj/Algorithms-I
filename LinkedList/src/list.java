import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addFirst(5);
		list.removeFirst();
		System.out.println(list);
		System.out.println(list.contains(10));
		System.out.println(list.indexOf(10));
		System.out.println(list.size());
		Object[] array=list.toArray();
		System.out.println(Arrays.toString(array));
	}

}