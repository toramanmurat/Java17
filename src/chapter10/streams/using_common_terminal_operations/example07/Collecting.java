package chapter10.streams.using_common_terminal_operations.example07;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collecting {

	public static void main(String[] args) {
		collectMetod();
		collectMethod02();
		collectMethod03();
		collectMethod04();

	}

	static void collectMetod() {
		Stream<String> stream = Stream.of("w", "o", "l", "f");

		StringBuilder wolf = stream.collect(
				StringBuilder::new,
				StringBuilder::append,
				StringBuilder::append);
		
		System.out.println(wolf); //wolf
	}
	
	static void collectMethod02() {
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		TreeSet<String> set=stream.collect(
				TreeSet::new,
				TreeSet::add,
				TreeSet::addAll
				);
		
		System.out.println(set); //[f, l, o, w]
	}
	
	static void collectMethod03() {
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		TreeSet<String> set=stream.collect(Collectors.toCollection(TreeSet::new));
		
		System.out.println(set); //[f, l, o, w]
		
		
	}
	
	static void collectMethod04() {
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		Set<String> set=stream.collect(Collectors.toSet());
		System.out.println(set); //[f, w, l, o]
	}
}


//<R, A> R collect(Collector<? super T, A, R> collector);

//    <R> R collect(Supplier<R> supplier,
//			BiConsumer<R, ? super T> accumulator,
//			BiConsumer<R, R> combiner);