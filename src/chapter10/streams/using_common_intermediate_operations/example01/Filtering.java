package chapter10.streams.using_common_intermediate_operations.example01;

import java.util.stream.Stream;

public class Filtering {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		s.filter(x->x.startsWith("m")).forEach(System.out::println); //monkey
		
	}
}


//Stream<T> filter(Predicate<? super T> predicate)