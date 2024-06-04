package chapter10.streams.creating_stream_sources.example02;

import java.util.stream.Stream;

public class CreatingFiniteStreamsExample {
	public static void main(String[] args) {
		Stream<Integer> oddNumberUnder100 = Stream.iterate(1, n -> n < 100, n -> n + 2);
		oddNumberUnder100.forEach(System.out::println);
	}
}
