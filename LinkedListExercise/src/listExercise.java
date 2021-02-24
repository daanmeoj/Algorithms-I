import java.util.Arrays;

public class listExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		
		list.addLast(10);
		System.out.println("size"+list.size());
		list.addLast(20);
		list.addLast(30);
		list.addFirst(16);
		list.addLast(100);
		System.out.println("size"+list.size());
		System.out.println(list.indexOF(16));
		System.out.println(list.contains(16));
		System.out.println(list.contains(100));
		System.out.println(list.contains(20));
		list.removeFirst();
		list.removeFirst();
		System.out.println("size"+list.size());
		System.out.println(list.contains(500));
		list.removeLast();
		System.out.println("size"+list.size());
		System.out.println(list.contains(500));
		list.reverse();
//		list.reverseByMosh();
		System.out.println(list.contains(500));
		list.addLast(50);
		list.addLast(60);
		System.out.println(Arrays.toString(list.toArray()));
		System.out.println(list.getKthFromTheEnd(0));
		System.out.println(list.getKthFromTheEnd(1));
		System.out.println(list.getKthFromTheEnd(-1));
		list.removeLast();
		list.removeLast();
		list.removeLast();
		list.removeLast();
		System.out.println(Arrays.toString(list.toArray()));
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
		list.addLast(7);
		list.addLast(8);
		list.addLast(9);
		list.addLast(10);
		System.out.println(Arrays.toString(list.toArray()));
	    list.printMiddle();
	    list.removeLast();
		list.removeLast();
		list.removeLast();
		list.removeLast();
		list.removeLast();
		list.removeLast();
		list.removeLast();
		list.removeLast();
		list.removeLast();
		System.out.println(Arrays.toString(list.toArray()));
		list.printMiddle();
//		list.removeLast();
//		list.printMiddle();
		LinkedList list2=LinkedList.createWithLoop();
		System.out.println(Arrays.toString(list2.toArray()));
		System.out.println(list2.hasLoop());
		System.out.println(list.hasLoop());
	}

}
