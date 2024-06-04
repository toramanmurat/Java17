 package chapter10.questions.question05;

import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Question05 {

	public static void main(String[] args) {
//		methodA();
//		methodB();
		methodC();
//		methodD();
//		methodE();
		methodF();
	}
	
//	private static void methodA() {
//		double result=LongStream.of(6L,8L,10L)
//				.mapToInt(x->(int)x)
//				.collect(Collectors.groupingBy(x->x))
//				.keySet()
//				.stream()
//				.collect(Collectors.averagingInt(x->x));
//	}
	
//	private static void methodB() {
//		double result = LongStream.of(6L, 8L, 10L)
//				.mapToInt(x ->x) //casting yapilmasi gerekir.
//				.boxed()
//				.collect(Collectors.groupingBy(x ->x))
//				.keySet()
//				.stream()
//				.collect(Collectors.averagingInt(x ->x));
//	}
	
	private static void methodC() {
		double result = LongStream.of(6L, 8L, 10L)
				.mapToInt(x ->(int) x)
				.boxed()
				.collect(Collectors.groupingBy(x ->x))
				.keySet()
				.stream()
				.collect(Collectors.averagingInt(x ->x));
		
		System.out.println(result);
	}
	
//	private static void methodD() {
//		double result = LongStream.of(6L, 8L, 10L)
//				.mapToInt(x ->(int) x) 
//				.collect(Collectors.groupingBy(x ->x, Collectors.toSet()))
//				.keySet()
//				.stream()
//				.collect(Collectors.averagingInt(x ->x));
//	}
	
//	private  static void methodE() {
//		double result = LongStream.of(6L, 8L, 10L)
//				.mapToInt(x ->x) //casting yapilmasi gerekir.
//				.boxed()
//				.collect(Collectors.groupingBy(x ->x, Collectors.toSet()))
//				.keySet()
//				.stream()
//				.collect(Collectors.averagingInt(x ->x));
//	}
	
	private static void methodF() {
		double result = LongStream.of(6L, 8L, 10L)
				.mapToInt(x ->(int) x)
				.boxed()
				.collect(Collectors.groupingBy(x ->x, Collectors.toSet()))
				.keySet()
				.stream()
				.collect(Collectors.averagingInt(x ->x));
		
		System.out.println(result);
	}
}
