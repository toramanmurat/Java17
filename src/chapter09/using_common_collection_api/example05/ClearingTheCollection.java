package chapter09.using_common_collection_api.example05;

import java.util.ArrayDeque;
import java.util.Collection;

public class ClearingTheCollection {

	public static void main(String[] args) {
		Collection<String> birds=new ArrayDeque<>();
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.isEmpty()); //false
		System.out.println(birds.size()); //2
		birds.clear();

		System.out.println(birds.isEmpty()); // true
		System.out.println(birds.size()); // 0


	}
}


//public void clear()