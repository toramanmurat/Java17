package chapter10.streams.using_common_intermediate_operations.example05;

import java.util.List;
import java.util.stream.Stream;

public class UsingFlatMap {

	public static void main(String[] args) {
		List<String> zero=List.of();
		var one=List.of("Bonobo");
		var two=List.of("Mama Gorilla","Baby Gorilla");
		
		Stream<List<String>> animals=Stream.of(zero,one,two);
		
		animals.flatMap(m->m.stream()).forEach(System.out::println);
//		Bonobo
//		Mama Gorilla
//		Baby Gorilla
	}
}

// public <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)