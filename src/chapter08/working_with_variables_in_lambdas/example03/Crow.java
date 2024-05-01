package chapter08.working_with_variables_in_lambdas.example03;

import java.util.function.Consumer;

public class Crow {
	private String color;

	private static int size = 10;

	public void caw(String name) {
		String volume = "loudly";
		Consumer<String> consumer = s -> {
			s = "new-value";
			System.out.println(name + " says " + volume + " that she is " + color + " size: " + size + " " + s);
		};
		consumer.accept("not-used");
	}

	public static void main(String[] args) {

		Crow crow = new Crow();
		crow.color = "black";
		crow.caw("BlackCrow");
	}
}
