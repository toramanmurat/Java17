package chapter10.questions.question10;

import java.util.stream.Stream;

public class Question10 {

	public static void main(String[] args) {
		methodA();
		methodB();
		methodC();
		methodE();
		methodF();
		methodG();
	}

	private static void methodA() {
		Stream.generate(() ->"1").filter(x ->x.length()> 1).limit(10);
	}
	private static void methodB() {
		Stream.generate(() ->"1").filter(x ->x.length()> 1).limit(10).peek(System.out::println);
	}
	
	private static void methodC() {
		Stream.generate(() ->"1").filter(x ->x.length()> 1).limit(10).forEach(System.out::println);
	}
	
//	private static void methodD() {
//		Stream.generate(() ->"1").filter(x ->x.length()> 1).limit(10).forEach(System.out::println).peek(System.out::pritln);
//	}
//	
	private static void methodE() {
		Stream.generate(() ->"1").filter(x ->x.length()> 1).peek(System.out::println).forEach(System.out::println);
	}
	
	private static void methodF() {
		Stream.generate(() ->
				"1").limit(10).forEach(System.out::println);
	}
	
	private static void methodG() {
		Stream.generate(() ->
				"1").limit(10).peek(System.out::println);
	}
	
	
	
	
}
