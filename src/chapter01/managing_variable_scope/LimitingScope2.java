package chapter01.managing_variable_scope;

public class LimitingScope2 {

	public static void main(String[] args) {
		int localVariable=10;
		
		if(args!=null) {
//			int localVariable=10; Does Not Compile 
			int size=10;
		}
		
		int size=20;
		
	}
}
