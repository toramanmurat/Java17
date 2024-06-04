package chapter10.working_with_advanced_stream_pipeline_concepts.grouping_partitioning_mapping.example06;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionBy2 {

	public static void main(String[] args) {
		var ohMy = Stream.of("lions", "tigers", "bears");
		Map<Boolean, List<String>> map = ohMy.collect(Collectors.partitioningBy(s -> s.length() <= 5));
		System.out.println(map); // {false=[tigers], true=[lions, bears]}
	}
}
