package chapter10.streams.using_common_intermediate_operations.example07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ChangingStateWithPeek {

	public static void main(String[] args) {
		var numbers=new ArrayList<>();
		var letters=new ArrayList<>();
		
		numbers.add(1);
		letters.add('a');
		
		Stream<List<?>> stream=Stream.of(numbers,letters);
		stream.map(List::size).forEach(System.out::print); // 11
		
		Stream<List<?>> bad = Stream.of(numbers, letters);
		bad.peek(x->x.remove(0)).map(List::size).forEach(System.out::print); //00
	}
}

//peek() iceriside herhangi bir degisiklik yapmamaliyiz.