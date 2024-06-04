package chapter10.working_with_advanced_stream_pipeline_concepts.chaining_optionals.example03;

import java.util.Optional;

public class OptionalFlatMapExample {

	public static void main(String[] args) {
		Optional<Integer> optional=Optional.of(100);
		Optional<Integer> result=optional.flatMap(OptionalFlatMapExample::calculator);
		System.out.println(result.get());
		
		Optional<Optional<Integer>> result2=optional.map(OptionalFlatMapExample::calculator);
		Optional<Integer> optiolnal1=result2.get();
		Integer resultv2=optiolnal1.get();
		System.out.println(resultv2);
	}
	
	private static Optional<Integer> calculator(Integer opt){
		return Optional.of(opt*5);
	}
}
