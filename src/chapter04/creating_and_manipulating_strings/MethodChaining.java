package chapter04.creating_and_manipulating_strings;

public class MethodChaining {

	public static void main(String[] args) {
		var start = "AniMaL ";
		var trimmed = start.trim(); // "AniMaL"
		var lowercase = trimmed.toLowerCase(); // "animal"
		var result = lowercase.replace('a', 'A'); // "AnimAl"
		System.out.println(result);

		System.out.println("#Example2");
		String result2 = "AniMaL ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result2);

		System.out.println("#Example3");
		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace('C', '3');
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}

}
