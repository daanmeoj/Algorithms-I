import java.util.Arrays;

public class ArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Array numbers=new Array(3);
			
			numbers.insert(10);
			numbers.insert(20);
			numbers.insert(30);
			numbers.insert(40);
			numbers.insert(50);
			numbers.insert(60);
			numbers.insert(20000);
//			numbers.print();
//			System.out.println("-");
			//numbers.removeAt(4);
//			System.out.println(numbers.indexOf(60)); 
//			System.out.println(numbers.max());
			//numbers.print();
			Array numbers2=new Array(3);
			numbers2.insert(10);
			numbers2.insert(200);
			numbers2.insert(300);
			numbers2.insert(20);
			numbers2.insert(20000);
			numbers2.insert(20000);
			numbers2.insert(20000);
			Array numbers3=numbers.intersect(numbers2);
//			numbers3.print();
			int[] numbers4=numbers3.reverse();
//			System.out.println(Arrays.toString(numbers4));
			numbers2.insertAt(4,6);
			numbers2.print();
			
			
			
			
	}

}
