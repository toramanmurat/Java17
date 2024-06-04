package chapter10.returning_an_optional.example05;

import java.util.Optional;
import static chapter10.returning_an_optional.example01.OptionalAverage.average;
public class OrExample {

	public static void main(String[] args) {
		Optional<Double> opt=average();
		System.out.println(opt.or(()-> Optional.of(10.2)));
	}
}
