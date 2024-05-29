package chapter04.creating_and_manipulating_strings;

public class SearchingForSubstrings {

	public static void main(String[] args) {
		System.out.println("abc".startsWith("a")); //true
		System.out.println("abc".startsWith("A")); //false

		System.out.println("#EndWith");
		System.out.println("abc".endsWith("c")); //true
		System.out.println("abc".endsWith("a")); //false

		System.out.println("#Contains");
		System.out.println("abc".contains("b")); //true
		System.out.println("abc".contains("B")); //false
	}

}
