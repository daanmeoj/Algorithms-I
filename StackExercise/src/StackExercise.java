
public class StackExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomStack stack=new CustomStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		stack.pop();
//		System.out.println(stack.toString());
//		System.out.println(stack.peek());
//		System.out.println(stack.toString());
		twoStacks stack2=new twoStacks();
//		System.out.println(stack2.isEmpty1());
//		System.out.println(stack2.isEmpty2());
		stack2.push1(2);
		stack2.push1(2);
		stack2.push1(4);
		stack2.push1(6);
		stack2.push1(8);
		stack2.push2(1);
		stack2.push2(3);
		stack2.push2(5);
		stack2.push2(7);
		stack2.push2(9);
		stack2.pop1();
		stack2.pop1();
		stack2.pop1();
		stack2.pop1();
		stack2.pop1();
		stack2.push1(2);
		stack2.push1(2);
		stack2.push1(4);
		stack2.push1(6);
		stack2.push1(8);
		stack2.pop2();
		stack2.pop2();
		stack2.pop2();
		stack2.pop2();
		stack2.pop2();
		stack2.push2(1);
		stack2.push2(3);
		stack2.push2(5);
		stack2.push2(7);
		stack2.push2(9);
		stack2.pop2();
		stack2.pop2();
		stack2.pop2();
		stack2.pop2();
		stack2.pop2();
//		System.out.println(stack2.isEmpty2());
//		System.out.println(stack2.isFull1());
//		System.out.println(stack2.isFull2());
//		System.out.println(stack2.size2());
		min stack3=new min();
		stack3.push(40);
		stack3.push(5);
		stack3.push(60);
		stack3.push(3);
		System.out.println(stack3.min());
		System.out.println(stack3.pop());
		System.out.println(stack3.min());
	}

}
