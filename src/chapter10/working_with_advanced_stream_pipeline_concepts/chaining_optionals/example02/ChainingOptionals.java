package chapter10.working_with_advanced_stream_pipeline_concepts.chaining_optionals.example02;

import java.util.Optional;

public class ChainingOptionals {

	public static void main(String[] args) {
		threeDigit(Optional.of(5));
		threeDigit(Optional.of(50));
		threeDigit(Optional.of(500));
		threeDigit(Optional.of(5000));
	}
	
	private static void threeDigit(Optional<Integer> optional) {
		optional.map(n->""+n).filter(s->s.length()==3).ifPresent(System.out::println);
	}
	
	
}
