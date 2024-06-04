package chapter10.working_with_primitive_streams.creating_primitive_streams.example01;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WorkingWithPrimitiveStreams {

	public static void main(String[] args) {
		streamReduce();
		streamToInt();
		intStreamSum();
		intStreamAverage();
	}
	
	private static void streamReduce() {
		System.out.println("# streamReduce");
		Stream<Integer> stream = Stream.of(1, 2, 3);
		System.out.println(stream.reduce(0, (s, n) ->s + n)); // 6
	}
	
	private static void streamToInt() {
		Stream<Integer> stream = Stream.of(1, 2, 3);
		System.out.println(stream.mapToInt(x ->x).sum());
	
	}
	
	private static void intStreamSum() {
		System.out.println("## intStream");
		IntStream stream = IntStream.of(1, 2, 3);
		System.out.println(stream.sum());
	}
	
	private static void intStreamAverage() {
		System.out.println("## intStreamAverage");
		IntStream intStream = IntStream.of(1, 2, 3);
		OptionalDouble avg = intStream.average();
		System.out.println(avg.getAsDouble()); // 2.0
	}
}
