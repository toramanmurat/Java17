package chapter10.returning_an_optional.example03;
import static chapter10.returning_an_optional.example01.OptionalAverage.average;

import java.util.Optional;
public class OrElseThrow2 {

	public static void main(String[] args) {
		Optional<Double> opt=average();
		System.out.println(opt.orElseThrow(()->new IllegalStateException())); //java.lang.IllegalStateException
		
		
	}
}

