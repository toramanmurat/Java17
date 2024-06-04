package chapter10.questions.question12;

import java.util.Set;
import java.util.stream.Stream;

public class Question12 {

	public static void main(String[] args) {
		Set<String> birds = Set.of("oriole", "flamingo");
//		Stream.concat(birds.stream(), birds.stream(), birds.stream()).sorted() // line X
//				.distinct().findAny().ifPresent(System.out::println);
	}
}

// Stream.concat() 2 parametre alir.