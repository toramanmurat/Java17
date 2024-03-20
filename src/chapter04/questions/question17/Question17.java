package chapter04.questions.question17;

public class Question17 {
	
	public static void main(String[] args) {
		var letters=new StringBuilder("abcdefg");
		System.out.println(letters.substring(1, 2));
		System.out.println(letters.substring(2, 2));
		System.out.println(letters.substring(6, 5)); // java.lang.StringIndexOutOfBoundsException
		System.out.println(letters.substring(6, 6));
	
		
	}

}
