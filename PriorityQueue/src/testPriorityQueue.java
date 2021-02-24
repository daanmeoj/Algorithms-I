import java.util.PriorityQueue;

public class testPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> q=new PriorityQueue<>();
		q.add(5);
		q.add(1);
		q.add(3);
		q.add(2);
		while(!q.isEmpty()) {
			System.out.println(q.remove());
		}
	}

}
