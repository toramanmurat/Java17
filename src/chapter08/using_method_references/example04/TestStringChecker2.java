package chapter08.using_method_references.example04;

public class TestStringChecker2 {

	public static void main(String[] args) {
		var str = "";
		StringChecker lambda = () -> str.startsWith("Zoo");
//		StringChecker lambda2 = s -> str.startsWith("Zoo"); //Does Not Compile
//		StringChecker lambda3 = (String s) -> str.startsWith("Zoo"); //Does Not Compile
		
		
//		StringChecker methodReference = str::startsWith; //Does Not Compile
//		StringChecker methodReference = str::startsWith("Zoo"); //Does Not Compile
		

//		System.out.println(methodRef.check()); 
		System.out.println(lambda.check());
	}
}
