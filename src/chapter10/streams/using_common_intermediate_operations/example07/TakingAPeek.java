package chapter10.streams.using_common_intermediate_operations.example07;

import java.util.stream.Stream;

public class TakingAPeek {

	public static void main(String[] args) {
		var stream = Stream.of("black bear", "brown bear", "grizzly");
		long count=stream.filter(s->s.startsWith("g")).peek(System.out::println).count(); //grizzly
		
		System.out.println(count); //1
	}
}

//Stream<T> peek(Consumer<? super T> action)