package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.using_basic_collectors.example01;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingBasicCollectors {

	public static void main(String[] args) {
		var ohMy = Stream.of("lions", "tigers", "bears");
		String result = ohMy.collect(Collectors.joining(", "));
		System.out.println(result); // lions, tigers, bears
	}
}
