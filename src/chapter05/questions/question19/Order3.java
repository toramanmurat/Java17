package chapter05.questions.question19;

public class Order3 {
	final String value1 = "red";
	static String value2 = "blue";
	String value3 = "yellow";
	{
	 // CODE SNIPPET 1
//		value1 = "green";
		value2 = "purple";
		value3 = "orange";

	 }
	static {
		// CODE SNIPPET 2
//		value1 = "magenta";
		value2 = "cyan";
//		value3 = "turquoise";
	}

	public static void main(String[] args) {
		Order3 ord=new Order3();
		System.out.println(ord.value1+" "+ord.value3);
		System.out.println(value2);
	}
}
