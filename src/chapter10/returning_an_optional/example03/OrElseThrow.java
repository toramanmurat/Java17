package chapter10.returning_an_optional.example03;
import static chapter10.returning_an_optional.example01.OptionalAverage.average;

import java.util.Optional;
public class OrElseThrow {

	public static void main(String[] args) {
		Optional<Double> opt=average();
		System.out.println(opt.orElseThrow()); //java.util.NoSuchElementException
		
		
	}
}

// orElseThrow null ise java.util.NoSuchElementException firlatir. deger var ise value doner