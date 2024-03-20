package chapter04.questions.question12;

public class Question12 {

	public static void main(String[] args) {
		var numbers="012345678".indent(1); //1 bosluk sonuna 
		System.out.println(numbers);
		numbers=numbers.stripLeading();
		System.out.println(numbers);
		System.out.println(numbers.substring(1, 3));
		System.out.println(numbers.substring(7,7));
		System.out.println(numbers.substring(7));
		
	}
}
