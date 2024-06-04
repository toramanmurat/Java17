package chapter10.streams.using_common_intermediate_operations.example06;

import java.util.Comparator;
import java.util.stream.Stream;

public class Sorting {

	public static void main(String[] args) {
		sortedMethod01();
		sortedMethod02();

	}

	static void sortedMethod01() {
		Stream<String> s = Stream.of("brown-", "bear-");
		System.out.println("#Sorthed");
		s.sorted().forEach(System.out::println); // bear- brown-
	}

	static void sortedMethod02() {
		Stream<String> s = Stream.of("brown bear-", "grizzly-");
		System.out.println("#SortedWithComparator");
		s.sorted(Comparator.reverseOrder()).forEach(System.out::println);// grizzly- brown bear-
	}

	static void sortedMethod03() {
		Stream<String> s = Stream.of("brown bear-", "grizzly-");
//		s.sorted(Comparator::reverseOrder); // DOES NOT COMPILE
//		Comparator,which is a functional interface that takes two parameters and returns an int
	}
}

//public Stream<T> sorted()
//public Stream<T> sorted(Comparator<? super T> comparator)