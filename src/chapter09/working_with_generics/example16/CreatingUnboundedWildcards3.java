package chapter09.working_with_generics.example16;

import java.util.ArrayList;
import java.util.List;

public class CreatingUnboundedWildcards3 {

	public static void printList(List<?> list) {
		for (Object x : list)
			System.out.println(x);
		
		//list read-only. bu metodta java herhangi birşey eklememize izin vermez.
	}

	public static void main(String[] args) {
		List<String> keywords = new ArrayList<String>();
		keywords.add("java");
		printList(keywords);
		
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		
		printList(numbers);
	}
}
