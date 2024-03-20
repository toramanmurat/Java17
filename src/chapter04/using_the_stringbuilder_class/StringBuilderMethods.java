package chapter04.using_the_stringbuilder_class;

public class StringBuilderMethods {

	public static void main(String[] args) {
		var sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(sub + " " + len + " " + ch);
	}

}
