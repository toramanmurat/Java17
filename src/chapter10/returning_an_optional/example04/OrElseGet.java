package chapter10.returning_an_optional.example04;

import static chapter10.returning_an_optional.example01.OptionalAverage.average;

import java.util.Optional;
import java.util.Random;

public class OrElseGet {

	public static void main(String[] args) {
		Optional<Double> opt = average();

//		System.out.println(opt.orElseGet(()->new IllegalStateException())); //Does Not Compile. Double ?

		Optional<IllegalStateException> opt2 = illegalStateException();

		System.out.println(opt2.orElseGet(() -> new IllegalStateException()));
	}

	private static Optional<IllegalStateException> illegalStateException() {
		return Optional.empty();
	}

}
