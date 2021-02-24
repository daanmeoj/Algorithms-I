import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.remove(2);
		System.out.println(list.indexOf(20));
		System.out.println(list.contains(20));
		System.out.println(list.size());
		//list.toArray();
		System.out.println(list);
	}

}
