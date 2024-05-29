package chapter04.understanding_equality;

public class UnderstandingEquality {

	public static void main(String[] args) {
		var one= new StringBuilder();
		var two=new StringBuilder();
		var three=one.append("a");
		System.out.println(one==two); //false
		System.out.println(one==three); //true
		System.out.println(one.equals(two)); //false
		System.out.println(one.equals(three)); //true

	}

}
