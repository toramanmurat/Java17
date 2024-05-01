package chapter08.using_method_references.example02;

public class TestCallingMetods {

	public static void main(String[] args) {
		Converter methodRef = Math::round;
		Converter lambda = x -> Math.round(x);
		
		System.out.println(methodRef.round(100.1));
		System.out.println(lambda.round(100.1));
	}
}
