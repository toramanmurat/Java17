package chapter05.passing_Data_among_methods;

public class AutoboxingAndUnboxing {

	public static void main(String[] args) {
		int quack = 5;
//		Integer quackquack = Integer.valueOf(quack); // Convert int to Integer
//		int quackquackquack = quackquack.intValue(); // Convert Integer to int

		Integer quackquack = quack; // Autoboxing
		int quackquackquack = quackquack; // Unboxing

		Short tail = 8; // Autoboxing
		Character p = Character.valueOf('p');
		char paw = p; // Unboxing
		Boolean nose = true; // Autoboxing
		Integer e = Integer.valueOf(9);
		long ears = e; // Unboxing, then implicit casting
	}
}
