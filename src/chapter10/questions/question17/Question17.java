package chapter10.questions.question17;

import java.util.stream.DoubleStream;

public class Question17 {

	public static void main(String[] args) {
		var s = DoubleStream.of(1.2, 2.4);
		s.peek(System.out::println).filter(x -> x > 2).count();
//		1.2
//		2.4
	}

}
