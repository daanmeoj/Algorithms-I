package setProject;

import java.util.HashSet;
import java.util.Set;

public class setTes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<>();
		int[] numbers= {1,1,1,1,2,3,4,4,4,4,4,3};
		for(int number:numbers) {
			set.add(number);
		}
		System.out.println(set);
	}

}
