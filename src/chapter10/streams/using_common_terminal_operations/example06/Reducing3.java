package chapter10.streams.using_common_terminal_operations.example06;

import java.util.stream.Stream;

public class Reducing3 {

	public static void main(String[] args) {
		Stream<String> stream=Stream.of("w","o","l","f!");
		int length=stream.reduce(0,(i,s)->i+s.length(),(a,b)->a+b);
		System.out.println(length); //5
				
	}
}
