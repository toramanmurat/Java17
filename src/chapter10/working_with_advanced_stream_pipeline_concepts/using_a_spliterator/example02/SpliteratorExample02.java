package chapter10.working_with_advanced_stream_pipeline_concepts.using_a_spliterator.example02;

import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorExample02 {

	public static void main(String[] args) {
		var originalBag = Stream.iterate(1, n -> ++n).spliterator();
		Spliterator<Integer> newBag = originalBag.trySplit();
		newBag.tryAdvance(System.out::println); // 1
		newBag.tryAdvance(System.out::println); // 2
		newBag.tryAdvance(System.out::println); // 3
		
		
		
		
	}
}
