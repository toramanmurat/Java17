package chapter08.using_method_references.example05;

public class TestStringTwoParameterChecker {

	public static void main(String[] args) {
		StringTwoParameterChecker methodRef = String::startsWith;
		StringTwoParameterChecker lambda = (s, p) -> s.startsWith(p);
		
		System.out.println(methodRef.check("Zoo", "A")); //false
		System.out.println(lambda.check("Zoo", "Z")); //true
	}
}
