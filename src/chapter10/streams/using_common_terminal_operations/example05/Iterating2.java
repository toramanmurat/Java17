package chapter10.streams.using_common_terminal_operations.example05;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Iterating2 {

	public static void main(String[] args) {
		Stream<Integer> s=Stream.of(1);
//		for(Integer i:s) {}  //Does Not Compile
//		Notice that you can’t use a traditional for loop on a stream.

	}
}


// void forEach(Consumer<? super T> action);