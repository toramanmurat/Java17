package chapter09.questions.question10;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question10 {

	public static void main(String[] args) {
		var list=List.of(1,2,3);
		var set=Set.of(1,2,3);
		var map=Map.of(1,2,3,4);
		
		list.forEach(System.out::print); //123
		System.out.println();
		set.forEach(System.out::print); //132
		System.out.println();
//		map.forEach(System.out::println); //Does Not Compile
//		map.keys().forEach(System.out::print); //Does Not Compile
		map.keySet().forEach(System.out::print); //31
		System.out.println();
		map.values().forEach(System.out::print); //42
//		map.valueSet().forEach(System.out::print);//Does Not Compile
	}
}
