package chapter04.understanding_arrays;

import java.util.Arrays;

public class UsingMetodsWithVarargs {

	public static void main(String... args) {
		System.out.println("#Main Metod");
		varArgs(10,15,20,5,2);


	}

	private static void varArgs(int...number) {
		System.out.println(Arrays.toString(number));
	}

}
