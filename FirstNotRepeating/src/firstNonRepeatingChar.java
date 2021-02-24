import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatingChar {
	char firstNonRepeatingChar;
	Map<Character, Integer> map=new HashMap<>();

	public char firstNonRepeating(String str) {
		int count;
		char[] chars=str.toCharArray();
		for(char c:chars) {
			if(c!=' ') {
				count=map.containsKey(c)? map.get(c):0;
				map.put(c,count+1);    
			}
			
		}
		
		for(char c:chars) {
			if(c!=' ')
				if(map.get(c)==1) {
					return c;
				}	
		}

		return Character.MIN_VALUE;
	}
	
	

}
