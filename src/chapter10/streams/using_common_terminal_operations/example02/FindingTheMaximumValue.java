package chapter10.streams.using_common_terminal_operations.example02;

import java.util.Optional;
import java.util.stream.Stream;

public class FindingTheMaximumValue {

	public static void main(String[] args) {
		Stream<String> s=Stream.of("monkey","ape","bonoboo");
		Optional<String> maxValue=s.max((s1,s2)->s1.length()-s2.length());
		maxValue.ifPresent(System.out::println);
	}
}
