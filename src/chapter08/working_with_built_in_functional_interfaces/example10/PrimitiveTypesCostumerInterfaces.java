package chapter08.working_with_built_in_functional_interfaces.example10;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

public class PrimitiveTypesCostumerInterfaces {

	public static void main(String[] args) {
		doubleConsumerExample();
		intConsumerExample();
	}

	private static void doubleConsumerExample() {

		System.out.println("#Consumer-Double");

		DoubleConsumer doubleC1 = (value) -> System.out.println(value);
		DoubleConsumer doubleC2 = System.out::println;

		Consumer<Double> doubleC3 = (value) -> System.out.println(value);
		Consumer<Double> doubleC4 = System.out::println;

		doubleC1.accept(1);
		doubleC2.accept(2);
		doubleC3.accept(3.0);
		doubleC4.accept(4D);

	}

	private static void intConsumerExample() {
		System.out.println("#Consumer-Int");

		IntConsumer intC1 = value -> System.out.println(value);
		IntConsumer intC2 = System.out::println;

		Consumer<Integer> intC3 = (value) -> System.out.println(value);
		Consumer<Integer> intC4 = System.out::println;

		intC1.accept(1);
		intC2.accept(2);
		intC3.accept(3);
		intC4.accept(4);

	}
}
