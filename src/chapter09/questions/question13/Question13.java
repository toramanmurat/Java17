package chapter09.questions.question13;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Question13 {

	public static void main(String[] args) {
		Comparator<Integer> c1 = (o1, o2) -> o2 - o1;
		Comparator<Integer> c2 = Comparator.naturalOrder();
		Comparator<Integer> c3 = Comparator.reverseOrder();
		var list = Arrays.asList(5, 4, 7, 2);
		Collections.sort(list,c2 );
		Collections.reverse(list);
		Collections.reverse(list);
		System.out.println(Collections.binarySearch(list, 2)); //0
		
	}
}
//c1 ve c2 undifined 