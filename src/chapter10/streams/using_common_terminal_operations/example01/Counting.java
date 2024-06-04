package chapter10.streams.using_common_terminal_operations.example01;

import java.util.stream.Stream;

public class Counting {

	public static void main(String[] args) {
		Stream<String> s=Stream.of("Monkey","gorilla","bonobo");
		System.out.println(s.count()); //3 (long doner)
	}
}
