package chapter01.main_method;

public class Zoo {

	public static void main(String[] args) {
		System.out.println("Hello World !");
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}

// java Zoo.java Bronx Zoo
// Hello World!
// Bronx
// Zoo

// java Zoo.java "San Diego" Zoo
// Hello World!
// "San Diego"
// Zoo

// java Zoo.java Zoo
// Hello World!
// Zoo
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1 at chapter01.mainmethod.Zoo.main(Zoo.java:8)