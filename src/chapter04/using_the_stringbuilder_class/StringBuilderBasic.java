package chapter04.using_the_stringbuilder_class;

public class StringBuilderBasic {

	public static void main(String[] args) {

		System.out.println("#StringLoop");
		stringLoop();

		System.out.println("#StringBuilderLoop");
		stringBuilderLoop();
	}

	private static void stringLoop() {
		String alpha="";

		for(char current='a';current <='z';current++) {
			alpha+=current;
		}

		System.out.println(alpha);
	}

	private static void stringBuilderLoop() {
		StringBuilder alpha=new StringBuilder();
		for(char current='a';current <='z';current++) {
			alpha.append(current);
		}

		System.out.println(alpha);

	}
}
