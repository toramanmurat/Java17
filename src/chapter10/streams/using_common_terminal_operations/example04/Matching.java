package chapter10.streams.using_common_terminal_operations.example04;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Matching {

	public static void main(String[] args) {
		var list=List.of("monkey","2","chimp");
		Stream<String> infinite=Stream.generate(()->"chimp");
		Predicate<String> pred=x->Character.isLetter(x.charAt(0));
		
		System.out.println(list.stream().anyMatch(pred)); //true
		System.out.println(list.stream().allMatch(pred)); //false
		System.out.println(list.stream().noneMatch(pred)); //false
		System.out.println(infinite.anyMatch(pred)); //true
	}
}

// boolean anyMatch(Predicate<? super T> predicate);
// boolean noneMatch(Predicate<? super T> predicate);
// boolean allMatch(Predicate<? super T> predicate);
