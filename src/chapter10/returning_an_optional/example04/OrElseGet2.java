package chapter10.returning_an_optional.example04;
import static chapter10.returning_an_optional.example01.OptionalAverage.average;

import java.util.Optional;
import java.util.Random;
public class OrElseGet2 {
	
	public static void main(String[] args) {
		Optional<Double> opt=average();
		System.out.println(opt.orElseGet(()->Math.random()));
		
		Optional<Double> opt2=average();
		Random random=new Random();
		System.out.println(opt2.orElseGet(random::nextDouble));
	}

}
