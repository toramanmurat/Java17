package chapter10.streams.using_common_terminal_operations.example02;

import java.util.Optional;
import java.util.stream.Stream;

public class FindingTheMinimumAndMaximum {

	public static void main(String[] args) {
		Stream<String> s=Stream.of("monkey","ape","bonobo");
		Optional<String> min=s.min((s1,s2)->s1.length()-s2.length());
		min.ifPresent(System.out::println); //ape
		
		//Steam empty ise false deger doner
		Optional<?> minEmpty=Stream.empty().min((s1,s2)->0);
		System.out.println(minEmpty.isPresent()); //false
		
	}
}

// min()
//  Optional<T> min(Comparator<? super T> comparator);

//max()
// Optional<T> max(Comparator<? super T> comparator);