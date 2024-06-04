package chapter10.streams.using_common_terminal_operations.example06;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Reducing {

	public static void main(String[] args) {
		arrayReduce();
		streamReduce();
		streamReduceConcat();
		intReduce();
		
	}
	
	static void arrayReduce() {
		var array=new String[] {"w","o","l","f"};
		var result="";
		for(var s:array)
			result=result+s;
		
		System.out.println("##Array");
		System.out.println(result);
	}
	
	static void streamReduce() {
		Stream<String> stream=Stream.of("w","o","l","f");
		String word=stream.reduce("",(s,c)->s+c);
		System.out.println("##Stream");
		System.out.println(word); //wolf
		
	}
	
	static void streamReduceConcat() {
		Stream<String> stream=Stream.of("w","o","l","f");
		String word=stream.reduce("", String::concat);
		System.out.println("##Concat");
		System.out.println(word); //wolf
	}
	
	static void intReduce() {
		Stream<Integer> stream=Stream.of(3,5,6);
		System.out.println(stream.reduce(1, (a,b)->a*b)); //90
	}
}

//T reduce(T identity, BinaryOperator<T> accumulator);
//  Optional<T> reduce(BinaryOperator<T> accumulator);
//<U> U reduce(U identity,
//        BiFunction<U, ? super T, U> accumulator,
//        BinaryOperator<U> combiner);