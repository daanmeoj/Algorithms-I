package setProject;

import java.util.HashSet;
import java.util.Set;

public class firstRepeatedChar {
	
	Set<Character> s=new HashSet<>();
	
	public char findChar(String str){
		
		for(char c:str.toCharArray()) {
			if(s.contains(c))
				return c;
			s.add(c);
		}
		
		return Character.MIN_VALUE;
	}
	

}
