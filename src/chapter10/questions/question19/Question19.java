package chapter10.questions.question19;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question19 {

	public static void main(String[] args) {
		code();
		methodA();
		methodB();
		methodC();
	}

	private static void code() {
		System.out.println("#Code");
		List<Integer> x = IntStream.range(1, 6).mapToObj(i -> i).collect(Collectors.toList());
		x.forEach(System.out::print);
		System.out.println();
	}

	private static void methodA() {
		System.out.println("#A");
		IntStream.range(1, 6);

	}

	private static void methodB() {
		System.out.println("#B");
		IntStream.range(1, 6).forEach(System.out::print);
		System.out.println();
	}

	private static void methodC() {
		System.out.println("#C");
		IntStream.range(1, 6).mapToObj(i -> i).forEach(System.out::print);
	}

}
