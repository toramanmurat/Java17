package chapter10.streams.using_common_intermediate_operations.example03;

import java.util.stream.Stream;

public class RestrictingByPosition {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.iterate(1, n -> n + 1);
		
		s.skip(5).limit(2).forEach(System.out::println); // 6 7
	}
}

//public Stream<T> limit(long maxSize)
//public Stream<T> skip(long n)