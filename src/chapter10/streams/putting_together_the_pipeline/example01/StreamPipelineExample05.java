package chapter10.streams.putting_together_the_pipeline.example01;



import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamPipelineExample05 {
	
	public static void main(String[] args) {
		long count = Stream.of("goldfish", "finch")
			  .filter(s->s.length()>5) //sonsuz 
			  .collect(Collectors.toList())
			  .stream()
			  .count();
		
		System.out.println(count);
		
	}
	
	
}
