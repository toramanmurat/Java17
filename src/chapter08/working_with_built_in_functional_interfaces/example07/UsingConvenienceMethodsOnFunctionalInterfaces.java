package chapter08.working_with_built_in_functional_interfaces.example07;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class UsingConvenienceMethodsOnFunctionalInterfaces {

	public static void main(String[] args) {
//		predicateV1Test();
//		predicateV2Test();
//		consumerTest();
		functionTest();

	}

	private static void predicateV1Test() {
		Predicate<String> egg = s -> s.contains("egg");
		Predicate<String> brown = s -> s.contains("brown");

		System.out.println(egg.test("egg test")); // true
		System.out.println(egg.test("test")); // false

		Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
		Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");

		System.out.println(brownEggs.test("egg test")); // false
		System.out.println(otherEggs.test("test")); // false

	}

	private static void predicateV2Test() {

		Predicate<String> egg = s -> s.contains("egg");
		Predicate<String> brown = s -> s.contains("brown");

		Predicate<String> brownEggs = egg.and(brown);
		Predicate<String> otherEggs = egg.and(brown.negate());

		System.out.println(brownEggs.test("egg test")); // false
		System.out.println(otherEggs.test("test")); // false

	}

	private static void consumerTest() {

		Consumer<String> c1 = x -> System.out.print("1: " + x);
		Consumer<String> c2 = x -> System.out.print(",2: " + x);

		Consumer<String> combined = c1.andThen(c2);
		combined.accept("Annie"); // 1: Annie,2: Annie
	}

	private static void functionTest() {
		Function<Integer, Integer> before = x -> x + 1;
		Function<Integer, Integer> after = x -> x * 2;
		Function<Integer, Integer> combined = after.compose(before);
		System.out.println(combined.apply(3)); // 8 ((3+1) *2)

		Function<Integer, Integer> combined2 = before.compose(after);
		System.out.println(combined2.apply(3)); //7 ((3*2)+1)

	}
}
