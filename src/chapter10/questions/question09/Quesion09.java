package chapter10.questions.question09;

import java.util.stream.LongStream;

public class Quesion09 {

	public static void main(String[] args) {
		var stream = LongStream.of(1, 2, 3);
	}

	private static void methodA() {
		var stream = LongStream.of(1, 2, 3);
		var opt = stream.map(n -> n * 10).filter(n -> n < 5).findFirst();
//		if (opt.isPresent())
//			System.out.println(opt.get()); //Does Not Compile
	
	}

	private static void methodB() {
		var stream = LongStream.of(1, 2, 3);
		var opt = stream.map(n -> n * 10).filter(n -> n < 5).findFirst();
		if (opt.isPresent())
			System.out.println(opt.getAsLong());
	}

	private static void methodC() {
		var stream = LongStream.of(1, 2, 3);
		var opt = stream.map(n -> n * 10).filter(n -> n < 5).findFirst();
//		opt.ifPresent(System.out.println); //Does Not Compile
	}

	private static void methodD() {
		var stream = LongStream.of(1, 2, 3);
		var opt = stream.map(n -> n * 10).filter(n -> n < 5).findFirst();
		opt.ifPresent(System.out::println);
	}

}
