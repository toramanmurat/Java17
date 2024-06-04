package chapter10.streams.putting_together_the_pipeline.example01;


import java.util.stream.Stream;


public class StreamPipelineExample04 {
	
	public static void main(String[] args) {
		Stream.generate(()->"Olaf Lazisson")
			  .filter(n->n.length()==4) //sonsuz 
			  .limit(2)
			  .sorted()
			  .forEach(System.out::println); 
	}
	
	
}
