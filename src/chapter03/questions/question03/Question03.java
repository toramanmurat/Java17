package chapter03.questions.question03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Question03 {

	public static void main(String[] args) {
		Double[][] doubleArray= {{1.0,2.0},{3.0,4.0}};
		for(Double[] d:doubleArray) {
			System.out.println(Arrays.toString(d));
		}

		System.out.println("\nList--- ");
		List<String> names= new ArrayList<>();
		names.add("Ali");
		names.add("Ayse");


		for(String s:names) {
			System.out.println(s);
		}

//		String str="Murat";
//		for(String s:str) {
//			System.out.println(s);
//		}

		System.out.println("\nchar--- ");
		char[] chars = "murat".toCharArray();
		for(char c:chars) {
			System.out.print(c);
		}

		System.out.println("\n\nset--- ");
		Set<String> names2=Set.of("Ali","Ayse");
		for(String name:names2) {
			System.out.println(name);
		}



	}

}
