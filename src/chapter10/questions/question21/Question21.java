package chapter10.questions.question21;

import java.util.stream.Stream;

public class Question21 {

	public static void main(String[] args) {
		var spliterator = Stream.generate(() -> "x").spliterator();
		spliterator.tryAdvance(System.out::print);
		var split = spliterator.trySplit();
		split.tryAdvance(System.out::print); //xx
	}
}
