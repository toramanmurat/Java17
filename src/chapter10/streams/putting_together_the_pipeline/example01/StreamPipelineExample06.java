package chapter10.streams.putting_together_the_pipeline.example01;



import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamPipelineExample06 {
	
	public static void main(String[] args) {
		List<String> helper = Stream.of("goldfish", "finch")
				.filter(s ->
				s.length()> 5)
				.collect(Collectors.toList());
		
		long count=helper.stream().count();
		
		System.out.println(count);
		
	}
	
	
}
