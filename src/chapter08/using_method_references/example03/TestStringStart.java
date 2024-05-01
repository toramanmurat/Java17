package chapter08.using_method_references.example03;

public class TestStringStart {

	public static void main(String[] args) {
		
		var str="Zoo";
		StringStart methodRef = str::startsWith;
		StringStart lambda=s-> str.startsWith(s);
		
		System.out.println(methodRef.beginningCheck("A")); //false
		System.out.println(lambda.beginningCheck("Z")); //true
	}
}
