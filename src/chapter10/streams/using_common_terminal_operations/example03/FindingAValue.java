package chapter10.streams.using_common_terminal_operations.example03;

import java.util.stream.Stream;

public class FindingAValue {

	public static void main(String[] args) {
		Stream<String> s=Stream.of("monkey","gorilla","bonoboo");
		Stream<String> infinite=Stream.generate(()->"chimp");
		
		s.findAny().ifPresent(System.out::println); //monkey
		infinite.findAny().ifPresent(System.out::println); //chimp

	}
}
