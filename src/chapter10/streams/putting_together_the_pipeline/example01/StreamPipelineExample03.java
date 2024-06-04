package chapter10.streams.putting_together_the_pipeline.example01;


import java.util.stream.Stream;


public class StreamPipelineExample03 {
	
	public static void main(String[] args) {
		Stream.generate(()->"Else")
			  .filter(n->n.length()==4)
			  .limit(2)
			  .sorted()
			  .forEach(System.out::println); //Else Else
	}
	
	
}
