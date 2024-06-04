package chapter10.streams.creating_stream_sources.example02;

import java.util.stream.Stream;

public class CreatingInfiniteStreams {

	public static void main(String[] args) {
		Stream<Double> randoms=Stream.generate(Math::random);
		Stream<Integer> oddNumbers=Stream.iterate(1, n->n+2);
		
		randoms.forEach(System.out::println); //sonsuz
		oddNumbers.forEach(System.out::println); //sonsuz
		
	}
}
