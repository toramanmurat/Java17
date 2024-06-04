package chapter10.working_with_primitive_streams.creating_primitive_streams.example04;

import java.util.stream.IntStream;

public class IntStreamRange {

	public static void main(String[] args) {
		System.out.println("##Range");
		IntStream range=IntStream.range(1, 6);
		range.forEach(System.out::print); //12345
		
		System.out.println();
		System.out.println("##RangeClosed");
		IntStream rangeClosed=IntStream.rangeClosed(1, 6);
		rangeClosed.forEach(System.out::print); //123456
		
		
		
	}
}
