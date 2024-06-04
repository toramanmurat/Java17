package chapter10.questions.question01;

import java.util.stream.Stream;

public class Question01 {

	public static void main(String[] args) {
		var stream=Stream.iterate("", (s)->s+1);
		System.out.println(stream.limit(2).map(x->x+"2")); //java.util.stream.ReferencePipeline$3@548c4f57
//		stream.limit(2).map(x->x+"2").forEach(System.out::print); //212

		
		//terminal operation cagrilmamis. Sinifin ismini yazacaktır.
		
	}
}
