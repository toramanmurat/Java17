package chapter10.streams.creating_stream_sources.example01;

import java.util.List;
import java.util.stream.Stream;

public class CreatingAParallelStream {

	public static void main(String[] args) {
		var list=List.of("a","b","c");
		Stream<String> fromListParallel=list.parallelStream();
		System.out.println(fromListParallel.count());
	}
}
