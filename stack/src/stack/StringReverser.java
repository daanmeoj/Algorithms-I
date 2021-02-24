package stack;

import java.util.Stack;

public class StringReverser {
		public String reverse(String str){
			if(str==null)
				throw new IllegalArgumentException();
			
			StringBuffer reverseStr=new StringBuffer();
	        Stack<Character> strStack=new Stack<>();
	        
	        for (int i = 0; i < str.length(); i++) {
				strStack.push(str.charAt(i));
			}
	        while(!strStack.isEmpty()) {
	        	reverseStr.append(strStack.pop());
	        }
	       return reverseStr.toString();
		}
}
