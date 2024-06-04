package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.collecting_into_maps.example02;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingIntoMaps2 {

	public static void main(String[] args) {
		var ohMy = Stream.of("lions", "tigers", "bears");
		Map<Integer, String> map=ohMy.collect(Collectors.toMap(String::length, k->k)); //bad java.lang.IllegalStateException
		
	}
}
