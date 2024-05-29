package chapter09.sorting_data.example10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BinarySearch2 {

	public static void main(String[] args) {
		var names=Arrays.asList("Fluffy","Hoppy");
		Comparator<String> c=Comparator.reverseOrder();
		
		var index=Collections.binarySearch(names, "Hoppy",c);
		System.out.println(index); //-1
	}
}
