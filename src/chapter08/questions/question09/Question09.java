package chapter08.questions.question09;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question09 {

	public static void main(String[] args) {
//		 The Consumer interface is good for printing out an existing value. Ok
//		 The Supplier interface is good for printing out an existing value.
//		 The IntegerSupplier interface returns an int. //IntSupplier
//		 The Predicate interface returns an int. //boolean
//		 The Function interface has a method named test().
//		 The Predicate interface has a method named test(). Ok

		Consumer<String> c=System.out::println;
		c.accept("#A-Consume Test ");

		Supplier<String> s=()->"Supplier";
		System.out.println(s.get());

		Predicate<String> p= String::isEmpty;
		System.out.println(p.test("#D- Test"));
	}
}
