package chapter10.questions.question08;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Question08 {

	public static void main(String[] args) {
		intStreamAverage();
        intStreamFindAny();
        intStreamSum();
	}

	private static void intStreamAverage() {
		var is = IntStream.empty();
		OptionalDouble average = is.average();
		System.out.println(average);
	}

	private static void intStreamFindAny() {
		var is = IntStream.empty();
		OptionalInt findAny = is.findAny();
		System.out.println(findAny);
	}

	private static void intStreamSum() {
		var is = IntStream.empty();
		int sum = is.sum();
		System.out.println(sum);
	}
}

// IntStraem, LongStream, DoubleStream uzerinden average metodunu cagırırsak OptionalDouble doner