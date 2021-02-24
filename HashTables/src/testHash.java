import java.util.HashMap;
import java.util.Map;

public class testHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "Mosh");
		map.put(2, "David");
		map.put(3, "Carlos");
		map.put(3, "Alberto");
		map.put(null, null);
		map.remove(null);
		System.out.println(map.get(3));
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("Carlos"));
		System.out.println(map);
		
		for(int item:map.keySet()) {
			System.out.println(item);
		}
		
	}

}
