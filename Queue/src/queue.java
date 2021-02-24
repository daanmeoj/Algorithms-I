import java.util.ArrayDeque;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new ArrayDeque<>();
		q.add(10);
		q.add(9);
		q.add(8);
		q.add(7);
		q.add(6);
		q.add(30);
		int front=q.remove();
		System.out.println(front);
		System.out.println(q);
//		System.out.println(q.size());
		reverser r=new reverser();
		r.queueReverser(q);
	}

}
