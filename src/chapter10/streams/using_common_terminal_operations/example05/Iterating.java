package chapter10.streams.using_common_terminal_operations.example05;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Iterating {

	public static void main(String[] args) {
		Stream<String> s=Stream.of("Monkey","Gorilla","Bonobo");
		s.forEach(System.out::println); //Monkey Gorilla Bonobo

	}
}


// void forEach(Consumer<? super T> action);