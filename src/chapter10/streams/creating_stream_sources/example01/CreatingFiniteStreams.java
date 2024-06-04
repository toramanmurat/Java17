package chapter10.streams.creating_stream_sources.example01;

import java.util.List;
import java.util.stream.Stream;

public class CreatingFiniteStreams {

	public static void main(String[] args) {
		Stream<String> empty=Stream.empty(); //count=0
		Stream<Integer> singleElement=Stream.of(1); //count=1
		Stream<Integer> fromArray=Stream.of(1,2,3); //count=3
		
		var list=List.of("a","b","c");
		Stream<String> fromList=list.stream(); //count=3
		
		System.out.println(empty.count());
		System.out.println(singleElement.count());
		System.out.println(fromArray.count());
		System.out.println(fromList.count());
		
		
		
		
	} 
}
