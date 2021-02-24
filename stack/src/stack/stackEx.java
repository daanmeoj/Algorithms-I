package stack;

import java.util.Stack;

public class stackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack);
		System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        String str="abcd";
        StringReverser reverser=new StringReverser();
        System.out.println(reverser.reverse(str));
        System.out.println(reverser.reverse(""));
        
	}

}
