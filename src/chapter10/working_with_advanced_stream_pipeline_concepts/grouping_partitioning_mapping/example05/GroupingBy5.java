package chapter10.working_with_advanced_stream_pipeline_concepts.grouping_partitioning_mapping.example05;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy5 {

	public static void main(String[] args) {
		var ohMy = Stream.of("lions", "tigers", "bears");
		Map<Integer, Long> map = ohMy.collect(Collectors.groupingBy(String::length, Collectors.counting()));
		System.out.println(map); // {5=2, 6=1}
	}
}
