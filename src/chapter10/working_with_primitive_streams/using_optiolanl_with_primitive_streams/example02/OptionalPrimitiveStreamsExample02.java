package chapter10.working_with_primitive_streams.using_optiolanl_with_primitive_streams.example02;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class OptionalPrimitiveStreamsExample02 {

	public static void main(String[] args) {
		LongStream longs = LongStream.of(5, 10);
		long sum = longs.sum();
		System.out.println(sum);
		DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
		OptionalDouble min = doubles.min(); // runs infinitely
	}
}
