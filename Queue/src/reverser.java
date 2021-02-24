import java.util.Queue;
import java.util.Stack;

public class reverser {

	public reverser() {
		// TODO Auto-generated constructor stub
			
		}
	
	public static void queueReverser(Queue<Integer> queue) {
		Stack<Integer> stack=new Stack<>();
		
		while(!queue.isEmpty()){
			stack.push(queue.remove());
		}
		
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		
		System.out.println(queue);
		
	}

}
