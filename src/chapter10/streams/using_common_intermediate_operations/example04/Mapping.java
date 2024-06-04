package chapter10.streams.using_common_intermediate_operations.example04;

import java.util.stream.Stream;

public class Mapping {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		s.map(String::length).forEach(System.out::println); // 6 7 6
		
	}
}

//public <R> Stream<R> map(Function<? super T, ? extends R> mapper)