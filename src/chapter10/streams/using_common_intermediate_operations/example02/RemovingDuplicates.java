package chapter10.streams.using_common_intermediate_operations.example02;

import java.util.stream.Stream;

public class RemovingDuplicates {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
		s.distinct().forEach(System.out::println); //duck goose
	}
}
