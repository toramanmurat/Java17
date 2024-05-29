package chapter09.working_with_generics.example12;

public class Box {

	public static <T> void ship(T t) {
		System.out.println(t);
	}
}
