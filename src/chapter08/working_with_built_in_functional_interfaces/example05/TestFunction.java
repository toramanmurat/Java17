package chapter08.working_with_built_in_functional_interfaces.example05;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = x -> x.length();

		System.out.println(f1.apply("cluck")); // 5
		System.out.println(f2.apply("cluck")); // 5

		BiFunction<String, String, String> b1 = String::concat;
		BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);

		System.out.println(b1.apply("baby ", "chick")); // baby chick
		System.out.println(b2.apply("baby ", "chick")); // baby chick

	}
}
