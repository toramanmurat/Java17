package chapter04.understanding_equality;

public class StringIntern {

	public static void main(String[] args) {
		var name = "Hello World";
		var name2 = new String("Hello World").intern();
		//intern metodunu kullanirsak poolda varsa onu doner
		System.out.println(name == name2); // true
	}

}
