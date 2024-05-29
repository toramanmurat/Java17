package chapter05.passing_Data_among_methods;

public class AutoboxingAndUnboxing {

	public static void main(String[] args) {
		int quack = 5;
//		Integer quackquack = Integer.valueOf(quack); // Convert int to Integer
//		int quackquackquack = quackquack.intValue(); // Convert Integer to int

		Integer quackquack = quack; // Autoboxing
		int quackquackquack = quackquack; // Unboxing

		short tail = 8; // Autoboxing
		char p = 'p';
		char paw = p; // Unboxing
		boolean nose = true; // Autoboxing
		Integer e = Integer.valueOf(9);
		long ears = e; // Unboxing, then implicit casting
	}
}
