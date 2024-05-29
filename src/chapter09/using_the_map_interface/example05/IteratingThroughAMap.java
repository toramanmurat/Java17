package chapter09.using_the_map_interface.example05;

import java.util.HashMap;
import java.util.Map;

public class IteratingThroughAMap {

	public static void main(String[] args) {
		Map<Integer, Character> map = new HashMap<>();
		map.put(1, 'a');
		map.put(2, 'b');
		map.put(3, 'c');
		map.put(4, 'a');
		map.forEach((k,v)->System.out.println(v)); // a b c a
		map.values().forEach(System.out::println); //a b c a
		
		map.entrySet().forEach(e -> System.out.println(e.getKey()+" " + e.getValue()));
//		1 a
//		2 b
//		3 c
//		4 a
		
	}
}
