package chapter10.returning_an_optional.example02;

import java.util.Optional;

public class OptionalAverage {

	public static Optional<Double> average(int... scores) {
		if(scores.length==0)
			return Optional.empty();
		
		int sum=0;
		for(int score: scores)
			sum+=score;
		
		return Optional.of((double) sum/ scores.length);
	}
}
