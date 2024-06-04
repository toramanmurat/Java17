package chapter10.working_with_primitive_streams.using_optiolanl_with_primitive_streams.example01;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class OptionalPrimitiveStreamsExample {

	public static void main(String[] args) {
		var stream=IntStream.rangeClosed(1, 10);
		OptionalDouble optionalDouble=stream.average();
		
		optionalDouble.ifPresent(System.out::println); //5.5
		System.out.println(optionalDouble.getAsDouble()); //5.5
		System.out.println(optionalDouble.orElseGet(()->Double.NaN)); //5.5
	}
}
