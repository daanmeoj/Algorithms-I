package buildingAQueue;

public class QueueExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue(20);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.enqueue(10);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(14);
		q.enqueue(15);
		q.enqueue(16);
		q.enqueue(17);
		q.enqueue(18);
		q.enqueue(19);
		q.enqueue(20);
		System.out.println(q.dequeue());
		q.enqueue(21);
		q.enqueue(22);
		q.enqueue(22);
		q.enqueue(23);
		q.enqueue(24);
		q.dequeue();
		q.dequeue();
		System.out.println(q.toString());
		QueueUsingStack q2=new QueueUsingStack();
		q2.enqueue(4);
		q2.enqueue(5);
		q2.enqueue(6);
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		System.out.println(q2.peek());
		System.out.println(q2.dequeue());
	}

}
