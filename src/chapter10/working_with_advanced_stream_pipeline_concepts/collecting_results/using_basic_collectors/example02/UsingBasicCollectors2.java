package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.using_basic_collectors.example02;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingBasicCollectors2 {

	public static void main(String[] args) {
		var ohMy = Stream.of("lions", "tigers", "bears");
		Double result = ohMy.collect(Collectors.averagingInt(String::length));
		System.out.println(result); // 5.333333333333333
	}
}
