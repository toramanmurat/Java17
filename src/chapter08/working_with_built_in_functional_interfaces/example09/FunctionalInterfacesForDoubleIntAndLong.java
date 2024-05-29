package chapter08.working_with_built_in_functional_interfaces.example09;

import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class FunctionalInterfacesForDoubleIntAndLong {

	public static void main(String[] args) {

		doubleSupplierExample();
		intSupplierExample();
		longSupplierExample();
	}

	private static void doubleSupplierExample() {
		System.out.println("#Supplier-Double");
		DoubleSupplier ds1 = () -> 10.0;
		DoubleSupplier ds2 = () -> Math.random();
		DoubleSupplier ds3 = Math::random;
		DoubleSupplier ds4 = () -> new Random().nextDouble();
		Supplier<Double> s1 = Math::random;
		Supplier<Double> s2 = () -> Math.random();

		System.out.println(ds1.getAsDouble());
		System.out.println(ds2.getAsDouble());
		System.out.println(ds3.getAsDouble());
		System.out.println(ds4.getAsDouble());
		System.out.println(s1.get());
		System.out.println(s2.get());

	}

	private static void intSupplierExample() {
		System.out.println("#Supplier-Int");
		IntSupplier intS1 = () -> 10;
		IntSupplier intS2 = () -> (int) Math.random();
		IntSupplier intS3 = () -> new Random().nextInt();
		Supplier<Integer> intS4= new Random()::nextInt;

		System.out.println(intS1.getAsInt());
		System.out.println(intS2.getAsInt());
		System.out.println(intS3.getAsInt());
		System.out.println(intS4.get());

	}

	private static void longSupplierExample() {
		System.out.println("#Supplier-long");
		LongSupplier longS1 = () -> 10;
		LongSupplier longS2 = new Random()::nextInt;
		LongSupplier longS3 = new Random()::nextLong;

		System.out.println(longS1.getAsLong());
		System.out.println(longS2.getAsLong());
		System.out.println(longS3.getAsLong());

	}

}
