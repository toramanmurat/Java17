package chapter10.streams.putting_together_the_pipeline.example01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StreamPipelineExample01 {
	
	public static void main(String[] args) {
		notStreamPipeline();
		useStreamPipeline();
	}
	
	private static void notStreamPipeline() {
		var list = List.of("Toby", "Anna", "Leroy", "Alex");
		List<String> filtered=new ArrayList<>();
		for(String name:list) {
			if(name.length()==4)
				filtered.add(name);
		}

		
		Collections.sort(filtered);
		var iter=filtered.iterator();
		if(iter.hasNext())
			System.out.println(iter.next()); //Alex
		if(iter.hasNext())
			System.out.println(iter.next()); //Anna
			
	}
	
	private static void useStreamPipeline() {
		var list = List.of("Toby", "Anna", "Leroy", "Alex");
		System.out.println("##StreamPipeline");
		list.stream()
			.filter(n->n.length()==4)
			.sorted()
			.limit(2)
			.forEach(System.out::println); // Alex Anna
	}
}
