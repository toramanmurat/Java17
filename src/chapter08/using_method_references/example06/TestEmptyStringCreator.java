package chapter08.using_method_references.example06;

public class TestEmptyStringCreator {

	public static void main(String[] args) {
		EmptyStringCreator methodRef = String::new;
		EmptyStringCreator lambda = () -> new String();

		var myString = methodRef.create();
		System.out.println(myString.equals("Snake")); //false
		System.out.println(lambda.equals("")); //false
	}
}
