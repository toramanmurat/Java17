package chapter10.returning_an_optional.example02;

import java.util.Optional;
import static chapter10.returning_an_optional.example01.OptionalAverage.average;
public class DealingWithAnEmptyOptional {

	public static void main(String[] args) {
		Optional<Double> opt=average();
		System.out.println(opt.orElse(Double.NaN));
		System.out.println(opt.orElseGet(()->Math.random()));
		
		System.out.println("##");
		Optional<Double> opt2=average(90,100);
		System.out.println(opt2.orElse(Double.NaN));
		System.out.println(opt2.orElseGet(()->Math.random()));
		System.out.println(opt2.orElseThrow());
	}
}
