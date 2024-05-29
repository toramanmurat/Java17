package chapter09.working_with_generics.example16;

import java.util.ArrayList;
import java.util.List;

public class CreatingUnboundedWildcards2 {

	public static void sample() {
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(Integer.valueOf(42));
		
//		List<Object> objects = numbers; // DOES NOT COMPILE
//		objects.add("forty two");
//		System.out.println(numbers.get(1));
		
	}

	public static void main(String[] args) {
		sample();
	}
}
