
public class stackBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackBalance balance=new StackBalance();
		String str="{()((([1]+<2>))[[[2]]])()()<><><<>>{}{{}}}";
		System.out.println(balance.stringIsBalance(str));
		
	}

}
