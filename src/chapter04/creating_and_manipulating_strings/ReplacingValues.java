package chapter04.creating_and_manipulating_strings;

public class ReplacingValues {
	
	public static void main(String[] args) {
		
		System.out.println("abcabc".replace('a', 'A')); //AbcAbc
		System.out.println("abcabc".replace("b", "B")); //aBcaBc
		System.out.println("abcabc".replace("c", "CD")); //abCDabCD
	}

}
