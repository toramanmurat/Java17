package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.collecting_into_maps.example01;

import java.util.Map;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingIntoMaps {

	public static void main(String[] args) {
		var ohMy = Stream.of("lions", "tigers", "bears");
		Map<String, Integer> map=ohMy.collect(
				Collectors.toMap(s->s, String::length));
		System.out.println(map); //{lions=5, bears=5, tigers=6}
	}
}
