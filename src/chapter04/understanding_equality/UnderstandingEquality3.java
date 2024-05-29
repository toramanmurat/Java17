package chapter04.understanding_equality;

public class UnderstandingEquality3 {

	public static void main(String[] args) {

		var name ="a";
		var builder =new StringBuilder("a");
//		System.out.println(name==builder);Does Not Compile. name tipi string, builder tipi StringBuilder
		System.out.println(name+builder);
	}

}
