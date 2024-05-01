package chapter08.using_method_references.example04;

public class TestStringChecker {

	public static void main(String[] args) {
		var str="";
		StringChecker methodRef= str::isEmpty;
		StringChecker lambda= () ->str.isEmpty();
		
		System.out.println(methodRef.check()); //true 
		System.out.println(lambda.check()); //true
	}
}
