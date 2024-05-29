package chapter09.working_with_generics.example17;

import java.util.List;

public class CreatingUpperBounded2 {

	public static void main(String[] args) {
		List<Integer> integers = List.of(1, 3, 9, 7, 6, 20, 14, 13, 18);
		List<Double> doubles = List.of(1.0, 3.5, 9.2, 7.1, 6.8, 20.4, 14.5);

		System.out.println(total(integers));
		System.out.println(total(doubles));
		
		System.out.println("##converted");
		System.out.println(total(integers));
		System.out.println(total(doubles));

	}

	public static long total(List<? extends Number> list) {
		long count = 0;
		for (Number number : list)
			count += number.longValue();
		return count;
	}

	public static long totalConverted(List list) {
		long count = 0;
		for (Object obj : list) {
			Number number = (Number) obj;
			count += number.longValue();
		}
		return count;
	}
}
