package chapter08.questions.question08;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Question08 {

	public static void main(String[] args) {
		UnaryOperator<Integer> u = x -> x * x;

//		BiFunction<Integer> f1 = x -> x * x; // BiFunction<T,U,R>;
//		BiFunction<Integer, Integer> f2 = x -> x * x; //BiFunction<T,U,R>;
//		BinaryOperator<Integer, Integer> f3 = x -> x * x;// <Integer>
//		Function<Integer> f4 = x -> x * x; <T,R>
		Function<Integer, Integer> f5 = x -> x * x;
	}
}
