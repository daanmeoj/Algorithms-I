
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomHashTable table=new CustomHashTable();
		table.put(6, "A");//1
		table.put(8, "B");//3
		table.put(11, "C");//1
		table.put(6, "A+");//1
		table.remove(6);
		table.remove(60);
		System.out.println(table.get(6));
		System.out.println(table.get(12));
	}

}
