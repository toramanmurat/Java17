package chapter08.using_method_references.example07;

public class TestStringCopier {

	public static void main(String[] args) {
		StringCopier methodRef = String::new;
		StringCopier lambda = x -> new String(x);

		var myString = methodRef.copy("Zebra");
		System.out.println(myString.equals("Zebra")); //true
		System.out.println(myString.equals("zebra")); //false

	}
}
