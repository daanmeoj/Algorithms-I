
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hash(123456));
		System.out.println(hashString("123456-A"));
		String str="orange";
		System.out.println(str.hashCode());
	}
	
	public static int hash(int number) {
		return number%100;
	}
	
	public static int hashString(String key) {
		int hash =0;
		for(char c:key.toCharArray()) {
			hash+=Integer.valueOf(c);
		}
		return hash%100;
	}

}
