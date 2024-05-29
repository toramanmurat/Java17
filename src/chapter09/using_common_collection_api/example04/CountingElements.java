package chapter09.using_common_collection_api.example04;

import java.util.ArrayList;
import java.util.Collection;

public class CountingElements {

	public static void main(String[] args) {
		Collection<String> birds = new ArrayList<>();
		System.out.println(birds.isEmpty()); // true
		System.out.println(birds.size()); //0
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.isEmpty()); //false
		System.out.println(birds.size()); //2

	}
}

//public boolean isEmpty()
//public int size()