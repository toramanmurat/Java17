package chapter09.using_common_collection_api.example02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class AddingData {

	public static void main(String[] args) {
		Collection<String> list = new ArrayList<>();
		System.out.println(list.add("Sparrow")); // true
	    System.out.println(list.add("Sparrow")); // true

	    Collection<String> set = new HashSet<>();
	    System.out.println(set.add("Sparrow")); // true
	    System.out.println(set.add("Sparrow")); // false
	}
}

// public boolean add(E element)