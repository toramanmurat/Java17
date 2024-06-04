package chapter10.working_with_advanced_stream_pipeline_concepts.chaining_optionals.example01;

import java.util.Optional;

public class ChainingOptionals {

	public static void main(String[] args) {
		threeDigit(Optional.of(5));
		threeDigit(Optional.of(50));
		threeDigit(Optional.of(500));
		threeDigit(Optional.of(5000));
	}
	
	private static void threeDigit(Optional<Integer> optional) {
		if(optional.isPresent()) {
			var num=optional.get();
			var string=""+num;
			if(string.length()==3)
				System.out.println(string);
		}
	}
	
	
}
