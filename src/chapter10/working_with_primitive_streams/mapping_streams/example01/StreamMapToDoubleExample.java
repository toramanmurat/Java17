package chapter10.working_with_primitive_streams.mapping_streams.example01;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamMapToDoubleExample {

	public static void main(String[] args) {
		Stream<String> objStream=Stream.of("penguin","fish");
		DoubleStream intStream=objStream.mapToDouble(String::length);
		intStream.forEach(System.out::println);
	}
}
