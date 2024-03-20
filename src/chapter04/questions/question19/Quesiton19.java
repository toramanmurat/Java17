package chapter04.questions.question19;

import java.util.Arrays;

public class Quesiton19 {
	
	public static void main(String[] args) {
		methodA();
		methodB();
		methodC();
		methodD();
		methodE();
		methodF();
	}
	
	private static void methodA() {
		String[] s1 = { "Camel", "Peacock", "Llama"};
		String[] s2 = { "Camel", "Llama", "Peacock"};
		String[] s3 = { "Camel"};
		String[] s4 = { "Camel", null};
		System.out.println("#A :"+Arrays.compare(s1, s2)); // compare--> karsilastir buyukse pozitif, esitse 0, kucukse negatif
	}
	private static void methodB() {
		String[] s1 = { "Camel", "Peacock", "Llama"};
		String[] s2 = { "Camel", "Llama", "Peacock"};
		String[] s3 = { "Camel"};
		String[] s4 = { "Camel", null};
		System.out.println("#B :"+Arrays.mismatch(s1, s2)); // diziler arasinda ki ilk farklı ogenin indexi doner
	}
	private static void methodC() {
		String[] s1 = { "Camel", "Peacock", "Llama"};
		String[] s2 = { "Camel", "Llama", "Peacock"};
		String[] s3 = { "Camel"};
		String[] s4 = { "Camel", null};
		System.out.println("#C :"+Arrays.compare(s3, s4));
	}
	private static void methodD() {
		String[] s1 = { "Camel", "Peacock", "Llama"};
		String[] s2 = { "Camel", "Llama", "Peacock"};
		String[] s3 = { "Camel"};
		String[] s4 = { "Camel", null};
		System.out.println("#D :"+Arrays.mismatch(s3, s4));
	}
	private static void methodE() {
		String[] s1 = { "Camel", "Peacock", "Llama"};
		String[] s2 = { "Camel", "Llama", "Peacock"};
		String[] s3 = { "Camel"};
		String[] s4 = { "Camel", null};
		System.out.println("#E :"+Arrays.compare(s4, s4));
	}
	private static void methodF() {
		String[] s1 = { "Camel", "Peacock", "Llama"};
		String[] s2 = { "Camel", "Llama", "Peacock"};
		String[] s3 = { "Camel"};
		String[] s4 = { "Camel", null};
		System.out.println("#F :"+Arrays.mismatch(s4, s4));
	}

}
