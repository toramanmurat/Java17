package chapter10.questions.question06;

import java.util.stream.Stream;

public class Question06 {

	public static void main(String[] args) {

		methodA(); 
//		methodB(); //infinitely
//		methodC(); // boolean degil Optional doner
//		methodD(); // boolean degil Optional doner
//		methodE(); //infinitely
		
	}

	
	private static void methodA() {
		var s = Stream.generate(() -> "meow");
		var match = s.allMatch(String::isEmpty);
		System.out.println(match);
	}

	private static void methodB() {
		var s = Stream.generate(() -> "meow");
		var match = s.anyMatch(String::isEmpty);
		System.out.println(match);
	}

//	private static void methodC() {
//		var s = Stream.generate(() -> "meow");
//		var match = s.findAny(String::isEmpty);
//		System.out.println(match);
//	}

//	private static void methodD() {
//		var s = Stream.generate(() -> "meow");
//		var match = s.findFirst(String::isEmpty);
//		System.out.println(match);
//	}

	private static void methodE() {
		var s = Stream.generate(() -> "meow");
		var match = s.noneMatch(String::isEmpty);
		System.out.println(match);
	}

}
