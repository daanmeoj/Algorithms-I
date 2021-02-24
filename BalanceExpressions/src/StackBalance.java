import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackBalance {
	
	 private List<Character> leftBrackets=Arrays.asList('(','<','[','{');
	 private List<Character> rightBrackets=Arrays.asList(')','>',']','}');
	
		public boolean stringIsBalance(String str) {
			 Stack<Character> strStack=new Stack<>();
			 for(char ch: str.toCharArray()) {
				 if(isLeftBracket(ch)) 
					 strStack.push(ch);
				 
				 else if(isRightBracket(ch)) {
					 if(strStack.isEmpty())
						 return false;
					 
					 char top=strStack.pop();
					 if(!bracketsMatch(top,ch))
						 return false;
				 }	 
			 }
			 
			 return strStack.isEmpty();
		}
		
		private boolean isLeftBracket(char ch) {
			 return leftBrackets.contains(ch);
		}
		
		private boolean isRightBracket(char ch) {
			return rightBrackets.contains(ch);
		}
		
		private boolean bracketsMatch(char left, char right) {
			return leftBrackets.indexOf(left)==rightBrackets.indexOf(right);
		}
}
