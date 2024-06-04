package chapter10.working_with_primitive_streams.mapping_streams.example02;

import java.util.ArrayList;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class UsingFlatMap {

	public static void main(String[] args) {
		var integerList = new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(4);
		integerList.add(3);
		integerList.add(8);
		integerList.add(10);
		integerList.add(7);
		
		IntStream ints = integerList.stream().flatMapToInt(x -> IntStream.of(x));
		ints.forEach(i->System.out.print(i+" "));
		System.out.println();

		DoubleStream doubles = integerList.stream().flatMapToDouble(x -> DoubleStream.of(x));

		LongStream longs = integerList.stream().flatMapToLong(x -> LongStream.of(x));
		
	
		System.out.println("Sum "+doubles.sum());
		System.out.println("max "+longs.max());
	}

}
